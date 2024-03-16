package paralelismo;

public class Caldeirao {
    private static int porcos = 1000;
    

    public synchronized static int getPorcos() {return porcos;}

    public synchronized static void cozinhar() {porcos = (30 + ((int) (701 * Math.random())));}

    public synchronized static void deglutir(){if(porcos > 0)porcos--;}




    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.start();

        for(int i=0; i < 120; i++){
            new Selvagem(cozinheiro).start();
        }

        while (true) {
            System.out.println(Caldeirao.getPorcos());
            try {
                Thread.sleep((int)(1000 * Math.random()));
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
