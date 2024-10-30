import java.util.Scanner;
public class main {
	public static void main(String args[]){
		AVLTree arvore = new AVLTree();

		Scanner sc = new Scanner(System.in);

		int aux;
		int op;
		int po2=1;		
		while(po2!=1350){
			System.out.println("1- inserir valor\n2- mostrar arvore\n3- remover valor\n4- apagar arvore\n5- Print arvore 2D\n6- sair\n");
			op = sc.nextInt();
			switch(op){
				case 1:
					aux = sc.nextInt();
					arvore.insert(aux);
					System.out.println("\nvalor "+aux+" inserido\n");
					break;
				
				case 2:
					arvore.preOrderTraversal();
					break;

				case 3:
				    aux = sc.nextInt();
					arvore.remove(aux);
					break;

				case 4:
					arvore.avRemove();
					System.out.println("\n arvore apagada");
					break;

				case 5:
					System.out.println(arvore.inReversedOrderAscii());
					break;
					
				case 6:
					po2=1350;
					sc.close();
					break;
					
				default:
				    System.out.println("erro");

			}

		}
		
	}
}
