package org.qubemc.launcher.api;


import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum VersionType {

    SNAPSHOT("snapshot"),

    RELEASE("release"),

    OLD_BETA("old_beta"),

    OLD_ALPHA("old_alpha");

    public final String value;

    private static final Map<String, VersionType> FORMAT_MAP = Stream
            .of(VersionType.values())
            .collect(Collectors.toMap(s -> s.value, Function.identity()));

    VersionType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @JsonCreator
    public static VersionType fromString(String string) {
        return Optional
                .ofNullable(FORMAT_MAP.get(string))
                .orElseThrow(() -> new IllegalArgumentException(string));
    }
}
