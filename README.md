# Book-Management

This Java program, named BookManagement, allows users to create and manage bookstore books and library books. It uses the `BookstoreBook` and `LibraryBook` classes to represent different types of books and provides a simple interface for users to input book details.

## How it Works

### BookstoreBook Class

The `BookstoreBook` class represents a book in a bookstore. It includes information such as the author, title, ISBN, price, sale status, and discount. The class provides methods to calculate the discounted price and generate a string representation of the book.

### LibraryBook Class

The `LibraryBook` class represents a book in a library. It includes information such as the author, title, ISBN, call number, floor number, and the number of books. The class provides methods to generate a call number and a string representation of the book.

### Main Class

The `Main` class serves as the main program. It allows users to interactively create bookstore books and library books, providing details such as author, title, ISBN, and more. Users can choose to create multiple books and, at the end, view a summary of all created books, categorized as library books and bookstore books.

## Classes and Methods

### BookstoreBook Class

- `BookstoreBook(String author, String title, String isbn, double price, boolean onSale, double discount)`: Constructor to initialize a bookstore book with optional sale details.
- `BookstoreBook(String author, String title, String isbn, double price)`: Constructor to initialize a bookstore book without sale details.
- `BookstoreBook(String author, String title, String isbn)`: Constructor to initialize a bookstore book with minimal details.
- `String getAuthor()`: Gets the author of the book.
- `void setAuthor(String author)`: Sets the author of the book.
- `String getTitle()`: Gets the title of the book.
- `void setTitle(String title)`: Sets the title of the book.
- `String getIsbn()`: Gets the ISBN of the book.
- `void setIsbn(String isbn)`: Sets the ISBN of the book.
- `double getPrice()`: Gets the list price of the book.
- `void setPrice(double price)`: Sets the list price of the book.
- `boolean isOnSale()`: Checks if the book is on sale.
- `void setOnSale(boolean onSale)`: Sets the sale status of the book.
- `double getDiscount()`: Gets the discount percentage of the book.
- `void setDiscount(double discount)`: Sets the discount percentage of the book.
- `double getNumBooks()`: Gets the total number of bookstore books.
- `void setNumBooks(int numBooks)`: Sets the total number of bookstore books.
- `double getDiscountedPrice()`: Calculates the discounted price of the book.
- `String toString()`: Generates a string representation of the bookstore book.

### LibraryBook Class

- `LibraryBook(String author, String title, String isbn)`: Constructor to initialize a library book with minimal details.
- `LibraryBook(String author, String title)`: Constructor to initialize a library book without ISBN.
- `LibraryBook(String author)`: Constructor to initialize a library book with only the author.
- `String getAuthor()`: Gets the author of the book.
- `void setAuthor(String author)`: Sets the author of the book.
- `String getTitle()`: Gets the title of the book.
- `void setTitle(String title)`: Sets the title of the book.
- `String getIsbn()`: Gets the ISBN of the book.
- `void setIsbn(String isbn)`: Sets the ISBN of the book.
- `String getCallNumber()`: Gets the call number of the book.
- `void setCallNumber(String callNumber)`: Sets the call number of the book.
- `int getNumBooks()`: Gets the total number of library books.
- `void setNumBooks(int numBooks)`: Sets the total number of library books.
- `String toString()`: Generates a string representation of the library book.

### Main Class

- `public static void main(String[] args)`: The main method to run the program. It allows users to interactively create bookstore books and library books, then displays a summary of all created books.

## Usage

1. **Compile the Program:**
   - Open a terminal and navigate to the directory containing the program files.
   - Compile the program using the following command:
     ```bash
     javac Main.java
     ```

2. **Run the Program:**
   - After compilation, run the program with the following command:
     ```bash
     java Main
     ```

3. **Interactive Input:**
   - Follow the on-screen prompts to create bookstore books and library books.
   - Provide details such as author, title, ISBN, price, and sale information.

4. **View Output:**
   - The program will display a summary of all created books, categorized as library books and bookstore books.

## Example

```bash
javac Main.java
java Main
