public class BTNode {
    protected int Cod;
    protected String Nome;
    protected String EI;
    protected String CE;
    protected String SR;
    protected String AI;
    protected String AF;
    protected String EM;
    protected String EJAFAI;
    protected String EJAFAF;
    protected String EJAEM;
    protected int height;
    protected int rep;
    protected BTNode parent;
    protected BTNode left;
    protected BTNode right;
    
    public BTNode() { 
        this(-1 ,null); 
    } 
    public BTNode(int Cod) {
        this(Cod, null); 
    } 
    public BTNode(int Cod, BTNode parent) {
        this.Cod = Cod;
        this.Nome = Nome;
        this.EI = "";
        this.CE = "";
        this.SR = "";
        this.AI = "";
        this.AF = "";
        this.EM = "";
        this.EJAFAI = "";
        this.EJAFAF = "";
        this.EJAEM = "";
        this.parent = parent;
        this.left = null;
        this.right = null;
        this.height = 0;
        this.rep = 0;
    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int data) {
        this.Cod = data;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String data) {
        this.Nome = data;
    }
    
    public String getEI() {
        return EI;
    }

    public void setEI(String data) {
        this.EI = data;
    }
    
    public String getCE() {
        return CE;
    }

    public void setCE(String data) {
        this.CE = data;
    }
    
    public String getSR() {
        return SR;
    }

    public void setSR(String data) {
        this.SR = data;
    }
   
    public String getAI() {
        return AI;
    }

    public void setAI(String data) {
        this.AI = data;
    }
    
    public String getAF() {
        return AF;
    }

    public void setAF(String data) {
        this.AF = data;
    }
    
    public String getEM() {
        return EM;
    }

    public void setEM(String data) {
        this.EM = data;
    }
    
    public String getEJAFAI() {
        return EJAFAI;
    }

    public void setEJAFAI(String data) {
        this.EJAFAI = data;
    }
    
    public String getEJAFAF() {
        return EJAFAF;
    }

    public void setEJAFAF(String data) {
        this.EJAFAF = data;
    }
    
    public String getEJAEM() {
        return EJAEM;
    }

    public void setEJAEM(String data) {
        this.EJAEM = data;
    }
    
    public BTNode getParent() {
        return parent;
    }

    public void setParent(BTNode parent) {
        this.parent = parent;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
        if (this.left != null) {
            this.left.setParent(this);
        }
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
        if (this.right != null) {
            this.right.setParent(this);
        }
    }

    public boolean hasLeftChild() {
        return left != null;
    }

    public boolean hasRightChild() {
        return right != null;
    }

    public boolean isRoot() {
        return parent == null;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public int getDegree() {
        int degree = 0;
        if (hasLeftChild()) {
            --degree;
        }
        if (hasRightChild()) {
            ++degree;
        }
        return degree;
    }

    public int getLevel() {
        int level = 0;
        BTNode current = this;
        while (current.getParent() != null) {
            level++;
            current = current.getParent();
        }
        return level;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getRep() {
        return rep;
    }

    public void setRep(int val) {
        this.rep = rep+val ;
    }

    @Override
    public String toString() {
        return 
            "Codigo escola: " + Cod +
            "\nNome escola: " + Nome +
            "\nEducação infantil: " + EI +
            "\nClasse Expecial: " + CE +
            "\nSala Recurso: " + SR +
            "\nAnos Iniciais: " + AI +
            "\nAnos Finais: " + AF + 
            "\nAnos Finais Ensino Médio: " + EM + 
            "\nEja Fundamental Anos Iniciais: " + EJAFAI +
            "\nEja Ensino Médio: " + EJAEM +
            "\nEja Fundamental Anos Finais: " + EJAFAF +
            "\nparent: " + (parent != null ? parent.getCod() : "null") +
            "\nleft: " + (left != null ? left.getCod() : "null") +
            "\nright: " + (right != null ? right.getCod() : "null") +
            "\nisRoot(): " + isRoot() +
            "\nisLeaf(): " + isLeaf() +
            "\ngetDegree(): " + getDegree() +
            "\ngetLevel(): " + getLevel() +
            "\ngetHeight(): " + getHeight() +
            "\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n";
    }
}