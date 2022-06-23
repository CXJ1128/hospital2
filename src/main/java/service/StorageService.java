package service;

import java.util.List;

import pojo.Storage;

public interface StorageService {
	int save(Storage storage);
	List<Storage>queryAll();
}
