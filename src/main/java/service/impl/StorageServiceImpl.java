package service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.StorageDao;
import pojo.Storage;
import service.StorageService;
@Service
public class StorageServiceImpl implements StorageService {
	@Autowired
	private StorageDao dao;
	@Override
	public int save(Storage storage){
		return dao.insert(storage);
	}
	@Override
	public List<Storage> queryAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	
}
