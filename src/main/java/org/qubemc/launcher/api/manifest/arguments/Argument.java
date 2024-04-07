package org.qubemc.launcher.api.manifest.arguments;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.qubemc.launcher.api.manifest.Rules;

import java.util.List;

@Data
@AllArgsConstructor
public class Argument {

    private List<String> baseArguments;

    private List<Rules> ruleArguments;

}
