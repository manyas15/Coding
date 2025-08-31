import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexExample{
	public static boolean isValidEmail(String email){
		String regex="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		String pattern= Pattern.compile(regex);
		String matcher= pattern.matcher(email);
		return matcher.matches();
	}
	public static boolean isValidphone(String phone){
	String regexx= "^[6-9]\\d{9}$";
		return Pattern.matches(regexx,phone);
	}
	public static boolean isValidPassword(String password){
		String regeex= "^(?=.[0-9])(?=.[!@#$%^&])[A-Za-z0-9!@#$%^&]{8,}$";
		Pattern pattern=Pattern.compile(regeex);
		Matcher matcher= pattern.matches(password);
		return matcher.matches();
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter email");
		String email=sc.nextLine();
		System.out.println(isValidEmail(email)?"vaild email":"Invalid email");
		
		System.out.println("Enter your phone number");
		String phone= sc.nextLine();
		System.out.println(isValidphone(phone)?"vaild phone number":"invalid phone number");
		
		System.out.println("Enter your password");
		String password= sc.nextLine();
		System.out.println(isValidPassword(password)?"strong password":"weak password");
		
		sc.close();
	}
}