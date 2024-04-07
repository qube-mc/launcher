package org.qubemc.launcher.controller;

import org.qubemc.launcher.common.UnknownVersionException;
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
            @Option String versionValue
    ) throws UnknownVersionException {
        return installerService.install(versionValue);
    }

}