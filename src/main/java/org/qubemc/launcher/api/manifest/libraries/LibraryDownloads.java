package org.qubemc.launcher.api.manifest.libraries;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import org.qubemc.launcher.api.manifest.Download;

@Data
public class LibraryDownloads {

    @JsonAlias("artifact")
    private Download artifact;

}
