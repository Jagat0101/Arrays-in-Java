import java.util.*;
public class MultiDAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialization
        for (int i = 0; i < 3 ; i++){
            list.add(new ArrayList<>());
        }

        //Adding value or declaration
        for(int j = 0 ; j < 3 ; j++){
            for(int k = 0 ; k < 3 ; k++){
                list.get(j).add(sc.nextInt());
            }
        }
        System.out.println(list);

    }
}
