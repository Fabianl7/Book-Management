import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		       
		BookstoreBook[] bookstoreBooks = new BookstoreBook[100];  
		LibraryBook[] libraryBooks = new LibraryBook[200];   
		
		int bookstoreBooksNum = 0;       
		int libraryBooksNum = 0;
		
		System.out.println("Welcome to the book program!\n");
		        
		String ans = "yes";
		while(ans.equals("yes")){           
			System.out.print("Would you like to create a book object? (yes/no): ");             
			ans = scanner.nextLine();
			            
			if(ans.equals("no")){ break; }
			
			ans = ans.toLowerCase();
			while(!ans.equals("yes")){              
				System.out.printf("I'm sorry but %s isn't a valid answer. Please enter either yes or no: ", ans);
				ans = scanner.nextLine();    
			}
			
			System.out.print("Please enter the author, title and the isbn of the book separated by /: ");                   
			String info = scanner.nextLine();           
		            
			String[] bookInfoArray = info.split("/");               
			String author = bookInfoArray[0];         
			String title = bookInfoArray[1];        
			String isbn = bookInfoArray[2];    
			
			System.out.println("Got it!");                       
			System.out.print("Now, tell me if the book is a bookstore book or a library book (BB/LB) (enter BB for bookstore book and LB for library book): ");
			String bookType = scanner.nextLine();             
			bookType = bookType.toUpperCase();
			             
			while(!bookType.equals("BB") && !bookType.equals("LB")){              
				System.out.print("Oops! That's not a valid entry. Please try again: ");               
				bookType = scanner.nextLine();          
			}         
		
			System.out.println("Got it!");            
			
			title = title.toUpperCase();
			author = author.toUpperCase();
			
			if(bookType.equals("BB")){
				System.out.print("Please enter the list price of " + title + " by " + author + ": ");              
				double price = scanner.nextDouble();           
				scanner.nextLine();
			                
				System.out.print("Is it on sale? (y/n): ");
				String saleStr = scanner.nextLine();
			                 
				boolean onSale = false;
				double discount = 0;
				if(saleStr.equals("y")){
					System.out.print("Deduction percentage: ") ;
					discount = scanner.nextDouble();
					scanner.nextLine();
					onSale = true;
				}
			
				System.out.println("Got it!");
			        
				bookstoreBooks[bookstoreBooksNum] = new BookstoreBook(author, title, isbn, price, onSale, discount);
			              
				System.out.println("\nHere is your bookstore book information: ");
				System.out.println(bookstoreBooks[bookstoreBooksNum].toString()+"\n");
			                 
				bookstoreBooksNum++;
				} 
				else if(bookType.equals("LB")){
					libraryBooks[libraryBooksNum] = new LibraryBook(author, title, isbn);
			
					System.out.println("\nHere is your library book information: ");
					System.out.println(libraryBooks[libraryBooksNum].toString());
			             
					libraryBooksNum++;
				}
			
			}
		
		System.out.println("\nSure!");
		System.out.println("Here are all your books...");
		
		System.out.printf("Library Books(%d)\n", libraryBooksNum);
		for(int i = 0; i<libraryBooksNum; i++) {
			System.out.println("\t" + libraryBooks[i].toString());
		}
		
		System.out.println("----");
		System.out.printf("Bookstore Books(%d)\n", bookstoreBooksNum);
		for(int i = 0; i < bookstoreBooksNum; i++){    
			System.out.println("\t" + bookstoreBooks[i].toString());      
		}
		System.out.println("----");
		System.out.println("Take care now!");
		
		scanner.close();
	}
}

class BookstoreBook {
	private String author;
	private String title;
	private String isbn;
	private double price;
	private boolean onSale;
	private double discount;
	private static int numBooks = 0;
	
	public BookstoreBook(String author, String title, String isbn, double price, boolean onSale, double discount) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.onSale = onSale;
		this.discount = discount;
		numBooks++;
	}
	
	public BookstoreBook(String author, String title, String isbn, double price) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.onSale = false;
		this.discount = 0;
		numBooks++;
	}
	    
	public BookstoreBook(String author, String title, String isbn) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.price = 0;
		this.onSale = false;
		this.discount = 0;
		numBooks++;
	}
	
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getIsbn() { return isbn; }
	public void setIsbn(String isbn) { this.isbn = isbn; }
	 
	public double getPrice() { return price; }      
	public void setPrice(double price) { this.price = price; }      
	  
	public boolean isOnSale() { return onSale; }      
	public void setOnSale(boolean onSale) { this.onSale = onSale; }      
	    
	public double getDiscount() { return discount; }         
	public void setDiscount(double discount) { this.discount = discount; }      
	  
	public double getNumBooks() { return numBooks; }         
	public void setNumBooks(int numBooks) { this.numBooks = numBooks; }
	
	public double getDiscountedPrice() { return price - (price * discount / 100); }      
	    
	public String toString(){             
		return "[" + isbn + "-" + title + " by " + author + ", $" + price + " listed for $" + getDiscountedPrice() + "]";     
	}  
	
}  

class LibraryBook {          
	private String author, title, isbn, callNumber;
	private static int numBooks, floorNumber;  
	
	public LibraryBook(String author, String title, String isbn) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		floorNumber = (int)(Math.random() * (99 - 0) + 1);
		
		this.callNumber = callNumber();
		numBooks++;
	}
	
	public LibraryBook(String author, String title) {        
		this.author = author;
		this.title = title;
		this.isbn = "Not Found";
		floorNumber = (int)(Math.random() * (99 - 0) + 1);
		
		this.callNumber = callNumber();
		numBooks++;
	}
	    
	public LibraryBook(String author) {
		this.author = author;
		this.title = "Not Found";
		this.isbn = "Not Found";
		floorNumber = (int)(Math.random() * (99 - 0) + 1);
		
		this.callNumber = callNumber();
		numBooks++;
	}
	
	private String callNumber() {
		return floorNumber + "." + author.substring(0, 3) + "." + isbn.charAt(isbn.length() - 1);
	}
	
	public String getAuthor() { return author; }  
	public void setAuthor(String author) { this.author = author; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getIsbn() { return isbn; }
	public void setIsbn(String isbn) { this.isbn = isbn; }
	
	public String getCallNumber() { return callNumber; }
	public void setCallNumber(String callNumber) { this.callNumber = callNumber; }
	
	public int getNumBooks() { return numBooks; }
	public void setNumBooks(int numOfBooks) { this.numBooks = numOfBooks; }
	
	public String toString(){
		return "[" + isbn + "-" + title + " by " + author + ", CALL NUMBER: " + callNumber + "]";
	}
}











 