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
    
    public AVLTree LLAVLgetAvl() {
        return avl;
    }

    public void LLAVLsetAvl(AVLTree avl) {
        this.avl = avl;
    }
    
    public AVLTree LLAVLgetNext() {
        return next;
    }

    public void LLAVLsetNext(AVLTree next) {
        this.next = next;
    }
}
