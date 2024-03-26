package org.qubemc.launcher.api.manifest.libraries;

import lombok.Data;
import org.qubemc.launcher.api.manifest.Rule;

import java.util.List;

@Data
public class Library {

    private LibraryDownloads downloads;

    private String name;

    private List<Rule> rules;

}
