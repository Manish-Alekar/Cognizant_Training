import java.io.*;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path = "C:\\Users\\seed\\Desktop\\javatest\\test1.txt";
		FileOutputStream out =new FileOutputStream(path,true);
		
		String message = "Hello Everyone";
		byte b[] = message.getBytes();
		out.write(b);
		out.close();
		
	}
}
