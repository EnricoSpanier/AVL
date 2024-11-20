public class LLAVL {
    protected AVLTree avl;
    protected LLAVL next;
    
    public LLAVL() {
        this(null, null);
    }

    public LLAVL(AVLTree avl) {
        this.avl = avl;
    }

    public LLAVL(AVLTree avl, LLAVL next) {
        this.avl = avl;
        this.next = next;
    }
    
    public AVLTree getAvl() {
        return avl;
    }

    public void setAvl(AVLTree avl) {
        this.avl = avl;
    }
    
    public LLAVL getNext() {
        return next;
    }

    public void setNext(LLAVL next) {
        this.next = next;
    }
}
