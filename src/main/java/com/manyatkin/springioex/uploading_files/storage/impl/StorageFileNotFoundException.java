package com.manyatkin.springioex.uploading_files.storage.impl;

public class StorageFileNotFoundException extends StorageException {

  public StorageFileNotFoundException(String message) {
    super(message);
  }

  public StorageFileNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
