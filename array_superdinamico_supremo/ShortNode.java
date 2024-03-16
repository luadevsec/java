public class ShortNode extends Node {
    private short primo;

    public ShortNode(short primo) {
        super();
        this.primo = primo;
    }
    public ShortNode(short primo, Node node) {
        super();
        setSeed(node);
        this.primo = primo;
    }

    public short get() {
        return primo;
    }
}
