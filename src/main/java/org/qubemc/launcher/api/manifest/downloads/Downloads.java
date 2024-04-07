package org.qubemc.launcher.api.manifest.downloads;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import org.qubemc.launcher.api.manifest.Download;

@Data
public class Downloads {

    @JsonAlias("client")
    private Download client;

    @JsonAlias("clientMappings")
    private Download clientMappings;

    @JsonAlias("server")
    private Download server;

    @JsonAlias("serverMappings")
    private Download serverMappings;

}
