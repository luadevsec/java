package paralelismo;

public class Cozinheiro extends Thread{
    private boolean dormindo = true;


    public void setDormindo(boolean dormindo) {this.dormindo = dormindo;}

    public void run() {
        while (true) {
            if (dormindo) {
                try {
                    sleep(3000);
                } catch (Exception e) {}
            } 
            else {
                System.out.println("cozinhando . . .");
                Caldeirao.cozinhar();
                dormindo = true;
            }
        }
    }

    
}
