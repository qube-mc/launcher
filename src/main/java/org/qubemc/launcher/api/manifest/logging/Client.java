package org.qubemc.launcher.api.manifest.logging;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Client {

    @JsonAlias("argument")
    private String argument;

    @JsonAlias("file")
    private File file;

    @JsonAlias("type")
    private String type;

}
