package org.qubemc.launcher.api.manifest;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import org.qubemc.launcher.api.manifest.arguments.Feature;

@Data
public class Rule {

    @JsonAlias("action")
    private String action;

    @JsonAlias("features")
    private Feature features;

    @JsonAlias("os")
    private Os os;

}
