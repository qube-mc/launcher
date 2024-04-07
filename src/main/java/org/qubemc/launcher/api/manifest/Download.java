package org.qubemc.launcher.api.manifest;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Download {

    @JsonAlias("path")
    private String path;

    @JsonAlias("sha1")
    private String sha1;

    @JsonAlias("size")
    private Long size;

    @JsonAlias("url")
    private String url;

}
