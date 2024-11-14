import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class semiMain {
    public static void main(String[] args) {
       BinaryTree BTree = new BinaryTree();
       AVLTree AVL = new AVLTree();
       ReadCSV reader = new ReadCSV("TrabJava.csv");
       reader.readAndInsertNodes(BTree, AVL);
       
       // As árvores estão agora preenchidas e podem ser usadas conforme necessário
       BTNode binaryTreeRoot = BTree.getRoot();
       BTNode avlTreeRoot = AVL.getRoot();
       
       // Exemplo de uso das árvores 
       //BTree.preOrderTraversal()
       //System.out.println("Raiz da Árvore Binária: " + );
       //System.out.println("Raiz da Árvore AVL: " + avlTreeRoot);
    }
}
