package org.qubemc.launcher.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "qubemc.repos.piston-meta")
public class PistonMetaRepository {

    private String url;

    private Version version;

}
