package org.qubemc.launcher.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "qubemc.repos")
public class RepositoriesConfigurationProperties {

    private LauncherMetaConfigurationProperties launcherMeta;

    private PistonMetaConfigurationProperties pistonMeta;

}
