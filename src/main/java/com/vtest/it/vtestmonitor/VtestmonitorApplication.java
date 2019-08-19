package com.vtest.it.vtestmonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class VtestmonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(VtestmonitorApplication.class, args);
    }

}
