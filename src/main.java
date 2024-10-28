import java.util.Scanner;
public class main {
	public static void main(String args[]){
		AVLTree arvore = new AVLTree();

		Scanner sc = new Scanner(System.in);

		int aux;
		int op;
		int po2=1;		
		String teste = sc.nextLine();
		System.err.println("foi :" + teste);
		while(po2!=1350){
			System.out.println("1- inserir valor\n2- mostrar arvore\n5-sair\n");
			op = sc.nextInt();
			switch(op){
				case 1:
					aux = sc.nextInt();
					//arvore.insert(aux);
					System.out.println("ok"+aux);
					break;
				
				case 2:
					//arvore.preOrderTraversal();
					System.out.println("arvore");
					break;

				case 5:
					po2=1350;
					sc.close();
					break;
					
				default:
				    System.out.println("erro");

			}

		}
		
	}
}
