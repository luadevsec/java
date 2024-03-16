public class Node {
    private Node seed = null;

    

    public void setSeed(Node seed){
        this.seed = seed;
    }

    public Node getSeed(){
        return this.seed;
    }

    public void deleteSeed(){
        this.seed = null;
    }

    public static void main(String[] args) {
        ByteNode head = new ByteNode((byte) 2);

        ByteNode pointer = head;
        for (int i = 3; i < 10; i++) {
            //criação de 10 nodes de byte encadeados
            ByteNode node = new ByteNode((byte) i);
            pointer.setSeed(node);
            pointer = node;
        }

        //leitura de todos os nós
        pointer = head;
        while(pointer!= null){
            System.out.println(pointer.get());
            pointer = (ByteNode) pointer.getSeed();
        }
        

    }
    
}