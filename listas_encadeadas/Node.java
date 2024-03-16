package listas_encadeadas;

public class Node {
    private int num = 0;
    private Node nextSeed = null;


    public Node(){
        super();
    }
    public Node(int num, Node next){
        super();
        this.num = num;
        this.nextSeed = next;
    }


    public int getNum(){

        return this.num;
    }

    public void setNum(int num){

        this.num = num;
    }
    public Node getSeed(){
        return this.nextSeed;
    }
    public void setSeed(Node seed){
        this.nextSeed = seed;
    }
}
