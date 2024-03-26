package org.qubemc.launcher.controller;

import org.qubemc.launcher.service.InstallerService;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;

@Command
public class InstallerCommandController {

    private final InstallerService installerService;

    public InstallerCommandController(InstallerService installerService) {
        this.installerService = installerService;
    }

    @Command(command = "install")
    public String install(
            @Option(defaultValue = "1.20.4") String versionValue
    ) {
        return installerService.install(versionValue);
    }

}