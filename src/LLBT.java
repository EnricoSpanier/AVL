public class LLBT {
    protected BinaryTree bt;
    protected BinaryTree next;

    public LLBT() {
        this(null, null);
    }

    public LLBT(BinaryTree bt) {
        this.bt = bt;
    }

    public LLBT(BinaryTree bt, BinaryTree next) {
        this.bt = bt;
        this.next = next;
    }

    public BinaryTree getBT() {
        return bt;
    }

    public void setBT(BinaryTree bt) {
        this.bt = bt;
    }

    public BinaryTree getNext() {
        return next;
    }

    public void setNext(BinaryTree next) {
        this.next = next;
    }
}
