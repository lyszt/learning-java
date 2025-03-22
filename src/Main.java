import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(N);

        int[] notes = {100, 50, 20, 10, 5, 2, 1};

        for (int note : notes) {
            int count = N / note;
            System.out.println(count + " nota(s) de R$ " + note + ",00");
            N %= note;
        }

    }
}
    class Sorting{
        public static int[] reverse(int[] array){
            for(int i = 0; i < (array.length)/2; i++){
                int aux = array[i];
                array[i] = array[array.length-i-1];
                array[array.length-i-1] = aux;

            }
            return array;
        }

    }





