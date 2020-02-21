import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookInfo {
	String name;
	String author;
	int price;
	public BookInfo() {
	}
	public BookInfo(String name,String author,int price)
	{
		super();
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	static ArrayList<BookInfo> books = new ArrayList<>();
	//books = new ArrayList<>();
	
	/*public void addBook(BookInfo book)
	{
		books.add(book);
	}*/
	
	public static void main(String[] args) throws Exception {
		int ch;
		String line;
		String path="C:\\\\Users\\\\seed\\\\Desktop\\\\javatest\\\\Book Details.txt";
		FileWriter out = new FileWriter(path,true);
		FileReader in = new FileReader(path);
		System.out.println("-------Book Details-------");
		do {
		System.out.println("Enter your choice");
		System.out.println("1. Add Book details");
		System.out.println("2. Display book details");
		System.out.println("3. Exit");
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		ch=Integer.parseInt(br.readLine());
		
		//String name=sc.nextLine();
		//String author=sc.nextLine();
		//int price=sc.nextInt();
		switch(ch)
		{
			case 1:
				
				System.out.println("Enter book name");
				String name=br.readLine();
				System.out.println("Enter author name");
				String author=br.readLine();
				System.out.println("Enter book price");
				int price=Integer.parseInt(br.readLine());
				
				out.write(name+"\t"+author+"\t"+price+"\n");
				out.flush();
				break;
			case 2:
				BufferedReader read = new BufferedReader(new FileReader(path)); 
				while ((line = read.readLine())!= null) { 
	               System.out.println(line);
	           }
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid data");
		}
				
	}while(ch!=3);
		out.close();
		
	}
}

