package ordenador;

import java.util.Scanner;

public class Exaustiva {
    
    public static void main(String[] args) {
        
        //cria um vetor com 1000000 elementos
        int[] vetor = new int[1000000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 1000000);
        }
        //imprime o vetor
        



        //busca

        Scanner sc = new Scanner(System.in);


        int busca = 0;
        do{
        int encontrado = 0;
            
        System.out.println("Digite o elemento a ser buscado:");
        busca = sc.nextInt();


        for (int elemento : vetor) {
            if (elemento == busca) encontrado++;
            
        }



        if (encontrado == 0) System.out.println("O elemento " + busca + " não foi encontrado.");
        else System.out.println("O elemento " + busca + " foi encontrado " + encontrado + " vezes.");
        }while (busca != -99);



        sc.close();



    }
}
