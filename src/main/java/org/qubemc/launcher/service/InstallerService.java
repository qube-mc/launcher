package org.qubemc.launcher.service;

import org.qubemc.launcher.common.Phrases;
import org.qubemc.launcher.common.UnknownVersionException;
import org.qubemc.launcher.common.Versions;
import org.qubemc.launcher.configuration.ApplicationConfigurationProperties;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class InstallerService {

    private final ApplicationConfigurationProperties applicationConfigurationProperties;

    public InstallerService(ApplicationConfigurationProperties applicationConfigurationProperties) {
        this.applicationConfigurationProperties = applicationConfigurationProperties;
    }

    public String install(String versionValue) {
        try {
            Versions version = Versions.versionOf(versionValue);
            String user = System.getProperty("user.name");
            File file = new File(String.format(applicationConfigurationProperties.getInstaller().getWindows().getBaseDir(), user));
            return String.valueOf(file.mkdirs());
        } catch (UnknownVersionException e) {
            return Phrases.UNKNOWN_VERSION;
        }
    }

}
