package org.qubemc.launcher.api.manifest;

import lombok.Data;
import org.qubemc.launcher.api.manifest.arguments.Arguments;
import org.qubemc.launcher.api.manifest.downloads.Downloads;
import org.qubemc.launcher.api.manifest.libraries.Library;
import org.qubemc.launcher.api.manifest.logging.Logging;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class Manifest {

    private Arguments arguments;

    private AssetIndex assetIndex;

    private String assets;

    private Integer complianceLevel;

    private Downloads downloads;

    private String id;

    private JavaVersion javaVersion;

    private List<Library> libraries;

    private Logging logging;

    private String mainClass;

    private Integer minimumLauncherVersion;

    private ZonedDateTime releaseTime;

    private ZonedDateTime time;

    private String type;

}
