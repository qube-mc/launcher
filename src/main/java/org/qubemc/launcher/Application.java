package org.qubemc.launcher;

import org.qubemc.launcher.configuration.*;
import org.qubemc.launcher.controller.InstallerCommandController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.shell.command.annotation.EnableCommand;

@SpringBootApplication
@EnableCommand({
		InstallerCommandController.class
})
@EnableConfigurationProperties({
        ConfigurationProperties.class,
		InstallerConfigurationProperties.class,
		WindowsConfigurationProperties.class,
		OsxConfigurationProperties.class,
		LinuxConfigurationProperties.class,
		RepositoriesConfigurationProperties.class,
		LauncherMetaConfigurationProperties.class,
		VersionManifestConfigurationProperties.class,
		PistonMetaConfigurationProperties.class
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
