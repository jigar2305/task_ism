package task22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PalindromeThread extends Thread  {
	int n;
	int a;
	int b;
	public PalindromeThread(int a,int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		try{
		for(int i=a;i<b;i++) {
			
	        String line = Files.readAllLines(Paths.get("E:\\name.txt")).get(i);
	        String s = line.toLowerCase();
	        StringBuilder name = new StringBuilder(s);
			StringBuilder j = name.reverse();
			if (s.contentEquals(j)) {
				System.out.println(line + "--------- is palindrome"+"--------------------------"+i);
			}
	      } 
		}
	      catch(IOException e){
	        System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {

	      // read all lines of the file
	      long count = Files.lines(Paths.get("E:\\name.txt")).count();
	      int num = (int)count;
	      PalindromeThread a = new PalindromeThread(0, num/10);
	      PalindromeThread b = new PalindromeThread(num/10,num/8);
	      PalindromeThread c = new PalindromeThread(num/8,num/6);
	      PalindromeThread d = new PalindromeThread(num/6,num/4);
	      PalindromeThread e = new PalindromeThread(num/4, num/2);
	      PalindromeThread f = new PalindromeThread(num/2, num);
	      a.start();
	      b.start();
	      c.start();
	      d.start();	
	      e.start();
	      f.start();
	      //	      29.73 sec
//	      PalindromeThread z = new PalindromeThread(0, num);
//	      z.start();
//	      47.03 sec
	}

}

