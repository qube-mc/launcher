package org.qubemc.launcher.configuration;

import lombok.Data;

@Data
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "qubemc")
public class ConfigurationProperties {

    private InstallerConfigurationProperties installer;

    private RepositoriesConfigurationProperties repos;

}
