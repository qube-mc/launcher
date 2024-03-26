package org.qubemc.launcher;

import org.qubemc.launcher.configuration.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		ApplicationConfigurationProperties.class,
		Repositories.class,
		LauncherMetaRepository.class,
		VersionManifest.class,
		PistonMetaRepository.class
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
