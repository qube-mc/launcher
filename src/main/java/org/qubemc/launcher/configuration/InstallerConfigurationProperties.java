package org.qubemc.launcher.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "qubemc.installer")
public class InstallerConfigurationProperties {

    private WindowsConfigurationProperties windows;

    private OsxConfigurationProperties osx;

    private LinuxConfigurationProperties linux;

}
