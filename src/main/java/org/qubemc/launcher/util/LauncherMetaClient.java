package org.qubemc.launcher.util;

import org.qubemc.launcher.api.VersionsManifest;
import org.qubemc.launcher.configuration.LauncherMetaConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class LauncherMetaClient {

    private final LauncherMetaConfigurationProperties launcherMetaConfigurationProperties;

    private final WebClient webClient;

    public LauncherMetaClient(LauncherMetaConfigurationProperties launcherMetaConfigurationProperties) {
        this.launcherMetaConfigurationProperties = launcherMetaConfigurationProperties;
        this.webClient = WebClient.create(launcherMetaConfigurationProperties.getUrl());
    }

    public VersionsManifest versionsManifest() {
        return webClient.get()
                .uri(versionsManifestPath())
                .exchangeToMono(clientResponse -> {
                    if (clientResponse.statusCode().is2xxSuccessful()) {
                        return clientResponse.bodyToMono(VersionsManifest.class);
                    } else {
                        throw new RuntimeException(); //TODO: Custom exception
                    }
                })
                .block();
    }

    private String versionsManifestPath() {
        return "mc/game/version_manifest_" + launcherMetaConfigurationProperties.getVersionManifest().getVersion().toString().toLowerCase() + ".json";
    }

}
