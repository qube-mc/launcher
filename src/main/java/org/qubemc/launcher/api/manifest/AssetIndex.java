package org.qubemc.launcher.api.manifest;

import lombok.Data;

@Data
public class AssetIndex {

    private String id;

    private String sha1;

    private Long size;

    private Long totalSize;

    private String url;

}
