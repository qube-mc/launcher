package org.qubemc.launcher.api.manifest;

import lombok.Data;

@Data
public class Download {

    private String path;

    private String sha1;

    private Long size;

    private String url;

}
