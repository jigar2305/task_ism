//perform leftshit in 11 number using recursion.  
package task4;
import java.util.Scanner;

public class ShiftRecursion {
	Scanner sc = new Scanner(System.in);
    static int arr[] = {1,2,3,4,5};
    static int y = arr.length;
    static int count =0;
    static int n;
	void Leftshift(int n) {
			count++;
			if(count<=n) {
			int	first = arr[0];
			for(int j=0;j<y-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[y-1]=first;
			Leftshift(n);
			}			
		}


	public static void main(String[] args) {
		
		System.out.println("origanal array :");
		for(int i=0;i<y;i++) {
		System.out.print(" "+arr[i]);	
		}
		ShiftRecursion a = new ShiftRecursion();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nhow many shift do you want?");
		n = sc.nextInt();
		a.Leftshift(n);
		System.out.println("\nleftshift array :");
		for(int i=0;i<y;i++) {
			System.out.print(" "+arr[i]);
		}	
		System.out.println();

}
}