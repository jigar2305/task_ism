package task21;

import java.io.File;
import java.util.Scanner;

//take 1 folder name with user and count how many java files present in that folder. 
//if user entered wrong directory handle that scenario with proper message. 
public class Countfolder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter entire path of file");
		String s1 = sc.next();
		sc.close();
		int count = 0;
		File f = new File(s1);
		if (f.exists()) {
			File[] list = f.listFiles();
			for (File file : list) {
				if (file.getName().endsWith(".java")) {
					count++;
				}
			}
			System.out.println("total java file:" + count);
		} else {
			System.out.println("your folder is not exist in this path");

		}

	}

}
