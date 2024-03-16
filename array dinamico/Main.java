
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int option;
    do {
        System.out.print("Escolha entre o array estatico ou dinamico\n\t1-array dinamico\n\t2-array estatico\n\n> ");
        option = sc.nextInt();
        if (option == 1) {

            
            int e = 0;
            int[] array = new int[1];
            while(true){
                
                System.out.println("digite 0 a qualquer momento para parar o programa");
                System.out.print("Digite o elemento " + (e + 1) + ": ");
                int elemento = sc.nextInt();
                if (elemento == 0) break;

                if (array.length == e + 1){
                    array[e] = elemento;
                    System.out.println("seu array: " + Arrays.toString(array));
                    e++;
                    int[] newArray = new int[e+1];
                    for (int i = 0; i < array.length; i++) {
                        newArray[i] = array[i];
                    }
                    array = newArray;
                }

                }


        } else if (option == 2) {

            System.out.print("quantos elementos você quer inserir?\n> ");
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Digite o elemento " + (i + 1) + ": ");
                array[i] = sc.nextInt();
                System.out.printf("seu array: %s\n",Arrays.toString(array));
            }


        } else {
            System.out.println("escolha inválida");
        }
    } while (option != 1 && option != 2);

    sc.close();
}
}
