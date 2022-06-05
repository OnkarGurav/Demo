package collection;
import java.util.*;
import java.io.*;
import java.sql.DriverManager;
public class Propertiesdemo {

	   public static void main(String[] args) {
		Properties p=new Properties();
	//	FileInputStream fis= new FileInputStream("db.properties");
	//	p.load(fis);
		String url=p.getProperty("url");
		String pwd=p.getProperty("pwd");
		String user=p.getProperty("user");
		//Connection con=
	//			DriverManager.getConnection(url,user,pwd);
		
	}
}
