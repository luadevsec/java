public class ByteNode extends Node {
    private byte primo;


    public ByteNode(byte primo) {
        super();
        this.primo = primo;
    }
    public ByteNode(byte primo, Node node) {
        super();
        setSeed(node);
        this.primo = primo;
    }


    public byte get() {
        return primo;
    }
}
