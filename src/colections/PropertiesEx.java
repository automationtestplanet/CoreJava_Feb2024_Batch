package colections;

import java.io.*;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception{
		
		File propFile = new File(System.getProperty("user.dir")+"//Files//project.properties");
		FileInputStream propFis = new FileInputStream(new File(System.getProperty("user.dir")+"//Files//project.properties"));
		
		Properties projProp = new Properties();
		projProp.load(propFis);
		
		System.out.println(projProp.getProperty("url"));
		System.out.println(projProp.getProperty("user.name"));
		System.out.println(projProp.getProperty("password"));
		System.out.println(projProp.getProperty("first.name"));
		System.out.println(projProp.getProperty("last.name"));
		
		FileOutputStream  propFos = new FileOutputStream(propFile);
		projProp.setProperty("full.name", "Ram M");
		
	
		projProp.store(propFos, "Raju");
		
		
	}

}
