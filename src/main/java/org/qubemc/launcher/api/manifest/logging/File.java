package org.qubemc.launcher.api.manifest.logging;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class File {

    @JsonAlias("id")
    private String id;

    @JsonAlias("sha1")
    private String sha1;

    @JsonAlias("size")
    private Long size;

    @JsonAlias("url")
    private String url;

}
