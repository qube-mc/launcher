package org.qubemc.launcher.component;

import org.qubemc.launcher.common.Phrases;
import org.qubemc.launcher.common.UnknownVersionException;
import org.qubemc.launcher.common.Versions;
import org.qubemc.launcher.configuration.ApplicationConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ShellCommandComponent {

    @Autowired
    private ApplicationConfigurationProperties applicationConfigurationProperties;

    @ShellMethod(key = "install")
    public String install(
            @ShellOption String versionValue
    ) {
        try {
            Versions version = Versions.versionOf(versionValue);
            return applicationConfigurationProperties.getRepos().getLauncherMeta().getUrl();
        } catch (UnknownVersionException e) {
            return Phrases.UNKNOWN_VERSION;
        }
    }

}