package task6;
// Move all the negative elements to one side of the array. 
// 		input -> 1  3  -4  5  -6   23   -45    67   43   44   56   -90   100
// 		Output -> 1  3   5    23   67   43    56    100   -4   -6  -45   -90  
public class Saperator {
    public static void main(String[] args) {
        int[] arr = {1, 3, -4, 5, -6, 23, -45, 67, 43, 44, 56, -90, 100};
        int[] positive = new int[arr.length];
        int[] temp = new int[arr.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[j] = arr[i];
                j++;
            }
            else{
                positive[k] = arr[i];
                k++;
            }
        }
        int z =0;
        for (int i=k;i<j+k;i++){
            positive[i] = temp[z];
            z++;
        }

        for (int i = 0;i<positive.length;i++) {
            System.out.print(positive[i]+ " ");
        }


    }
}
