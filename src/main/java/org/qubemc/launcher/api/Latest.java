package org.qubemc.launcher.api;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Latest {

    @JsonAlias("release")
    private String release;

    @JsonAlias("snapshot")
    private String snapshot;

}
