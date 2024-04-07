package org.qubemc.launcher.api.manifest;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class AssetIndex {

    @JsonAlias("id")
    private String id;

    @JsonAlias("sha1")
    private String sha1;

    @JsonAlias("size")
    private Long size;

    @JsonAlias("totalSize")
    private Long totalSize;

    @JsonAlias("url")
    private String url;

}
