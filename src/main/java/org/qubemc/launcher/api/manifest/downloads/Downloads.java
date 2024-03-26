package org.qubemc.launcher.api.manifest.downloads;

import lombok.Data;
import org.qubemc.launcher.api.manifest.Download;

@Data
public class Downloads {

    private Download client;

    private Download clientMappings;

    private Download server;

    private Download serverMappings;

}
