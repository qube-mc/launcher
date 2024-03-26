package org.qubemc.launcher.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "qubemc.repos.launcher-meta")
public class LauncherMetaRepository {

    private String url;

    private VersionManifest versionManifest;

}
