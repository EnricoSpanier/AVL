public class LLBT {
    protected BinaryTree bt;
    protected LLBT next;

    public LLBT() {
        this(null, null);
    }

    public LLBT(BinaryTree bt) {
        this.bt = bt;
    }

    public LLBT(BinaryTree bt, LLBT next) {
        this.bt = bt;
        this.next = next;
    }

    public BinaryTree getBT() {
        return bt;
    }

    public void setBT(BinaryTree bt) {
        this.bt = bt;
    }

    public LLBT getNext() {
        return next;
    }

    public void setNext(LLBT next) {
        this.next = next;
    }
    
    public void setNull() {
        while(this.getNext() != null) {
            bt.avRemove();
            this.next = this.getNext();
        }
    }
}
