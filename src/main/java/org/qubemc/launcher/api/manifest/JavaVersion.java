package org.qubemc.launcher.api.manifest;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class JavaVersion {

    @JsonAlias("component")
    private String component;

    @JsonAlias("majorVersion")
    private String majorVersion;

}
