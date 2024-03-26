package org.qubemc.launcher.api.manifest.arguments;

import lombok.Data;
import org.qubemc.launcher.api.manifest.Rules;

import java.util.List;

@Data
public class JvmArgument {

    private List<String> baseArguments;

    private List<Rules> ruleArguments;

}
