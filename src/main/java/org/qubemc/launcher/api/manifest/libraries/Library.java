package org.qubemc.launcher.api.manifest.libraries;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import org.qubemc.launcher.api.manifest.Rule;

import java.util.List;

@Data
public class Library {

    @JsonAlias("downloads")
    private LibraryDownloads downloads;

    @JsonAlias("name")
    private String name;

    @JsonAlias("rules")
    private List<Rule> rules;

}
