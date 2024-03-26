package org.qubemc.launcher.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "qubemc")
public class ApplicationConfigurationProperties {

    private InstallerConfigurationProperties installer;

    private RepositoriesConfigurationProperties repos;

}
