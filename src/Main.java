import java.util.Scanner;

public class Main {
	public static void main(String args[]){
	    LLAVL head = new LLAVL();;
	    LLBT headB = new LLBT();
        ReadCSV reader = new ReadCSV();
		Scanner sc = new Scanner(System.in);

		int aux;
		
		int op;
		int po2=1;		
		while(po2!=1350){
			System.out.println("\n1- Inserir valores manualmente na Arvore\n2- Ler csv e colocar na Arvore\n3- mostrar arvore\n4- remover valor"+
			                    "\n5- apagar arvore\n6- Buscar codigo\n7- Analise estatistica \n8- sair\n");
			
			op = readInt(sc, "Escolha uma opção:");
			
			switch(op){
			    case 1:
			        System.out.println("Caso deseje montar a AVLTree - 1\nCaso de deseje montar a BinaryTree - 2");
					aux = sc.nextInt();
					if(aux == 1){

					    long start = System.nanoTime();
					    System.out.println("Insira o código da escola que deseja inserir");
					    int cod = sc.nextInt();
					    BTNode node = new BTNode(cod);
						head.getAvl().insertm(cod,node);
					    long end = System.nanoTime()-start;
					    System.out.println("o tempo usado pela AVLTree para inserir manualmente foi de "+ (end) +" nanosegundos");
					}
					else if(aux == 2){
					    long start = System.nanoTime();
					    System.out.println("Insira o código da escola que deseja inserir");
					    int cod = sc.nextInt();
					    BTNode node = new BTNode();
					   	headB.getBT().insertm(cod,node);
					    long end = System.nanoTime()-start;
					    System.out.println("o tempo usado pela AVLTree para inserir manualmente foi de "+ (end) +" nanosegundos");
					}
					else{
					    System.out.println("Opção invalida!!");
					}
					break;
			    
				case 2:
				    System.out.println("Caso deseje montar a AVLTree - 1\nCaso de deseje montar a BinaryTree - 2");
					aux = sc.nextInt();
					if(aux == 1){
					    
						LLAVL current = head;

						long start = System.nanoTime();

						// Primeiro semestre de 2019
						AVLTree AVL = new AVLTree();
						reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2019_1°SEMESTRE.csv");
						current.setAvl(AVL);
						//AVL.avRemove();
						
						// Segundo semestre de 2019
						AVLTree AVL2 = new AVLTree();
						reader.readAndInsertNodesAvl(AVL2, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2019_2°SEMESTRE.csv");
						current.setNext(new LLAVL(AVL2));
						current = current.getNext();
						//AVL2.avRemove();

						// Primeiro semestre de 2020
						AVLTree AVL3 = new AVLTree();
						reader.readAndInsertNodesAvl(AVL3, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2020_1°SEMESTRE.csv");
						current.setNext(new LLAVL(AVL3));
						current = current.getNext();
						//AVL3.avRemove();

						// Segundo semestre de 2020
						AVLTree AVL4 = new AVLTree();
						reader.readAndInsertNodesAvl(AVL4, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2020_2°SEMESTRE.csv");
						current.setNext(new LLAVL(AVL4));
						current = current.getNext();
						//AVL4.avRemove();

						// Primeiro semestre de 2021
						AVLTree AVL5 = new AVLTree();
						reader.readAndInsertNodesAvl(AVL5, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2021_1°SEMESTRE.csv");
						current.setNext(new LLAVL(AVL5));
						current = current.getNext();
						//AVL5.avRemove();

						// Segundo semestre de 2021
						AVLTree AVL6 = new AVLTree();
						reader.readAndInsertNodesAvl(AVL6, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2021_2°SEMESTRE.csv");
						current.setNext(new LLAVL(AVL6));
						current = current.getNext();
						//AVL6.avRemove();

						// Primeiro semestre de 2022
						AVLTree AVL7 = new AVLTree();
						reader.readAndInsertNodesBynary(AVL7, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2022_1°SEMESTRE.csv");
					    current.setNext(new LLAVL(AVL7));
						current = current.getNext();
						//AVL7.avRemove();

						// Segundo semestre de 2022
						AVLTree AVL8 = new AVLTree();
					    reader.readAndInsertNodesBynary(AVL8, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2022_2°SEMESTRE.csv");
					    current.setNext(new LLAVL(AVL8));
						current = current.getNext();
						//AVL8.avRemove();

						// Primeiro semestre de 2023
						AVLTree AVL9 = new AVLTree();
					    reader.readAndInsertNodesBynary(AVL9, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2023_1°SEMESTRE.csv");
					    current.setNext(new LLAVL(AVL9));
						current = current.getNext();
						//AVL9.avRemove();
						
						// Segundo semestre de 2023
						AVLTree AVL10 = new AVLTree();
					    reader.readAndInsertNodesBynary(AVL10,"src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2023_2°SEMESTRE.csv");
						current.setNext(new LLAVL(AVL10));
						current = current.getNext();
						//AVL10.avRemove();

						long end = System.nanoTime() - start;
						System.out.println("o tempo usado pela AVLTree para inserir manualmente foi de " + end + " nanosegundos");

					}
					else if(aux == 2){
						LLBT current = headB;

						long start = System.nanoTime();

						// Primeiro semestre de 2019
						BinaryTree Btree = new BinaryTree();
						reader.readAndInsertNodesBynary(Btree, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2019_1°SEMESTRE.csv");
						current.setBT(Btree);
						
						// Segundo semestre de 2019
						BinaryTree Btree2 = new BinaryTree();
						reader.readAndInsertNodesBynary(Btree2, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2019_2°SEMESTRE.csv");
						current.setNext(new LLBT(Btree2));
						current = current.getNext();

						// Primeiro semestre de 2020
						BinaryTree Btree3 = new BinaryTree();
						reader.readAndInsertNodesBynary(Btree3, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2020_1°SEMESTRE.csv");
						current.setNext(new LLBT(Btree2));
						current = current.getNext();

						// Segundo semestre de 2020
						BinaryTree Btree4 = new BinaryTree();
						reader.readAndInsertNodesBynary(Btree4, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2020_2°SEMESTRE.csv");
						current.setNext(new LLBT(Btree2));
						current = current.getNext();

						// Primeiro semestre de 2021
						BinaryTree Btree5 = new BinaryTree();
						reader.readAndInsertNodesBynary(Btree5, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2021_1°SEMESTRE.csv");
						current.setNext(new LLBT(Btree2));
						current = current.getNext();

						// Segundo semestre de 2021
						BinaryTree Btree6 = new BinaryTree();
						reader.readAndInsertNodesBynary(Btree6, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2021_2°SEMESTRE.csv");
						current.setNext(new LLBT(Btree2));
						current = current.getNext();

						// Primeiro semestre de 2022
						BinaryTree Btree7 = new BinaryTree();
						reader.readAndInsertNodesBynary(Btree7, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2022_1°SEMESTRE.csv");
					    current.setNext(new LLBT(Btree2));
						current = current.getNext();

						// Segundo semestre de 2022
						BinaryTree Btree8 = new BinaryTree();
					    reader.readAndInsertNodesBynary(Btree8, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2022_2°SEMESTRE.csv");
					    current.setNext(new LLBT(Btree2));
						current = current.getNext();

						// Primeiro semestre de 2023
						BinaryTree Btree9 = new BinaryTree();
					    reader.readAndInsertNodesBynary(Btree9, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2023_1°SEMESTRE.csv");
					    current.setNext(new LLBT(Btree2));
						current = current.getNext();
					
						// Segundo semestre de 2023
						BinaryTree Btree10 = new BinaryTree();
					    reader.readAndInsertNodesBynary(Btree10,"src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2023_2°SEMESTRE.csv");
						current.setNext(new LLBT(Btree10));
						current = current.getNext();

						long end = System.nanoTime() - start;
					    System.out.println("o tempo usado pela BinaryTree para inserir foi de "+ (end) +" nanosegundos");
					}
					else{
					    System.out.println("Opção invalida!!");
					}
					break;
				
				case 3:
				    System.out.println("Caso deseje mostrar a AVLTree - 1\nCaso de deseje mostrar a BinaryTree - 2");
					aux = sc.nextInt();
					if(aux == 1){
					    long start = System.nanoTime();
					    
					    System.out.println("-=-=-=-=-=-=-=-=-=-=-Pre-order Arvore AVL-=-=-=-=-=-=-=-=-=-=--=-=-");
						head.getAvl().preOrderTraversal();
					    
					    long end = System.nanoTime()-start;
					    System.out.println("o tempo usado pela AVLTree para mostrar foi de "+ (end) +" nanosegundos");
					}
					else if(aux == 2){
					    long start = System.nanoTime();
					    
					    System.out.println("-=-=-=-=-=-=-=-=-=-=-Pre-order Arvore Binaria-=-=-=-=-=-=-=-=-=-=--=-=-");
						headB.getBT().preOrderTraversal();
					    
					    long end = System.nanoTime()-start;
					    System.out.println("o tempo usado pela BinaryTree para inserir foi de "+ (end) +" nanosegundos");
					}
					else{
					    System.out.println("Opção invalida!!");
					}
					break;

				case 4:
				    System.out.println("Caso deseje remover um valor da AVLTree - 1"+
				    "\nCaso de deseje remover um valor da BinaryTree - 2");
					aux = sc.nextInt();
				    if(aux == 1){
				        System.out.println("Qual o código da escola deseja remover");
				        aux = sc.nextInt();
					    long start = System.nanoTime();
					    
					    head.getAvl().remove(aux);
				        
				        long end = System.nanoTime()-start;
					    System.out.println("o tempo usado pela AVLTree para Remover foi de "+ (end) +" nanosegundos");
				    }
					else if(aux == 2){
					   System.out.println("Qual o código da escola deseja remover");
				        aux = sc.nextInt();
					    long start = System.nanoTime();
					    
						headB.getBT().remove(aux);
				        
				        long end = System.nanoTime()-start;
					    System.out.println("o tempo usado pela BinaryTree para Remover foi de "+ (end) +" nanosegundos");
					}
					else{
					    System.out.println("Opção invalida!!");
					}
					break;

				case 5:
				    System.out.println("Caso deseje apagar a AVLTree - 1\nCaso de deseje apagar a BinaryTree - 2");
					aux = sc.nextInt();
				    if(aux == 1){
					    long start = System.nanoTime();
					    
					    head.setNull();
				        
				        long end = System.nanoTime()-start;
					    System.out.println("o tempo usado para apagar a AVL foi de "+ (end) +" nanosegundos");
				    }
				    if(aux == 2){
					    long start = System.nanoTime();
					    
					    headB.setNull();
				        
				        long end = System.nanoTime()-start;
					    System.out.println("o tempo usado para apagar a BinaryTree foi de "+ (end) +" nanosegundos");
				    }
					else{
					    System.out.println("Opção invalida!!");
					}
					break;

				case 6:
				    System.out.println("Caso deseje Procurar na AVLTree - 1\nCaso de deseje Procurar na BinaryTree - 2");
					aux = sc.nextInt();
					BTNode busca = new BTNode();
				    if(aux == 1){
				        System.out.println("Qual o código da escola deseja Procurar? ");
				        aux = sc.nextInt();
					    long start = System.nanoTime();
						busca = head.getAvl().search(aux);
					    long end = System.nanoTime()-start;
					    System.out.println("o tempo usado para buscar na AVLTree foi de "+ (end) +" nanosegundos");
						if(busca!= null){
					        System.out.println(busca.toString());
					    }else{
					        System.out.println("node não existente");
					    }
				    }
				    else if(aux == 2){
				        System.out.println("Qual o código da escola deseja Procurar? ");
				        aux = sc.nextInt();
					    long start = System.nanoTime();
					    busca = headB.getBT().search(aux);
					    long end = System.nanoTime()-start;
					    System.out.println("o tempo usado para buscar na BinaryTree foi de "+ (end) +" nanosegundos");
					    if(busca!= null){
					        System.out.println(busca.toString());
					    }else{
					        System.out.println("node não existente");
					    }
				    }
					else{
					    System.out.println("Opção invalida!!");
					}
					break;
					
				case 7:
					System.out.println("Caso deseje analisar pela AVLTree - 1\nCaso de deseje analisar pela BinaryTree - 2");
					aux = sc.nextInt();
					if (aux == 1) {
						// Certifique-se de que head está corretamente configurado
						if (head != null) {
							long start = System.nanoTime();
							try {
								AVLTree avlTree = new AVLTree();
								avlTree.analise(head, "resultadoAVL.csv", "resultadoAVL.txt");
							} catch (OutOfMemoryError e) {
								System.out.println("Erro de memória: " + e.getMessage());
							}
							long end = System.nanoTime() - start;
							System.out.println("o tempo usado para analisar na AVLTree foi de " + end + " nanosegundos");
						} else {
							System.out.println("A lista ligada de AVLTree está vazia.");
						}
					} else if (aux == 2) {
						// Certifique-se de que LLBTP está corretamente configurado
						if (headB != null) {
							long start = System.nanoTime();
							try {
								BinaryTree BTree = new BinaryTree();
								BTree.analise(headB, "resultadoBT.csv", "resultadoBT.txt");
							} catch (OutOfMemoryError e) {
								System.out.println("Erro de memória: " + e.getMessage());
							}
							long end = System.nanoTime() - start;
							System.out.println("o tempo usado para analisar na BinaryTree foi de " + end + " nanosegundos");
						} else {
							System.out.println("A lista ligada de BinaryTree está vazia.");
						}
					} else {
						System.out.println("Opção invalida!!");
					}
					break;
					
				case 8:
					
					System.out.println("Só usou a AVLTree -1\nSó usou a BinaryTree -2\nUsou ambas -3\n");
					aux = sc.nextInt();
					switch(aux){
					    case 1 :
					        po2=1350;
					        head.setNull();
					        sc.close();
					        break;
				        case 2:
				            po2=1350;
				            headB.setNull();
				            sc.close();
					        break;
					    case 3:
					        po2=1350;
							head.setNull();
							headB.setNull();
					        sc.close();
					        break;
					    default:
					        System.out.println("\nOpção invalida\n");
					        break;
					}
					break;
					
				default:
				    System.out.println("\nOpção invalida\n");

			}

		}
		
	}
	public static int readInt(Scanner sc, String prompt) {
        System.out.println(prompt);
        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            sc.next(); // Consumir entrada inválida
        }
        return sc.nextInt();
    }
}