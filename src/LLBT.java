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
	
		public BinaryTree LLBTgetBt(){
	    return bt;
	}
	public void LLBTsetAvl(BinaryTree bt){
	    this.bt = bt;
	}
	
	public BinaryTree LLBTgetNext(){
	    return next;
	}
	public void LLBTsetNext(BinaryTree next){
	    this.next = next;
	}
}