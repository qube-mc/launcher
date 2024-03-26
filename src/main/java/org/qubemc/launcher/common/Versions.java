package org.qubemc.launcher.common;

public enum Versions {

    V1_20_1("1.20.4");

    public final String version;

    Versions(String version) {
        this.version = version;
    }

    public String value() {
        return version;
    }

    public static Versions versionOf(String value) throws UnknownVersionException {
        for(Versions version : Versions.values()) {
            if(version.version.equals(value)) {
                return version;
            }
        }
        throw new UnknownVersionException();
    }

}
