package org.qubemc.launcher.api;

import lombok.Data;

import java.util.List;

@Data
public class VersionsManifest {

    private Latest latest;

    private List<Version> versions;

}
