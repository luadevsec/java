package array_dinamicamente_dinamico;

public class PrimoNode {
    private PrimoNode seed = null;

    private byte primoB;
    private short primoS;
    private int primoI;
    private long primoL;
    private Object primodef;
    private byte type;


    private void typeDefine(long primo){
        final byte maxbyte = 127;
        final short maxshort = 32767;
        final int maxint = 2147483647;
        final long maxlong = 9223372036854775807L;

        if (primo <= maxbyte) this.type = 1;
        if (primo > maxbyte && primo <= maxshort) this.type = 2;
        if (primo > maxshort && primo <= maxint) this.type = 4;
        if (primo > maxint && primo <= maxlong) this.type = 8;

    }

    public void setGarbage(byte type){
     

        switch (type) {
            case 1:
                this.primoS = 0;
                this.primoI = 0;
                this.primoL = 0L;

                this.primodef = null;
                break;

            case 2:
                this.primoB = 0;
                this.primoI = 0;
                this.primoL = 0L;

                this.primodef = null;
                break;

            case 4:
                this.primoB = 0;
                this.primoS = 0;
                this.primoL = 0L;

                this.primodef = null;
                break;

            case 8:
                this.primoB = 0;
                this.primoS = 0;
                this.primoI = 0;

                this.primodef = null;
                break;
        
            default:
                this.primoB = 0;
                this.primoS = 0;
                this.primoI = 0;
                this.primoL = 0L;

                this.primodef = null;
                break;
        }
    }

    




    public PrimoNode(long primo){
        typeDefine(primo);

        switch (type) {
            case 1:
                this.primoB = (byte) primo;
                break;

            case 2:
                this.primoS = (short) primo;
                break;

            case 4:
                this.primoI = (int) primo;
                break;

            case 8:
                this.primoL = (long) primo;
                break;
        
            default:
                this.primodef = (Object) primo;
                break;
        }
    }

    public Object get(){
        switch (type) {
            case 1:
                return this.primoB;
            case 2:
                return this.primoS;

            case 4:
                return this.primoI;

            case 8:
                return this.primoL;
        
            default:
                return this.primodef;
        }


    }

    public void set(PrimoNode seed){
        this.seed = seed;
    }
    public PrimoNode getNode(){
        return this.seed;
    }




    public static void main(String[] args) {
        PrimoNode start = new PrimoNode(29142389184891982L);
        PrimoNode oto = new PrimoNode(1001);
        PrimoNode otonome = new PrimoNode(13);
        start.set(oto);
        oto.set(otonome);


        System.out.println(start.getNode().getNode().get());

    }
}



