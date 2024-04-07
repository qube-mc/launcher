package org.qubemc.launcher.service;

import org.junit.jupiter.api.Test;
import org.qubemc.launcher.common.UnknownVersionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.NONE
)
class InstallerServiceTest {

    @Autowired
    private InstallerService installerService;

    @Test
    void install() throws UnknownVersionException {
        installerService.install("1.20.4");
    }

}