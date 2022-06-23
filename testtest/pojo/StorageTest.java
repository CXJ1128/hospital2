package pojo;

//import static org.junit.Assert.*;

import org.junit.Test;

public class StorageTest {
	Storage storage=new Storage();
	int id=0;
	String date="";
	int num=0;
	@Test
	public void testGetId() {
		id=storage.getId();
		//fail("Not yet implemented");
		if(id>0) {
			System.out.println("Successfully");
		}
		else {
			System.out.println("error id");
		}
	}

	@Test
	public void testGetDate() {
		//fail("Not yet implemented");
		System.out.println("Successfully");
		
	}

	@Test
	public void testGetNum() {
		num=storage.getNum();
		//fail("Not yet implemented");
		if(id>0) {
			System.out.println("Successfully");
		}
		else {
			System.out.println("error num");
		}
	}

}
