package org.qubemc.launcher.api;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Version {

    @JsonAlias("id")
    private String id;

    @JsonAlias("type")
    private VersionType type;

    @JsonAlias("url")
    private String url;

    @JsonAlias("time")
    private ZonedDateTime time;

    @JsonAlias("releaseTime")
    private ZonedDateTime releaseTime;

    @JsonAlias("sha1")
    private String sha1;

    @JsonAlias("complianceLevel")
    private Integer complianceLevel;

}
