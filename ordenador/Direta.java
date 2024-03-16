package ordenador;

import java.util.Scanner;
import java.util.Arrays;


public class Direta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Digite o elemento:");
            list[i] = sc.nextInt();
        }

       
        for (int i = 0; i < list.length; i++) {
            
            //impressão da lista
            System.out.println(Arrays.toString(list));
            for (int j = 0; j < list.length; j++) {
                if (list[i] < list[j]) {
                    int aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(list));
        
        sc.close();
    }

}

