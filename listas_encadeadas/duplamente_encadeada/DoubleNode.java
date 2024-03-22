public class DoubleNode {
    public DoubleNode next = null;
    public DoubleNode previous = null;

    public DoubleNode(DoubleNode me) {
        this.previous = me;
    }
}