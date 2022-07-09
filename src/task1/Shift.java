package task1;
import java.util.*;
public class Shift {
	Scanner sc = new Scanner(System.in);
    int arr[] = {1,2,3,4,5};
    int y = arr.length;
	void Leftshift(int n) {
		System.out.println("origanal array :");
		for(int i=0;i<y;i++) {
			System.out.print(" "+arr[i]);
		}
		for(int i=0;i<n;i++) {
			int first;
			first = arr[0];
			for(int j=0;j<y-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[y-1]=first;
		}
		System.out.println("\nleftshift array :");
		for(int i=0;i<y;i++) {
			System.out.print(" "+arr[i]);
		}	
		System.out.println();
	}
	void Rightshift(int n) {
		System.out.println("origanal array :");
		for(int i=0;i<y;i++) {
			System.out.print(" "+arr[i]);
		}
		for(int i=0;i<n;i++) {
			int last;
			last = arr[y-1];
			for(int j=y-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println("\nrightshift array :");
		for(int i=0;i<y;i++) {
			System.out.print(" "+arr[i]);
		}	
	}

	public static void main(String[] args) {
		Shift a = new Shift();
		a.Leftshift(2);
		a.Rightshift(2);
		
	}

}
