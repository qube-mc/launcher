package org.qubemc.launcher.api.manifest;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.List;

@Data
public class Rules {

    @JsonAlias("rules")
    private List<Rule> rules;

    @JsonAlias("value")
    @JsonDeserialize(using = RulesDeserializer.class)
    private List<String> value;

}
