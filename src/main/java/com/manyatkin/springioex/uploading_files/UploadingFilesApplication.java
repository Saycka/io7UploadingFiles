package com.manyatkin.springioex.uploading_files;

import com.manyatkin.springioex.uploading_files.storage.impl.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadingFilesApplication {

  public static void main(String[] args) {
    SpringApplication.run(UploadingFilesApplication.class, args);
  }

}
