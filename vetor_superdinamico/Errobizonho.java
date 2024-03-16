package vetor_superdinamico;

import java.util.Scanner;

public class Errobizonho {

    private static Object[][] superArray = new Object[4][];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        superArray[0] = new byte[1];
        superArray[1] = new short[1];
        superArray[2] = new int[1];
        superArray[3] = new long[1];

        System.out.println("digite o valor: ");
        long entrada = sc.nextLong();


        //definindo o tamanho do buffer

        if (entrada < 128) inject((byte) entrada);
        if (entrada > 127 && entrada < 32768) inject((short) entrada);
        if (entrada < 32768 &&  entrada < 2147483648L) inject((int) entrada);
        if (entrada < 2147483647 && entrada <= 9223372036854775807L) inject((long) entrada);

        System.out.println("seu array: " + Arrays.toString(superArray));

    }

    public static void inject(Object valor) {
        System.out.println(valor);
    }

    public static void inject(byte valor) {

        
        superArray[0][superArray[0].length - 1] = valor;
        byte[] temporary = new byte[superArray[0].length+1];
        System.arraycopy(superArray[0], 0, temporary, 0, superArray[0].length);
        superArray[0] = temporary;



    }

    public static void inject(short valor) {
        superArray[1][superArray[1].length - 1] = valor;
        short[] temporary = new short[superArray[1].length+1];
        System.arraycopy(superArray[1], 0, temporary, 0, superArray[1].length);
        (short) superArray[1] = temporary;
    }

    public static void inject(int valor) {
        superArray[2][superArray[2].length - 1] = valor;
        int[] temporary = new int[superArray[2].length+1];
        System.arraycopy(superArray[2], 0, temporary, 0, superArray[2].length);
        superArray[2] = temporary;
    }

    public static void inject(long valor) {
        superArray[3][superArray[3].length - 1] = valor;
        long[] temporary = new long[superArray[3].length+1];
        System.arraycopy(superArray[3], 0, temporary, 0, superArray[3].length);
        superArray[3] = temporary;
    }
}