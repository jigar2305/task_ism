//Create 2D array of N*N and find the max number from each row.
package task9;
import java.util.*;
public class Findmax {
	
public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);        
        System.out.println("please enter size of array");
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("please enter element of array");
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
        	
            for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("max value of row is");
        for(int i=0;i<arr.length;i++){
        	int max = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
            	if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }       
            System.out.println(max);
            sc.close();
        }
    }
}
