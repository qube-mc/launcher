package org.qubemc.launcher.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "qubemc.repos")
public class Repositories {

    private LauncherMetaRepository launcherMeta;

    private PistonMetaRepository pistonMeta;

}
