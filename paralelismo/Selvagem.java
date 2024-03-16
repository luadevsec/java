package paralelismo;

public class Selvagem extends Thread{
    
    private Cozinheiro oCozinheiro = null;

    public Selvagem(Cozinheiro oCozinheiro){
        super();
        this.oCozinheiro = oCozinheiro;

    }

    public void run(){
        while (true) {
            if (Caldeirao.getPorcos() > 0) {
                System.out.println("nham nham");
                Caldeirao.deglutir();
            }
            else oCozinheiro.setDormindo(false);
            try {
                sleep((int)(1000 * Math.random()));
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }


      

    }
}
