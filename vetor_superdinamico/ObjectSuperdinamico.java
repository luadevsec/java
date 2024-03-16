package vetor_superdinamico;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectSuperdinamico {

    private static Object[][] superArray = new Object[4][];



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        superArray[0] = new Object[0];
        superArray[1] = new Object[0];
        superArray[2] = new Object[0];
        superArray[3] = new Object[0];

        boolean rodar = true;
        while(rodar){
            System.out.println("Digite o valor: ");
            long entrada = sc.nextLong();
            if (entrada < 0) rodar = false;
    
            if (entrada < 128) inject((byte) entrada);
            if (entrada >= 128 && entrada < 32768) inject((short) entrada);
            if (entrada >= 32768 &&  entrada < 2147483648L) inject((int) entrada);
            if (entrada >= 2147483648L && entrada <= 9223372036854775807L) inject(entrada);
    
            System.out.println("Seu array: " + Arrays.deepToString(superArray));

            

        }
        sc.close();
    }

    public static void inject(Object valor) {
        System.out.println(valor);
    }

    public static void inject(byte valor) {
        superArray[0] = Arrays.copyOf(superArray[0], superArray[0].length + 1);
        superArray[0][superArray[0].length - 1] = valor;
    }

    public static void inject(short valor) {
        superArray[1] = Arrays.copyOf(superArray[1], superArray[1].length + 1);
        superArray[1][superArray[1].length - 1] = valor;
    }

    public static void inject(int valor) {
        superArray[2] = Arrays.copyOf(superArray[2], superArray[2].length + 1);
        superArray[2][superArray[2].length - 1] = valor;
    }

    public static void inject(long valor) {
        superArray[3] = Arrays.copyOf(superArray[3], superArray[3].length + 1);
        superArray[3][superArray[3].length - 1] = valor;
    }
}
