//Find common Numbers from 2 one dimension arrays.
//		Array1:  1  2  3  4   5  6  7  
//		Array2:  2  9  5  10 15  7  80
//		Output : 2 5  7 
package task7;

public class Commanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3,4,5,6,7};
		int arr2[] = {2,9,5,10,15,7,80};
		
		for(int i=0;i<arr1.length;i++) {
			for (int j=0; j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}

	}

}
