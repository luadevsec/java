package paralelismo;
public class Paralelinha extends Thread {
    private String nome;
    private static int contador = 0;

    public Paralelinha(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
      while(contador != 1000000){        
        contador++;
      }
    }

    public void leitor(){
      while(contador != 1000000){
        System.out.println(contador);

      }
    }

    public static void main(String[] args) {
        String[] nucleos = {"nucleo1", "nucleo2", "nucleo3", "nucleo4", "nucleo5", "nucleo6", "nucleo7", "nucleo8"};

        for (String core : nucleos) {
            Paralelinha thread = new Paralelinha(core);
            thread.start();
        }
        Paralelinha leitor = new Paralelinha("leitor");
        leitor.start();
        leitor.leitor();

    }
}
