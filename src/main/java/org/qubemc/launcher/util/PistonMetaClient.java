package org.qubemc.launcher.util;

import org.qubemc.launcher.api.manifest.Manifest;
import org.qubemc.launcher.configuration.PistonMetaConfigurationProperties;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class PistonMetaClient {

    private final PistonMetaConfigurationProperties pistonMetaConfigurationProperties;

    private final WebClient webClient;

    public PistonMetaClient(PistonMetaConfigurationProperties pistonMetaConfigurationProperties) {
        this.pistonMetaConfigurationProperties = pistonMetaConfigurationProperties;
        this.webClient = WebClient.create(pistonMetaConfigurationProperties.getUrl());
    }

    public Manifest manifest(String url) {
        return WebClient.create(url)
                .get()
                .exchangeToMono(clientResponse -> {
                    if (clientResponse.statusCode().is2xxSuccessful()) {
                        return clientResponse.bodyToMono(Manifest.class);
                    } else {
                        throw new RuntimeException(); //TODO: Custom exception
                    }
                })
                .block();
    }

    public boolean file(Path path, String ulr) {
        try {
            Files.createDirectories(path.resolveSibling(""));
            Mono<DataBuffer> dataBuffer = WebClient.builder()
                    .exchangeStrategies(useHalfOfMaxMemory())
                    .baseUrl(ulr)
                    .build()
                    .get()
                    .exchangeToMono(clientResponse -> {
                        if (clientResponse.statusCode().is2xxSuccessful()) {
                            return clientResponse.bodyToMono(DataBuffer.class);
                        } else {
                            throw new RuntimeException(); //TODO: Custom exception
                        }
                    });
            DataBufferUtils.write(dataBuffer, path).block();
            return Files.exists(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ExchangeStrategies useHalfOfMaxMemory() {
        long halfOfTotalMemory = Runtime.getRuntime().maxMemory() / 2;
        return ExchangeStrategies.builder()
                .codecs(configurer -> configurer.defaultCodecs()
                        .maxInMemorySize((int) halfOfTotalMemory)
                )
                .build();
    }

}
