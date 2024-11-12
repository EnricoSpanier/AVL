import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		AVLTree arvore = new AVLTree();
		BinaryTree BiArvore = new BinaryTree();

		Scanner sc = new Scanner(System.in);

		int aux;
		int op;
		int po2=1;		
		System.out.println("Será criado ambas as arvores ao mesmo tempo");
		while(po2!=1350){
			System.out.println("\n1- inserir valor\n2- mostrar arvore\n3- remover valor\n4- apagar arvore\n5- Print arvore 2D\n6- sair\n");
			op = sc.nextInt();
			switch(op){
				case 1:
				    System.out.println("Insira o valor a ser inserido na arvore\n");
					aux = sc.nextInt();
					long start = System.currentTimeMillis();
					arvore.insert(aux);
					long end = System.currentTimeMillis()-start;
					System.out.println("o tempo usado pela avl para inserir foi de "+ (end) +" milisegundos");
					BiArvore.insert(aux);
					System.out.println("\nvalor "+aux+" inserido");
					break;
				
				case 2:
				    System.out.println("-=-=-=-=-=-=-=-=-=-=-Arvore AVL-=-=-=-=-=-=-=-=-=-=--=-=-");
					arvore.preOrderTraversal();
					System.out.println("\n");
					System.out.println("-=-=-=-=-=-=-=-=-=-=-Arvore Binaria-=-=-=-=-=-=-=-=-=-=--=-=-");
					BiArvore.preOrderTraversal();
					break;

				case 3:
				    aux = sc.nextInt();
					arvore.removea(aux);
					BiArvore.remove(aux);
					break;

				case 4:
					arvore.avRemove();
					BiArvore.avRemove();
					System.out.println("\n arvore apagada\n");
					break;

				case 5:
				    System.out.println("-=-=-=-=-=-=-=-=-=-=-Arvore AVL-=-=-=-=-=-=-=-=-=-=--=-=-");
					System.out.println(arvore.inReversedOrderAscii());
					System.out.println("-=-=-=-=-=-=-=-=-=-=-Arvore Binaria-=-=-=-=-=-=-=-=-=-=--=-=-");
					System.out.println(arvore.inReversedOrderAscii());
					break;
					
				case 6:
					po2=1350;
					arvore.avRemove();
					BiArvore.avRemove();
					sc.close();
					break;
					
				default:
				    System.out.println("erro");

			}

		}
		
	}
}
