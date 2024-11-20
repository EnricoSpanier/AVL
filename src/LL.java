public class LL {
    protected AVLTree avl;
    protected BinaryTree bt;
    protected BinaryTree btnext;
    protected AVLTree avlnext;
    
    public LL() {
        this(null, null);
    }

    public LL(AVLTree avl) {
        this.avl = avl;
    }

    public LL(AVLTree avl, AVLTree avlnext) {
        this.avl = avl;
        this.avlnext = avlnext;
    }
    
    public void LL(BinaryTree bt, BinaryTree btnext){
	    this.bt = bt;
	    this.btnext = btnext;
	}
    
    public LL(AVLTree avl, AVLTree avlnext,BinaryTree bt, BinaryTree btnext) {
        this.avl = avl;
        this.avlnext = avlnext;
	    this.bt = bt;
	    this.btnext = btnext;       
    }
    
    public AVLTree LLgetAvl() {
        return avl;
    }

    public void LLsetAvl(AVLTree avl) {
        this.avl = avl;
    }
    
    public AVLTree LLgetAvlNext() {
        return avlnext;
    }

    public void LLsetAvlNext(AVLTree avlnext) {
        this.avlnext = avlnext;
    }
    
    	public void LL(BinaryTree bt) {
		this.bt = bt;
	}
	
		public BinaryTree LLgetBt(){
	    return bt;
	}
	public void LLsetBt(BinaryTree bt){
	    this.bt = bt;
	}
	
	public BinaryTree LLgetBtNext(){
	    return btnext;
	}
	public void LLsetBtNext(BinaryTree btnext){
	    this.btnext = btnext;
	}
}
