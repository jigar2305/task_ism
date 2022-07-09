package task10;

import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneDiary {
	
	
	
	public static void main(String[] args) {
		ArrayList<Person> telephone = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			Person p = new Person();

            System.out.println("1: Add new Contact");
            System.out.println("2: Edit Contact");
            System.out.println("3: view Contact");
            System.out.println("4: Remove Contact");
            System.out.println("5: search contect");
            System.out.println("6: Exit From App");

            System.out.println("plese enter anything from above");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                	System.out.println("please enter firstname, lastname,contact number");
                	p.setFirstname(sc.next());
                	p.setLastname(sc.next());
                	p.setNumber(sc.next());
                	telephone.add(p);
                	break;
                  
                case 2:
                	System.out.println("please enter the first name of contact you change");
                    String search = sc.next();
                    
                    for(int i=0; i<telephone.size();i++) {
         
                   if(telephone.get(i).getFirstname().equals(search)) {
                	   
                    System.out.println("1: change firstname");
                    System.out.println("2: change lastname");
                    System.out.println("3: change Contact");
                    int y = sc.nextInt();
                    switch (y) {
                        case 1:
                            System.out.println("Firstname");
                            telephone.get(i).setFirstname(sc.next());
                            break;
                        case 2:
                            System.out.println("Lasttname");
                            telephone.get(i).setLastname(sc.next());
                            break;
                        case 3:
                            System.out.println("contact number");
                            telephone.get(i).setNumber(sc.next());
                            break;
                        default:
                            break;
                    }
                	}
                	}
                	break;
                   
                case 3:
                	System.out.println("your detail");
                	for (Person person : telephone) {
						
                		System.out.println(person.getFirstname()+"  "+person.getLastname()+"  "+person.getNumber());
					}
                	
                	break;
                   
                case 4:
                	System.out.println("please enter the first name of contact you want to delete");
                    String del = sc.next();
                    
                    for(int i=0; i<telephone.size();i++) {
         
                   if(telephone.get(i).getFirstname().equals(del)) {
                	   telephone.remove(i);
                	   
                	}
                	}
                	break;

                case 5:
                	System.out.println("please enter the first name of contact you change");
                    String search1 = sc.next();
                    
                    for(int i=0; i<telephone.size();i++) {
         
                   if(telephone.get(i).getFirstname().equals(search1)) {
                	   System.out.println(telephone.get(i));
                   }
                   }
                	
                	break;
                case 6:
                	System.exit(0);
                	break;
                    
                default:
                    break;
            }

        }

	}

}
class Person{
	private String firstname;
	private String lastname;
	private String number;
	
	
	public String toString() {
		return firstname+lastname+number;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
