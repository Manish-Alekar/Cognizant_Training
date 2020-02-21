 
import java.io.FileOutputStream;
import java.util.ArrayList;



public class BookDetails {
	static ArrayList<BookInfo> books = null;
	static {
		books = new ArrayList<>();
		/*BookInfo bk1 = new BookInfo("Mathematics","Manish",250);
		BookInfo bk2 = new BookInfo("Science","Sanket",200);
		BookInfo bk3 = new BookInfo("History","Vijay",180);
		BookInfo bk4 = new BookInfo("Geography","Nimish",150);
		books.add(bk1);
		books.add(bk2);
		books.add(bk3);
		books.add(bk4);
	}
	public static void main(String[] args) {
		String path = "C:\\Users\\seed\\Desktop\\javatest\\Book Details.txt";
		FileOutputStream out =new FileOutputStream(path);
		
	}
}
