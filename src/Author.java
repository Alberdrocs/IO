import java.util.Scanner;

public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	public Author (String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return gender;
	}
	
	public static Author readAuthor() {
		
		Scanner inputValue;
		inputValue = new Scanner(System.in);
		System.out.println("Enter name:");
		String nameT = inputValue.next();
		System.out.println("Enter email:");
		String emailT = inputValue.next();
		String genderT;
		char genderChar;
		System.out.println("Enter gender:");
		genderT=  inputValue.next();;
		genderChar = genderT.charAt(0);
		inputValue.close();
		return new Author(nameT, emailT, genderChar);
	}
	
@Override
	
	public String toString(){
		return name + "(" + gender + ") at email: " + email;
	}
}
