//class Levis 
// 		name
// 		price
// 		category 
// 		tax 
// 		amount    
//   	methods 
//   		input 
//   		print 
//   		
//   	user can purchase any item from levis . when user purchase they input all the details
//   	of item for levis , tax need to calculate automatically. 
//   	tax is based on price of levis item. 
//   	like, if category is men then tax is 15% 
//   	         category is women then tax is 10% 
//   	         category is student then tax is 5% 
//   	         
//   	once all input done print all response. 
//   	
//   	ex: 
//   	input:
//   	    name : denim jeans  
//   	    price : 1500
//   	    category : men 
//   	    
//   	output : 
//   	  denim jeans 	1500	men 225  1725 
package task3;

import java.util.Scanner;

public class Levis {

	String name;
	int price;
	float amount;
	String category; 
	float tax; 
	int mtax = 15;
	int wtax = 10;
	int ctax = 5;
	
	
	void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter price");
		price = sc.nextInt();
		System.out.println("enter category");
		category = sc.next();
		sc.close();
		if (category.equals("men")) {
			tax = (price*mtax)/100;
			amount = price + tax;
		}
		else if(category.equals("women")){
			tax = (price*wtax)/100;
			amount = price + tax;
		}
		else{
			tax = (price*ctax)/100;
			amount = price + tax;
		}
		
	}
	void Print() {
		System.out.println( name +" " + price +" " + category+ " "+tax+ " "+amount);
	}
	public static void main(String[] args) {
		
 		Levis a = new Levis();
 		a.Input();
 		a.Print();
	}

}
