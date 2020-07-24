package oopTest;

class Author{
	private static String name;
	private String email;
	private char gender;
	public Author() {}
	public Author(String name, String email, char gender) {
		Author.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public static String getName() {
		return name;
	}
	public void setName(String newname) {
		Author.name = newname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String newemail) {
		this.email = newemail;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char newgender) {
		this.gender = newgender;
	}
	public void authorInfo() {
		System.out.println("Name: " + name );
		System.out.println("Email: " + email );
		System.out.println("Gender: " + gender + '\n' );
	}
}

class Book{
	private String name;
	private double price;
	private int qty;
	public Book() {}
	
	public String getName() {
		return name;
	}
	public void setName(String newname) {
		this.name = newname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double newprice) {
		this.price = newprice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int newqty) {
		this.qty = newqty;
	}
	public Book(String name, Author author, double price, int qty) {
		setName(name);
		setPrice(price);
		setQty(qty);
	}
	public void bookInfo() {
		System.out.println("Book name: " + name );
		System.out.println("Author name: " + Author.getName());
		System.out.println("Price: " + price*qty );
		System.out.println("Qty: " + qty + '\n');
	}
	
}

public class AuthorBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author();
		a.setName("Juu");
		a.setEmail("juu1234@gmail.com");
		a.setGender('F');
		a.authorInfo();
		
		Book b = new Book();
		b.setName("EssentialMoe");
		b.setPrice(2000);
		b.setQty(2);
		b.bookInfo();
	}

}
