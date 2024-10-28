public class AVLTree extends BinaryTree {
    public int data;

    public AVLTree() {
        super();
    }

    public AVLTree(BTNode root) {
        super(root);
    }

    public BTNode search(int data) {
        return search(root, data);
    }

    private BTNode search(BTNode node, int data) {
        if (node == null) {
            return null;
        }
        int diff = Integer.compare(data, node.getData());
        if (diff < 0) {
            return search(node.getLeft(), data);
        } else if (diff > 0) {
            return search(node.getRight(), data);
        } else {
            return node;
        }
    }

    public void insert(int data) {
        root = insert(root, null, data);
        // Verificação após a inserção
        if (root.getParent() != null) {
            root = root.getParent();
        }
        root.setParent(null); // Garantir que o parent do root seja null
    }

    private BTNode insert(BTNode node, BTNode parent, int data) {
        if (node == null) {
            return new BTNode(data, parent);
        }
        int diff = Integer.compare(data, node.getData());
        if (diff < 0) {
            node.setLeft(insert(node.getLeft(), node, data));
        } else if (diff > 0) {
            node.setRight(insert(node.getRight(), node, data));
        } else {
            throw new RuntimeException("Essa AVL não pode ter duplicatas!");
        }
        updateHeight(node);
        return balance(node);
    }

    public void remove(int data) {
        root = remove(root, data);
        // Verificação após a remoção
        if (root != null && root.getParent() != null) {
            root = root.getParent();
        }
        if (root != null) {
            root.setParent(null); // Garantir que o parent do root seja null
        }
    }

    private BTNode remove(BTNode node, int data) {
        if (node == null) {
            throw new RuntimeException("Nó com chave " + data + " não existe na AVL!");
        }
        int diff = Integer.compare(data, node.getData());
        if (diff < 0) {
            node.setLeft(remove(node.getLeft(), data));
        } else if (diff > 0) {
            node.setRight(remove(node.getRight(), data));
        } else {
            if (node.isLeaf()) {
                return null;
            } else if (!node.hasLeftChild()) {
                return node.getRight();
            } else if (!node.hasRightChild()) {
                return node.getLeft();
            } else {
                BTNode predecessor = findMax(node.getLeft());
                node.setData(predecessor.getData());
                node.setLeft(remove(node.getLeft(), predecessor.getData()));
            }
        }
        updateHeight(node);
        return balance(node);
    }

    private BTNode balance(BTNode node) {
        int balanceFactor = getBalanceFactor(node);
        if (balanceFactor > 1) {
            if (getBalanceFactor(node.getLeft()) < 0) {
                node.setLeft(rotateLeft(node.getLeft()));
            }
            return rotateRight(node);
        } else if (balanceFactor < -1) {
            if (getBalanceFactor(node.getRight()) > 0) {
                node.setRight(rotateRight(node.getRight()));
            }
            return rotateLeft(node);
        }
        return node;
    }

    private void updateHeight(BTNode node) {
        node.setHeight(1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight())));
    }

    private int getHeight(BTNode node) {
        return node == null ? -1 : node.getHeight();
    }

    private int getBalanceFactor(BTNode node) {
        return node == null ? 0 : getHeight(node.getLeft()) - getHeight(node.getRight());
    }

    private BTNode rotateRight(BTNode y) {
        BTNode x = y.getLeft();
        BTNode T2 = x.getRight();

        x.setRight(y);
        y.setLeft(T2);

        if (T2 != null) {
            T2.setParent(y);
        }

        x.setParent(y.getParent());
        y.setParent(x);

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    private BTNode rotateLeft(BTNode x) {
        BTNode y = x.getRight();
        BTNode T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

        if (T2 != null) {
            T2.setParent(x);
        }

        y.setParent(x.getParent());
        x.setParent(y);

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    public BTNode findMin() {
        return findMin(root);
    }

    private BTNode findMin(BTNode node) {
        if (node == null) {
            return null;
        }
        while (node.hasLeftChild()) {
            node = node.getLeft();
        }
        return node;
    }

    public BTNode findMax() {
        return findMax(root);
    }

    private BTNode findMax(BTNode node) {
        if (node == null) {
            return null;
        }
        while (node.hasRightChild()) {
            node = node.getRight();
        }
        return node;
    }

    @Override
    public String toString() {
        return "AVLTree - root => { " + root + " }";
    }
}
