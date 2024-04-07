package org.qubemc.launcher.api.manifest.arguments;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Feature {

    @JsonAlias("isDemoUser")
    private Boolean isDemoUser;

    @JsonAlias("hasCustomResolution")
    private Boolean hasCustomResolution;

    @JsonAlias("hasQuickPlaysSupport")
    private Boolean hasQuickPlaysSupport;

}
