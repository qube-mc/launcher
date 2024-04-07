package org.qubemc.launcher.api.manifest;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import org.qubemc.launcher.api.manifest.arguments.Arguments;
import org.qubemc.launcher.api.manifest.downloads.Downloads;
import org.qubemc.launcher.api.manifest.libraries.Library;
import org.qubemc.launcher.api.manifest.logging.Logging;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class Manifest {

    @JsonAlias("arguments")
    private Arguments arguments;

    @JsonAlias("assetIndex")
    private AssetIndex assetIndex;

    @JsonAlias("assets")
    private String assets;

    @JsonAlias("complianceLevel")
    private Integer complianceLevel;

    @JsonAlias("downloads")
    private Downloads downloads;

    @JsonAlias("id")
    private String id;

    @JsonAlias("javaVersion")
    private JavaVersion javaVersion;

    @JsonAlias("libraries")
    private List<Library> libraries;

    @JsonAlias("logging")
    private Logging logging;

    @JsonAlias("mainClass")
    private String mainClass;

    @JsonAlias("minimumLauncherVersion")
    private Integer minimumLauncherVersion;

    @JsonAlias("releaseTime")
    private ZonedDateTime releaseTime;

    @JsonAlias("time")
    private ZonedDateTime time;

    @JsonAlias("type")
    private String type;

}
