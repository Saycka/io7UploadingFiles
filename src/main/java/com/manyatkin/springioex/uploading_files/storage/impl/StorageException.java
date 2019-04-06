package com.manyatkin.springioex.uploading_files.storage.impl;

public class StorageException extends RuntimeException {

  public StorageException(String message) {
    super(message);
  }

  public StorageException(String message, Throwable cause) {
    super(message, cause);
  }

}
