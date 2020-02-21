import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path = "C:\\Users\\seed\\Desktop\\javatest\\test1.txt";
		String path1 = "C:\\Users\\seed\\Desktop\\javatest\\test2.txt";
		File file = new File(path);
		/*System.out.println("File Name :"+file.getName());
		System.out.println("File Length :"+file.length());
		System.out.println("Parent Name :"+file.getParent());
		//System.out.println("Root Name :"+file.listRoots());*/
		FileInputStream in = new FileInputStream(file);
		BufferedInputStream bin = new BufferedInputStream(in);
		
		FileOutputStream out =new FileOutputStream(path1);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int i;
		while((i=bin.read())!=-1) {
			System.out.print((char)i);
			bout.write(i);
		}
		bout.close();
	}
}
