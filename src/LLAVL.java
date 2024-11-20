public class LLAVL {
    protected AVLTree avl;
    protected AVLTree next;
    
    public LLAVL() {
        this(null, null);
    }

    public LLAVL(AVLTree avl) {
        this.avl = avl;
    }

    public LLAVL(AVLTree avl, AVLTree next) {
        this.avl = avl;
        this.next = next;
    }
    
    public AVLTree getAvl() {
        return avl;
    }

    public void setAvl(AVLTree avl) {
        this.avl = avl;
    }
    
    public AVLTree getNext() {
        return next;
    }

    public void setNext(AVLTree next) {
        this.next = next;
    }
}
