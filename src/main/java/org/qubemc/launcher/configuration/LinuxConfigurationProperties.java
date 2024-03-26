package org.qubemc.launcher.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "qubemc.installer.linux")
public class LinuxConfigurationProperties {

    private String baseDir;

}
