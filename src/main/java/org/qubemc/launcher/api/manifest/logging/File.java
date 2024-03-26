package org.qubemc.launcher.api.manifest.logging;

import lombok.Data;

@Data
public class File {

    private String id;

    private String sha1;

    private Long size;

    private String url;

}
