// imports para a fila usada na levelOrderTraversal(BTNode node). 
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	protected BTNode root;

	public BinaryTree() {
		this(null);
	}

	public BinaryTree(BTNode root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int getDegree() {
		return getDegree(root);
	}

	private int getDegree(BTNode node) {
		if (node == null || node.isLeaf()) {
			return 0;
		}

		int degree = node.getDegree();
		
		if (node.hasLeftChild()) {
			degree = Math.max(degree, getDegree(node.getLeft()));
		}
		
		if (node.hasRightChild()) {
			degree = Math.max(degree, getDegree(node.getRight()));
		}
		
		return degree;
	}

	public int getHeight() {
		if (isEmpty()) {
			return -1;
		}

		return root.getHeight();
	}
	
	public BTNode search(String data) {
        return search(root, data);
    }

    private BTNode search(BTNode node, String data) {
        if (node == null) {
            return null;
        }
        int diff = data.compareTo(node.getEndereco());
        if (diff < 0) {
            return search(node.getLeft(), data);
        } else if (diff > 0) {
            return search(node.getRight(), data);
        } else {
            return node;
        }
    }
	
	public void insert(String data) {
        root = insert(root, null, data);
        // Verificação após a inserção
        if (root.getParent() != null) {
            root = root.getParent();
        }
        root.setParent(null); // Garantir que o parent do root seja null
    }

    private BTNode insert(BTNode node, BTNode parent, String data) {
        if (node == null) {
            return new BTNode(data, parent);
        }
        int diff = data.compareTo(node.getEndereco());
        if (diff < 0) {
            node.setLeft(insert(node.getLeft(), node, data));
        } else if (diff >= 0) {
            node.setRight(insert(node.getRight(), node, data));
        }
        return node;
    }
    
    public void remove(String data) {
        if(search(root,data)!= null){
            System.out.println("\nValor "+ data +" foi removido!\n");
        }
        root = remove(root,data);
        // Verificação após a remoção
        if (root != null && root.getParent() != null) {
            root = root.getParent();
        }
        if (root!= null){
            root.setParent(null);
        }
        
    }
	
	public BTNode remove(BTNode node,String data){
	    if(node == null){
	        return node;
	    }
	    int diff = data.compareTo(node.getEndereco());
	    if(diff > 0){
	        root.setRight(remove(root.getRight(),data));
	    }
	    else if(diff < 0){
	        root.setLeft(remove(root.getLeft(),data));    
	    }
	    else{
	        if(node.isLeaf()){
	            if(node.getParent().getLeft().getEndereco()==data){
	                node.getParent().setLeft(null);
	            }else{
	                node.getParent().setRight(null);
	            }
	        }
	        else if(node.getRight()!=null){
	            node.setEndereco(maior(node));
	            node.setRight(remove(node.getRight(),node.getEndereco()));
	        }else{
	            node.setEndereco(menor(node));
	            node.setLeft(remove(node.getLeft(),node.getEndereco()));
	        }
	    }
	    return node;
	}
	
	public String maior(BTNode node){
	    root = root.getRight();
	    while(root.getLeft()!=null){
	        root = root.getLeft();
	    }
	    return root.getEndereco();
	}
	public String menor(BTNode node){
	    root = root.getLeft();
	    while(root.getRight()!= null){
	        root = root.getRight();
	    }
	    return root.getEndereco();
	}
	
	
	public void avRemove(){
        avRemoveAux(root);
        root = null;
    }
        
        

    public void avRemoveAux(BTNode node){
        if(node.getLeft() != null){
        avRemoveAux(node.getLeft());
        }
        if(node.getRight() != null){
        avRemoveAux(node.getRight());
        }
        node.setEndereco("");
        node.setEI("");
        node.setCE("");
        node.setSR("");
        node.setAI("");
        node.setAF("");
        node.setEM("");
        node.setEJAFAI("");
        node.setEJAFAF("");
        node.setEJAEM("");
        node.setRight(null);
        node.setLeft(null);
        node.setParent(null);
    }

    
	

	public String inOrderTraversal() {
		StringBuilder sb = new StringBuilder();
		inOrderTraversal(sb, root);
		return sb.toString();
	}

	private void inOrderTraversal(StringBuilder sb, BTNode node) {
		if (node == null) {
			return;
		}

		// Em ordem = percurso LNR.
		inOrderTraversal(sb, node.getLeft());
		sb.append(node + "\n");
		inOrderTraversal(sb, node.getRight());
	}

	public void preOrderTraversal() {
		preOrderTraversalhelper(root);
		return;
	}

	private void preOrderTraversalhelper(BTNode node) {
		if (node == null) {
			return ;
		}
		// Pré-ordem = percurso NLR.
		System.out.println(
			    "BinaryTree - " + node.getEndereco() +
			    ", getDegree(): " + node.getDegree() +
			    ", getHeight(): " + node.getHeight() +
			    ", parent => {" + (node.getParent() != null ? node.getParent().getEndereco() : "null") + "}" +
			    ", right => {" + (node.getRight() != null ? node.getRight().getEndereco() : "null") + "}" +
			    ", left => {" + (node.getLeft() != null ? node.getLeft().getEndereco() : "null") + "}"
			);
		//System.out.println(node.getData()+" ");
		preOrderTraversalhelper(node.getLeft());
		preOrderTraversalhelper(node.getRight());
	}

	public String postOrderTraversal() {
		StringBuilder sb = new StringBuilder();
		postOrderTraversal(sb, root);
		return sb.toString();
	}

	private void postOrderTraversal(StringBuilder sb, BTNode node) {
		if (node == null) {
			return;
		}

		// Pós-ordem = percurso LRN.
		postOrderTraversal(sb, node.getLeft());
		postOrderTraversal(sb, node.getRight());
		sb.append(node + "\n");
	}

	public String levelOrderTraversal() {
		if (isEmpty()) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();

		Queue<BTNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			BTNode visited = queue.remove();
			sb.append(visited + "\n");

			if (visited.hasLeftChild()) {
				queue.add(visited.getLeft());
			}			
			if (visited.hasRightChild()) {
				queue.add(visited.getRight());
			}
		}
		
		return sb.toString();
	}

	// Apenas para uma exibição melhor da árvore.
	public String inReversedOrderAscii() {
		StringBuilder sb = new StringBuilder();
		inReversedOrderAscii(sb, root);
		return sb.toString();
	}

	private void inReversedOrderAscii(StringBuilder sb, BTNode node) {
		if (node == null) {
			return;
		}

		// Em ordem (invertida) = percurso RNL.

		// R
		if (!node.hasRightChild()) {
			for (int i = 0; i < node.getLevel() + 1; ++i) {
				sb.append("¦   ");
			}
			sb.append("├─» dir null\n");
		}
		inReversedOrderAscii(sb, node.getRight());

		// N
		for (int i = 0; i < node.getLevel(); ++i) {
			sb.append("¦   ");
		}
		sb.append("├─» " + node.getEndereco() + "\n");

		// L
		if (!node.hasLeftChild()) {
			for (int i = 0; i < node.getLevel() + 1; ++i) {
				sb.append("¦   ");
			}
			sb.append("├─» esq null\n");
		}
		inReversedOrderAscii(sb, node.getLeft());
	}

	@Override
	public String toString() {
		return "BinaryTree - isEmpty(): " + isEmpty()
				+ ", getDegree(): " + getDegree()
				+ ", getHeight(): " + getHeight()
				+ ", root => { " + root + " }";				
	}

}
