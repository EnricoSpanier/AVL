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
			    "BinaryTree - " + node.getData() +
			    ", getDegree(): " + node.getDegree() +
			    ", getHeight(): " + node.getHeight() +
			    ", parent => {" + (node.getParent() != null ? node.getParent().getData() : "null") + "}" +
			    ", right => {" + (node.getRight() != null ? node.getRight().getData() : "null") + "}" +
			    ", left => {" + (node.getLeft() != null ? node.getLeft().getData() : "null") + "}"
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
		sb.append("├─» " + node.getData() + "\n");

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
