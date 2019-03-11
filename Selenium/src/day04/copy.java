package day04;


import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;

public class copy {
	@Test
	public void fun() throws IOException{
		FileHandler.copy(new File("E:\\“≥√Ê"), new File("E:\\»À"), ".jpg");
		
	}
}
