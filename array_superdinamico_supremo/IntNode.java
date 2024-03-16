public class IntNode extends Node {
    private int primo;

    public IntNode(int primo) {
        super();
        this.primo = primo;
    }
    public IntNode(int primo, Node node) {
        super();
        setSeed(node);
        this.primo = primo;
    }

    public int get() {
        return primo;
    }
}
