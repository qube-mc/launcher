package org.qubemc.launcher.api.manifest;

import lombok.Data;
import org.qubemc.launcher.api.manifest.arguments.Feature;

@Data
public class Rule {

    private String action;

    private Feature features;

    private Os os;

}
