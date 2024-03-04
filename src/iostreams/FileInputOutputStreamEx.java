package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		String filePath = System.getProperty("user.dir")+"\\Files\\Cucumber_Anusha.txt";
		
//		String str = "\"\"";
//		System.out.println(str);
		
		File file1 = new File(filePath);
		FileInputStream fis = new FileInputStream(file1);
		
		System.out.println(fis.available());
		
		byte[] byte1 = new byte[fis.available()];
		
		fis.read(byte1);
		
		for(byte eachByte:byte1)
			System.out.print(eachByte);
		System.out.println();
		
		System.out.println("--------------------------------------------------------------");
		
		String inputData = new String(byte1);
		
		System.out.println(inputData);
		
		System.out.println(inputData.length());
		
		File outputFile = new File(System.getProperty("user.dir")+"\\Files\\OuputData.txt");
		FileOutputStream fos = new FileOutputStream(outputFile);
		
		byte[] byte2 = inputData.getBytes();
		fos.write(byte2);
		
	}

}
