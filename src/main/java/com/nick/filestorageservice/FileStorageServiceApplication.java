package com.nick.filestorageservice;

import com.nick.filestorageservice.config.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class FileStorageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileStorageServiceApplication.class, args);
    }

}
