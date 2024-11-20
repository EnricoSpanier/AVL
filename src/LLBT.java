public class LLBT {
    protected BinaryTree bt;
    protected BinaryTree next;
    
    public void LLBT() {
		this(null);
	}

	public void LLBT(BinaryTree bt) {
		this.bt = bt;
	}
	public void LLBT(BinaryTree bt, BinaryTree next){
	    this.bt = bt;
	    this.next = next;
	}
	
		public BinaryTree getBt(){
	    return bt;
	}
	public void setBT(BinaryTree bt){
	    this.bt = bt;
	}
	
	public BinaryTree getNext(){
	    return next;
	}
	public void setNext(BinaryTree next){
	    this.next = next;
	}
}
