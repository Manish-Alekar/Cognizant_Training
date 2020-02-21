import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class WriteIntoMultipleFiles {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path1 = "C:\\Users\\seed\\Desktop\\javatest\\a.txt";
		String path2 = "C:\\Users\\seed\\Desktop\\javatest\\b.txt";
		String path3 = "C:\\Users\\seed\\Desktop\\javatest\\c.txt";
		String path4 = "C:\\Users\\seed\\Desktop\\javatest\\d.txt";
		
		/*FileOutputStream out1 =new FileOutputStream(path1);
		FileOutputStream out2 =new FileOutputStream(path2);
		FileOutputStream out3 =new FileOutputStream(path3);
		FileOutputStream out4 =new FileOutputStream(path4);
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		String data = "Write to multiple files";
		byte[] b = data.getBytes();
		bout.write(b);
		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.writeTo(out3);
		bout.writeTo(out4);
		System.out.println("Data copied");*/
		FileInputStream fin1 = new FileInputStream(path1);
		FileInputStream fin2 = new FileInputStream(path2);
		FileInputStream fin3 = new FileInputStream(path3);
		FileInputStream fin4 = new FileInputStream(path4);
		
		Vector v = new Vector();
		v.add(fin1);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);
		Enumeration en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		int i;
		while((i=sis.read())!=-1) {
			System.out.print((char)i);
			//bout.write(i);
		}
	}
}
