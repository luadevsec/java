import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variaveis de ambiente
        final Scanner sc = new Scanner(System.in);
        final int questoes = 9;
        final String[][] prova = createProva();
        
        final String[] gabarito = new String[questoes+1];

        gabarito[0] = "4 - true e false";
        gabarito[1] = "2 - 'a'";
        gabarito[2] = "3 - long";
        gabarito[3] = "1 - byte";
        gabarito[4] = "4 - for-each";
        gabarito[5] = "4 - System.out.prinf('print formatado %s', '');";
        gabarito[6] = "1 - java.util.Scanner";
        gabarito[7] = "3 - java.util.Arrays";
        gabarito[8] = "escolha a opção inversa da que não tenha falta de logica";

        gabarito[9] = "4 - schrodinger"; // Esta é uma suposição, pois a resposta correta depende do desempenho do aluno na questão anterior.
        


        //funcionamento da prova
        System.out.println("use numeros de 1 a 4 para marcar as questões");
        int nota = 0;
        for (int i = 0; i < questoes-1; i++) {
            getProva(i, prova);
            if (prova[i][getResposta(sc)] ==  gabarito[i]) nota += 1;
            getNota(nota);
        }
        getProva(questoes-1, prova);
        boolean acertou = prova[questoes-1][getResposta(sc)] ==  gabarito[questoes-1];
        if (acertou){
            nota += 1;
            getNota(nota);
            getProva(questoes , prova);
            if (prova[questoes ][getResposta(sc)] == gabarito[questoes ]) nota += 1;
            getNota(nota);
        } else{
            getNota(nota); 
            getProva(questoes , prova);
            if (prova[questoes ][getResposta(sc)] =="1 - sim" ) nota += 1;
            getNota(nota);
        }

        sc.close();

    }

    public static String[][] createProva(){
        final int questoes = 10;
        final int alternativas = 5;
        final String[][] prova = new String[questoes][alternativas];
        //prova em si
        prova[0][0] = "qual desses tipos se tratam de tipos boolean";
        prova[0][1] = "1 - 1 e 0";
        prova[0][2] = "2 - 'verdadeiro' e 'falso'";
        prova[0][3] = "3 - True e False";
        prova[0][4] = "4 - true e false";

        prova[1][0] = "qual desses tipos se tratam de tipos char";
        prova[1][1] = "1 - a";
        prova[1][2] = "2 - 'a'";
        prova[1][3] = "3 - 'aaaa'";
        prova[1][4] = "4 - 32";

        prova[2][0] = "qual desses tipos possui 8 bytes";
        prova[2][1] = "1 - byte";
        prova[2][2] = "2 - int";
        prova[2][3] = "3 - long";
        prova[2][4] = "4 - float";

        prova[3][0] = "qual desses tipos possui 1 byte";
        prova[3][1] = "1 - byte";
        prova[3][2] = "2 - int";
        prova[3][3] = "3 - long";
        prova[3][4] = "4 - float";

        prova[4][0] = "qual é a opção de loop correta para quando não se sabe a quantidade de elementos";
        prova[4][1] = "1 - for";
        prova[4][2] = "2 - while";
        prova[4][3] = "3 - do while";
        prova[4][4] = "4 - for-each";

        prova[5][0] = "como se printa na tela em java usando formatação";
        prova[5][1] = "1 - printf('print formatado');";
        prova[5][2] = "2 - System.out.println('print %c', formatado);";
        prova[5][3] = "3 - console.log('print formatado');";
        prova[5][4] = "4 - System.out.prinf('print formatado %s', '');";

        prova[6][0] = "qual a biblioteca devemos importar para usar o scanner";
        prova[6][1] = "1 - java.util.Scanner";
        prova[6][2] = "2 - java.components.Scanner";
        prova[6][3] = "3 - java.io.Scanner";
        prova[6][4] = "4 - java.lang.Scanner";

        prova[7][0] = "qual é a biblioteca devemos importar para usar o array";
        prova[7][1] = "1 - java.components.Arrays";
        prova[7][2] = "2 - java.math.Arrays";
        prova[7][3] = "3 - java.util.Arrays";
        prova[7][4] = "4 - java.lang.Arrays";

        prova[8][0] = "escolha a opção inversa da que não tenha falta de logica";
        prova[8][1] = "1 - not";
        prova[8][2] = "2 - xor";
        prova[8][3] = "3 - and";
        prova[8][4] = "4 - or";

        prova[9][0] = "você acertou a opção anterior ?";
        prova[9][1] = "1 - sim";
        prova[9][2] = "2 - não";
        prova[9][3] = "3 - não sei";
        prova[9][4] = "4 - schrodinger";

        return prova;
    }


    public static int getProva(int questao, String[][] prova){
        for(String item : prova[questao]){
            System.out.println(item);
        }
        return 0;
    }
    public static int getNota(int nota){
        System.out.printf("nota atual: %d\n", nota);
        
        return 0;
    }

    public static int getResposta(Scanner sc) {
        int resposta;
        while (true) {
            resposta = sc.nextInt();
            if (!(resposta < 0) && !(resposta > 4)) {
                break;
            } else {
                System.out.println("Por favor, insira um número entre 1 a 4.");
            }
        }
        return resposta;
    }
    
}
