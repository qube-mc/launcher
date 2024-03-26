package org.qubemc.launcher.api;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Version {

    private String id;

    private String type;

    private String url;

    private ZonedDateTime time;

    private ZonedDateTime releaseTime;

    private String sha1;

    private Integer complianceLevel;

}
