package org.qubemc.launcher.service;

import org.qubemc.launcher.api.Latest;
import org.qubemc.launcher.api.Version;
import org.qubemc.launcher.api.VersionsManifest;
import org.qubemc.launcher.api.manifest.Manifest;
import org.qubemc.launcher.api.manifest.libraries.LibraryDownloads;
import org.qubemc.launcher.common.Phrases;
import org.qubemc.launcher.common.UnknownVersionException;
import org.qubemc.launcher.configuration.ConfigurationProperties;
import org.qubemc.launcher.util.LauncherMetaClient;
import org.qubemc.launcher.util.PistonMetaClient;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.util.List;

@Service
public class InstallerService {

    private final ConfigurationProperties configurationProperties;

    private final LauncherMetaClient launcherMetaClient;

    private final PistonMetaClient pistonMetaClient;

    public InstallerService(ConfigurationProperties configurationProperties, LauncherMetaClient launcherMetaClient, PistonMetaClient pistonMetaClient) {
        this.configurationProperties = configurationProperties;
        this.launcherMetaClient = launcherMetaClient;
        this.pistonMetaClient = pistonMetaClient;
    }

    public String install(String versionValue) throws UnknownVersionException {
        VersionsManifest versionsManifest = launcherMetaClient.versionsManifest();
        Latest latest = versionsManifest.getLatest();
        List<Version> versions = versionsManifest.getVersions();
        Version version = versions.stream()
                .filter(v -> v.getId().equals(versionValue)).findFirst()
                .or(() -> versions.stream().filter(v -> v.getId().equals(latest.getRelease())).findFirst())
                .orElseThrow(UnknownVersionException::new); //TODO: Custom exception
        Manifest manifest = pistonMetaClient.manifest(version.getUrl());
        String user = System.getProperty(configurationProperties.getInstaller().getWindows().getUserVariableName());
        Path baseDirPath = Path.of(String.format(configurationProperties.getInstaller().getWindows().getBaseDir(), user));
        Path librariesPath = baseDirPath.resolve(configurationProperties.getInstaller().getWindows().getLibrariesDirName());
        manifest.getLibraries().forEach(library -> {
            LibraryDownloads libraryDownloads = library.getDownloads();
            pistonMetaClient.file(librariesPath.resolve(libraryDownloads.getArtifact().getPath()), libraryDownloads.getArtifact().getUrl());
        });
        return Phrases.START_DOWNLOADING;
    }

}
