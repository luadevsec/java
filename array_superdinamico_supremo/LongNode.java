public class LongNode extends Node {
    private long primo;

    public LongNode(long primo) {
        super();
        this.primo = primo;
    }
    public LongNode(long primo, Node node) {
        super();
        setSeed(node);
        this.primo = primo;
    }

    public long get() {
        return primo;
    }
}
