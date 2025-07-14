import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,6,4,5,1,4,7,6,5,9,100};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0)
                arr[i]=0;
            else{
                if (arr[i] >= max)
                    max = arr[i];
            }

        }
        System.out.println("max value: " + max);
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
}


