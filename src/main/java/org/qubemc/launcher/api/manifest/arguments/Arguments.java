package org.qubemc.launcher.api.manifest.arguments;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

@Data
public class Arguments {

    @JsonAlias("game")
    @JsonDeserialize(using = ArgumentDeserializer.class)
    private Argument game;

    @JsonAlias("jvm")
    @JsonDeserialize(using = ArgumentDeserializer.class)
    private Argument jvm;

}
