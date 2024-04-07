package org.qubemc.launcher.api;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class VersionsManifest {

    @JsonAlias("latest")
    private Latest latest;

    @JsonAlias("versions")
    private List<Version> versions;

}
