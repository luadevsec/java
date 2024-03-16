public class Node {
    private Node seed = null;

   

    

    public Node head(long primo){
        final byte maxbyte = 127;
        final short maxshort = 32767;
        final int maxint = 2147483647;
        final long maxlong = 9223372036854775807L;

        if (primo <= maxbyte) 
            this.seed = new ByteNode((byte)primo);
        
        if (primo > maxbyte && primo <= maxshort) 
            this.seed = new ShortNode((short)primo);

        if (primo > maxshort && primo <= maxint) 
            this.seed = new IntNode((int)primo);

        if (primo > maxint && primo <= maxlong)
            this.seed = new LongNode(primo);

        return seed;


    }
    public void setSeed(Node seed){
        this.seed = seed;
    }

    public Node getSeed(){
        return this.seed;
    }

    public void deleteSeed(){
        this.seed = null;
    }


    public void inserir(long primo){
        final byte maxbyte = 127;
        final short maxshort = 32767;
        final int maxint = 2147483647;
        final long maxlong = 9223372036854775807L;

        if (primo <= maxbyte) 
            setSeed(new ByteNode((byte)primo));
        
        if (primo > maxbyte && primo <= maxshort) 
            setSeed(new ShortNode((short)primo));

        if (primo > maxshort && primo <= maxint) 
            setSeed(new IntNode((int)primo));

        if (primo > maxint && primo <= maxlong)
            setSeed(new LongNode((long)primo));


    }
    
    

    public static void main(String[] args) {
        
        
        Node head = new Node();
        head = head.head(2);

        Node pointer = head;

        long[] numers = {1,2,127,129,1000, 10002, 2147483647, 9223372036854775807L};
        for (long e : numers) {
            pointer.inserir(e);
            pointer = pointer.getSeed();
        }

        //leitura de todos os nós
        pointer = head;
        while (pointer != null) {
            try {
                if (pointer instanceof ByteNode) {
                    System.out.println(((ByteNode) pointer).get() + "as byte");
                } else if (pointer instanceof ShortNode) {
                    System.out.println(((ShortNode) pointer).get() + "as short");
                } else if (pointer instanceof IntNode) {
                    System.out.println(((IntNode) pointer).get() + "as int");
                } else if (pointer instanceof LongNode) {
                    System.out.println(((LongNode) pointer).get() + "as long");
                } else {
                    // Lidar com o caso em que o tipo de nó não é reconhecido
                    System.out.println("Tipo de nó desconhecido");
                }
            } catch (Exception e) {
                // Lidar com a exceção esperada
                e.printStackTrace(); // ou qualquer outra forma de lidar com a exceção
            }
            pointer = pointer.getSeed();
        }

    }
    
}