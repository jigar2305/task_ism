package task2;

//Student 
//		-studentId 
//		-name 
//		-email
//		-password 
//		
//when any student registered studentId will automatically assign 
//an unique number. 
//name email and password will input by student. 
//
//create two methods 1) input 2) print 
//
//
//111111	ram	ram@gmail.com	ram123 
import java.util.*;

public class Student {
	int studentId;
	String name, email, password;

	public Student() {
		studentId = (int) (Math.random() * 100000);
	}

	void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter email");
		email = sc.next();
		System.out.println("enter password");
		password = sc.next();
		sc.close();

	}

	void Print() {
		System.out.println(studentId + " " + name + " " + email + " " + password);

	}

	public static void main(String[] args) {

		Student s = new Student();
		s.Input();
		s.Print();

	}

}
