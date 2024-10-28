
public class main {
	public static void main(String args[]){
		int vetor[] = {1,3,5,7,9,11,13,25,50,39};
		int aux;
		AVLTree arvore = new AVLTree();
		for(int i=0; i<10; i++) {
			aux = vetor[i];
			arvore.insert(aux);
		}
		arvore.preOrderTraversal();
	}
}
