public class BTNode {
    protected int data;
    protected BTNode parent;
    protected BTNode left;
    protected BTNode right;
    protected int height;
    protected int rep;

    public BTNode() {
        this(0, null);
    }

    public BTNode(int data) {
        this(data, null);
    }

    public BTNode(int data, BTNode parent) {
        this.data = data;
        this.parent = parent;
        this.left = null;
        this.right = null;
        this.height = 0;
        this.rep = 0;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
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
        return "data: " + data +
                ", parent: " + (parent != null ? parent.getData() : "null") +
                ", left: " + (left != null ? left.getData() : "null") +
                ", right: " + (right != null ? right.getData() : "null") +
                ", isRoot(): " + isRoot() +
                ", isLeaf(): " + isLeaf() +
                ", getDegree(): " + getDegree() +
                ", getLevel(): " + getLevel() +
                ", getHeight(): " + getHeight();
    }
}
