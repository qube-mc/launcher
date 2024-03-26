package org.qubemc.launcher.api.manifest;

import lombok.Data;

import java.util.List;

@Data
public class Rules {

    private List<Rule> rules;

    private List<String> value;

}
