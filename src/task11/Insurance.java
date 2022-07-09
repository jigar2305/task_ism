package task11;
//Insurance Calc 
//		An insurance company follows following rules to calculate premium.
//		a. If a person’s health is excellent and the person is between 25 and 35 years of age and lives in a
//		city and is a male then the premium is Rs. 4 per thousand.
//		b. If a person satisfies all the above conditions except that the gender is female then the premium is
//		Rs. 3 per thousand.
//		c. If a person’s health is poor and the person is between 25 and 35 years of age and lives in a
//		village and is a male then the premium is Rs. 6 per thousand.
//		d. In all other cases the person is not insured.
//		Take a person's health, age, city and gender as an input and display the premium as per the rule.
import java.util.*;

public class Insurance {
 String health, city, gender;
 byte age;
 Scanner sc = new Scanner(System.in);

 void input() {
     System.out.println("for your health\n1: poor\n2:excellent");
     int n = sc.nextInt();
     switch (n) {
         case 1:
             health = "poor";
             break;
         case 2:
             health = "excellent";
             break;
         default:
             System.out.println("please enter vailid choice");
             break;
     }
     System.out.println("please enter your age");
     age = sc.nextByte();
     System.out.println("whare are you from \n1: city\n2:village");
     int y = sc.nextInt();
     switch (y) {
         case 1:
             city = "city";
             break;
         case 2:
             city = "village";
             break;
         default:
             System.out.println("please enter vailid choice");
             break;
     }
     System.out.println("gender \n1: male\n2:female");
     y = sc.nextInt();
     switch (y) {
         case 1:
             gender = "male";
             break;
         case 2:
             gender = "female";
             break;
         default:
             System.out.println("please enter vailid choice");
             break;
     }
 }

 void insurance() {
     if (age >= 25 && age <= 35) {
         if (city.equals("city")) {
             if (health.equals("excellent")) {
                 if (gender.equals("male")) {
                     System.out.println("your premium is Rs. 4000 per year");
                 } else {
                     System.out.println("your premium is Rs. 3000 per year");
                 }
             } else {
                 System.out.println("you are not insured");
             }
         } else {
             if (gender.equals("male")) {
                 if (health.equals("poor")) {
                     System.out.println("your premium is Rs. 6000 per year");
                 } else {
                     System.out.println("you are not insured");
                 }
             } else {
                 System.out.println("you are not insured");

             }

         }
     } else {
         System.out.println("you are not insured");

     }
 }

 public static void main(String[] args) {
     Insurance i = new Insurance();
     i.input();
     i.insurance();

 }

}
