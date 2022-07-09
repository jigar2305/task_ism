package task14;
//Bank App.

//
//Bank provides various service to the user  like deposit money, wid money and customer can check balance. 
//Bank have some conditions. 
//Customer have to maintain 5000 min balance. 
//Customer can perform max 5  transaction and then customer is charged 10 Rs per transaction.
//Customer can access bank app via Username/Password. 
//Customers have an account number which is generated via random algo. 
//
//Menu
//Login
//Exit 
//
//	1.1 wid
//	1.2 Dep 
//	1.3 CheckBal 
//	1.4 Logout 

import java.util.ArrayList;
import java.util.Scanner;

public class Bankb {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ArrayList<Buser> user = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Buser bb = new Buser();
		while (true) {
			System.out.println("1. regidter\n2. login \n3. exit");
			int q = sc.nextInt();
			switch (q) {

			case 1:
				System.out.println("please enter name");
				bb.setName(sc.next());
				System.out.println("please enter password");
				bb.setPassword(sc.next());
				System.out.println("please enter bank deposite");

				while (true) {
					int dep = sc.nextInt();
					if (dep > 5001) {
						bb.setBalance(dep);
						user.add(bb);
						break;
					} else {
						System.out.println("please deposite more than 5000 Rs.");
					}
				}
				break;

			case 2:
				System.out.println("please enter name");
				String lname = sc.next();
				System.out.println("please enter password");
				String lpassword = sc.next();
				for (int i = 0; i < user.size(); i++) {
					if (user.get(i).getName().equals(lname) && user.get(i).getPassword().equals(lpassword)) {

						while (true) {
							String flag = "pp";
							System.out.println("1. withdrawal \n2. Deposite \n3. CheckBal \n4. Logout");
							int l = sc.nextInt();
							switch (l) {

							case 1:
								System.out.println("how much do you want withdrawal");
								int w = sc.nextInt();
								for (int j = 0; j < user.size(); j++) {
									if (user.get(i).getName().equals(lname)
											&& user.get(i).getPassword().equals(lpassword)) {
										if (user.get(i).getBalance() - w >= 5000) {
											if (user.get(i).getTransaction()> 4) {
												user.get(i).setBalance(user.get(i).getBalance() - (w +10));
												System.out.println("you have charge 10 extra for this transaction");
											} else {
												user.get(i).setBalance(user.get(i).getBalance() - w);
											}
											user.get(i).setTransaction(user.get(i).getTransaction()+1);
											System.out.println("your balance is " + (user.get(i).getBalance()) + ".");
										} else {
											System.out.println("you have not sufficient balance you can only withdraw "
													+ (user.get(i).getBalance() - 5000) + ".");
										}
									}
								}
								break;

							case 2:
								System.out.println("how much do you want deposite");
								int z = sc.nextInt();
								for (int j = 0; j < user.size(); j++) {
									if (user.get(i).getName().equals(lname)
											&& user.get(i).getPassword().equals(lpassword)) {
										user.get(i).setBalance(user.get(i).getBalance() + z);
										System.out.println("your balance is " + (user.get(i).getBalance()) + ".");

									}
								}
								break;

							case 3:
								for (int j = 0; j < user.size(); j++) {
									if (user.get(i).getName().equals(lname)
											&& user.get(i).getPassword().equals(lpassword)) {
										System.out.println("your balance is " + user.get(i).getBalance() + ".");
									}
								}
								break;

							case 4:
								flag = "qq";
								break;

							default:
								System.out.println("please enter valid choice");
								break;
							}
							if (flag.equals("qq")) {
								break;
							}
						}
					} else {
						System.out.println("invalid user please register first");
					}

				}
				break;

			case 3:
				System.exit(0);
				break;

			default:
				System.out.println("please enter valid choice");
				break;
			}
		}
	}

}

class Buser {
	private int accountid;
	private String name;
	private String password;
	private int balance;
	private int transaction;

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTransaction() {
		return transaction;
	}

	public void setTransaction(int transaction) {
		this.transaction = transaction;
	}

}