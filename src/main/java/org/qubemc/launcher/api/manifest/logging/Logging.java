package org.qubemc.launcher.api.manifest.logging;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Logging {

    @JsonAlias("client")
    private Client client;

}
