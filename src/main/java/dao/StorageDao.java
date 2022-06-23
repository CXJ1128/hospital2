package dao;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import pojo.Storage;

public interface StorageDao {
	@Insert("insert into storage(id,date,num)values(#{id},#{date},#{num})")
	int insert(Storage storage);
	@Select("select * from storage")
	@ResultType(Storage.class)
	List<Storage>selectAll();

}
