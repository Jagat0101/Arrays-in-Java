import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;    
        arr[3] = 40;
        arr[4] = 50;
        // Internally in the heap memory the array will be stored as [10,20,30,40,50]

        System.out.println(arr[3]);
        //input using for loops
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values for array: ");
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The values stored in array are: ");
        for(int j = 0 ; j < arr.length; j++){
            System.out.println(arr[j]+ " ");
        }
    }
}
