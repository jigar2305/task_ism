package task20;
//take 1 file name with entire path

//if file is present count total number of vowels from it.
//if file not present print file not present try again.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter entire path of file");
		String s1 = sc.next();
		sc.close();
		File f = new File(s1);
		if (f.exists()) {
			System.out.println("your file is exist");
			BufferedReader d = new BufferedReader(new FileReader(f));
			int count = 0;
			while (true) {
				int s = d.read();
				if (s == -1) {
					break;
				}
				if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I'
						|| s == 'O' || s == 'U') {
					count++;
				}
			}
			System.out.println("total vowel is  " + count);
			d.close();
		} else {
			System.out.println("your file is not exist in this path");

		}

	}

}
