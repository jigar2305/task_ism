package task19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//take 10 numbers from user. now read that number and store into odd.txt if number is odd and 
//store into 	even.txt if number is even.
public class Fileevenodd {

	public static void main(String[] args) throws IOException {
		File e = new File("E:\\even.txt");
		File o = new File("E:\\odd.txt");
		File dd = new File("E:\\num.txt");
		Scanner sc = new Scanner(System.in);
		PrintWriter demo = new PrintWriter(dd);
		System.out.println("please enter");
		for (int i = 0; i < 10; i++) {
				demo.println(sc.nextInt());
			}
		demo.close();
		PrintWriter f = new PrintWriter(e);
		PrintWriter d = new PrintWriter(o);
		BufferedReader b = new BufferedReader(new FileReader(dd));
		
		
		while(true) {
			String str = b.readLine();
			if (str == null) {
				break;}
			if (Integer.parseInt(str) % 2 == 0) {
				f.println(str);
			} else {
				d.println(str);
			}
			
		}
		f.close();
		d.close();
		b.close();

	}

}
