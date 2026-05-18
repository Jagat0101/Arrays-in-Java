import java.util.Scanner;
public class MultidimensionalArray {
    public static void main(String[] args) {
        System.out.println("This is an example of multi dimensional array in java");
        /*
        This is a way by which we can store the values of the user in a matrix form , we have to specif=y rows and columns
        Like 
        1 2 3
        4 5 6
        7 8 9
         */
         // We can take input or decalre an Multidimensional array like this , where we have to delcalre the number of rows and columns
        /* We can also declare the array by hardcoding as well
         */
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3]; // This is a 2D array with 3 rows and 2 columns
        System.out.println(arr.length);

    // Imagine this as arrays of arrays 
        for(int row = 0; row < arr.length; row++){
            //for each row we have to iterate over the columns
            for(int col = 0 ; arr[row].length > col ; col++){
                arr[row][col] = in.nextInt();
            }
        }

        for(int row = 0; row < arr.length; row++){
            //for each row we have to iterate over the columns
            for(int col = 0 ; arr[row].length > col ; col++){
                System.out.print  (arr[row][col] + " ");
            }
            System.out.println();
        }
        

    }
}
