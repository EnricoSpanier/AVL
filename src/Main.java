import java.util.Scanner;

public class Main {
	public static void main(String args[]){
	    LLAVL LLAVLP = new LLAVL();
	    LLBT LLBTP = new LLBT();
        BinaryTree BTree = new BinaryTree();
        AVLTree AVL = new AVLTree();
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
					    long start = System.currentTimeMillis();
					    System.out.println("Insira o código da escola que deseja inserir");
					    int cod = sc.nextInt();
					    BTNode node = new BTNode(cod);
					    AVL.insertm(cod,node);
					    long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado pela AVLTree para inserir manualmente foi de "+ (end) +" milisegundos");
					}
					else if(aux == 2){
					    long start = System.currentTimeMillis();
					    System.out.println("Insira o código da escola que deseja inserir");
					    int cod = sc.nextInt();
					    BTNode node = new BTNode();
					   	BTree.insertm(cod,node);
					    long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado pela AVLTree para inserir manualmente foi de "+ (end) +" milisegundos");
					}
					else{
					    System.out.println("Opção invalida!!");
					}
					break;
			    
				case 2:
				    System.out.println("Caso deseje montar a AVLTree - 1\nCaso de deseje montar a BinaryTree - 2");
					aux = sc.nextInt();
					if(aux == 1){
					    LLAVL LLAVLA = new LLAVL();
					    long start = System.currentTimeMillis();
					    reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2019_1°SEMESTRE.csv");
					    LLAVLP.setAvl(AVL);
					    AVL.avRemove();
					    reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2019_2°SEMESTRE.csv");
					    LLAVLP.setNext(AVL);
					    LLAVLA.setAvl(LLAVLP.getNext());
					    AVL.avRemove();
					    reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2020_1°SEMESTRE.csv");
					    LLAVLA.setNext(AVL);
					    LLAVLA.setAvl(LLAVLA.getNext());
					    AVL.avRemove();
					    reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2020_2°SEMESTRE.csv");
					    LLAVLA.setNext(AVL);
					    LLAVLA.setAvl(LLAVLA.getNext());
					    AVL.avRemove();
					    reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2021_1°SEMESTRE.csv");
					    LLAVLA.setNext(AVL);
					    LLAVLA.setAvl(LLAVLA.getNext());
					    AVL.avRemove();
					    reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2021_2°SEMESTRE.csv");
					    LLAVLA.setNext(AVL);
					    LLAVLA.setAvl(LLAVLA.getNext());
					    AVL.avRemove();
					    reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2022_1°SEMESTRE.csv");
					    LLAVLA.setNext(AVL);
					    LLAVLA.setAvl(LLAVLA.getNext());
					    AVL.avRemove();
					    reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2022_2°SEMESTRE.csv");
					    LLAVLA.setNext(AVL);
					    LLAVLA.setAvl(LLAVLA.getNext());
					    AVL.avRemove();
					    reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2023_1°SEMESTRE.csv");
					    LLAVLA.setNext(AVL);
					    LLAVLA.setAvl(LLAVLA.getNext());
					    AVL.avRemove();
					    reader.readAndInsertNodesAvl(AVL, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2023_2°SEMESTRE.csv");
					    LLAVLA.setNext(AVL);
					    LLAVLA.setAvl(LLAVLA.getNext());
					    
					    long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado pela AVLTree para inserir foi de "+ (end) +" milisegundos");
					}
					else if(aux == 2){
					    LLBT LLBTA = new LLBT();
					    long start = System.currentTimeMillis();
					    reader.readAndInsertNodesBynary(BTree, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2019_1°SEMESTRE.csv");
					    LLBTP.setBT(BTree);
					    BTree.avRemove();
					    reader.readAndInsertNodesBynary(BTree, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2019_2°SEMESTRE.csv");
					    LLBTP.setNext(BTree);
					    LLBTA.setBT(LLBTP.getNext());
					    BTree.avRemove();
					    reader.readAndInsertNodesBynary(BTree, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2020_1°SEMESTRE.csv");
					    LLBTA.setNext(BTree);
					    LLBTA.setBT(LLBTA.getNext());
					    BTree.avRemove();
					    reader.readAndInsertNodesBynary(BTree, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2020_2°SEMESTRE.csv");
					    LLBTA.setNext(BTree);
					    LLBTA.setBT(LLBTA.getNext());
					    BTree.avRemove();
					    reader.readAndInsertNodesBynary(BTree, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2021_1°SEMESTRE.csv");
					    LLBTA.setNext(BTree);
					    LLBTA.setBT(LLBTA.getNext());
					    BTree.avRemove();
					    reader.readAndInsertNodesBynary(BTree, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2021_2°SEMESTRE.csv");
					    LLBTA.setNext(BTree);
					    LLBTA.setBT(LLBTA.getNext());
					    BTree.avRemove();
					    reader.readAndInsertNodesBynary(BTree, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2022_1°SEMESTRE.csv");
					    LLBTA.setNext(BTree);
					    LLBTA.setBT(LLBTA.getNext());
					    BTree.avRemove();
					    reader.readAndInsertNodesBynary(BTree, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2022_2°SEMESTRE.csv");
					    LLBTA.setNext(BTree);
					    LLBTA.setBT(LLBTA.getNext());
					    BTree.avRemove();
					    reader.readAndInsertNodesBynary(BTree, "src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2023_1°SEMESTRE.csv");
					    LLBTA.setNext(BTree);
					    LLBTA.setBT(LLBTA.getNext());
					    BTree.avRemove();
					    reader.readAndInsertNodesBynary(BTree,"src\\csv\\Quantidade de alunos por tipo de ensino da rede estadual_2023_2°SEMESTRE.csv");
					    LLBTA.setNext(BTree);
					    LLBTA.setBT(LLBTA.getNext());
					    
					    long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado pela BinaryTree para inserir foi de "+ (end) +" milisegundos");
					}
					else{
					    System.out.println("Opção invalida!!");
					}
					break;
				
				case 3:
				    System.out.println("Caso deseje mostrar a AVLTree - 1\nCaso de deseje mostrar a BinaryTree - 2");
					aux = sc.nextInt();
					if(aux == 1){
					    long start = System.currentTimeMillis();
					    
					    System.out.println("-=-=-=-=-=-=-=-=-=-=-Pre-order Arvore AVL-=-=-=-=-=-=-=-=-=-=--=-=-");
					    AVL.preOrderTraversal();
					    
					    long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado pela AVLTree para mostrar foi de "+ (end) +" milisegundos");
					}
					else if(aux == 2){
					    long start = System.currentTimeMillis();
					    
					    System.out.println("-=-=-=-=-=-=-=-=-=-=-Pre-order Arvore Binaria-=-=-=-=-=-=-=-=-=-=--=-=-");
					    BTree.preOrderTraversal();
					    
					    long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado pela BinaryTree para inserir foi de "+ (end) +" milisegundos");
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
					    long start = System.currentTimeMillis();
					    
					    AVL.remove(aux);
				        
				        long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado pela AVLTree para Remover foi de "+ (end) +" milisegundos");
				    }
					else if(aux == 2){
					   System.out.println("Qual o código da escola deseja remover");
				        aux = sc.nextInt();
					    long start = System.currentTimeMillis();
					    
					    BTree.remove(aux);
				        
				        long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado pela BinaryTree para Remover foi de "+ (end) +" milisegundos");
					}
					else{
					    System.out.println("Opção invalida!!");
					}
					break;

				case 5:
				    System.out.println("Caso deseje apagar a AVLTree - 1\nCaso de deseje apagar a BinaryTree - 2");
					aux = sc.nextInt();
				    if(aux == 1){
					    long start = System.currentTimeMillis();
					    
					    AVL.avRemove();
				        
				        long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado para apagar a AVL foi de "+ (end) +" milisegundos");
				    }
				    if(aux == 2){
					    long start = System.currentTimeMillis();
					    
					    BTree.avRemove();
				        
				        long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado para apagar a BinaryTree foi de "+ (end) +" milisegundos");
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
					    long start = System.currentTimeMillis();
					    busca = AVL.search(aux);
					    long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado para buscar na AVLTree foi de "+ (end) +" milisegundos");
					    if(busca!= null){
					        System.out.println(busca.toString());
					    }else{
					        System.out.println("node não existente");
					    }
				    }
				    else if(aux == 2){
				        System.out.println("Qual o código da escola deseja Procurar? ");
				        aux = sc.nextInt();
					    long start = System.currentTimeMillis();
					    busca = BTree.search(aux);
					    long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado para buscar na BinaryTree foi de "+ (end) +" milisegundos");
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
					if(aux == 1){
					    long start = System.currentTimeMillis();
					    System.out.println(AVL.analise());
					    long end = System.currentTimeMillis()-start;
					    System.out.println("o tempo usado para analisar na AVLTree foi de "+ (end) +" milisegundos");
				    }
				    else if(aux == 2){
					    long start = System.currentTimeMillis();
					    System.out.println(BTree.analise());
					    long end = System.currentTimeMillis()-start;
					    System.out.println("\nO tempo usado para buscar na BinaryTree foi de "+ (end) +" milisegundos");
				    }
					else{
					    System.out.println("Opção invalida!!");
					}
					break;
					
				case 8:
					
					System.out.println("Só usou a AVLTree -1\nSó usou a BinaryTree -2\nUsou ambas -3\n");
					aux = sc.nextInt();
					switch(aux){
					    case 1 :
					        po2=1350;
					        AVL.avRemove();
					        sc.close();
					        break;
				        case 2:
				            po2=1350;
				            BTree.avRemove();
				            sc.close();
					        break;
					    case 3:
					        po2=1350;
					        AVL.avRemove();
					        BTree.avRemove();
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

/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
       BinaryTree BTree = new BinaryTree();
       AVLTree AVL = new AVLTree();
       ReadCSV reader = new ReadCSV("TrabJava.csv");
       reader.readAndInsertNodes(BTree, AVL);
       
       // As árvores estão agora preenchidas e podem ser usadas conforme necessário
       BTNode binaryTreeRoot = BTree.getRoot();
       BTNode avlTreeRoot = AVL.getRoot();
       
       // Exemplo de uso das árvores 
       //BTree.preOrderTraversal();
       System.out.println("Raiz da Árvore Binária: \n" + AVL.inOrderTraversal());
       //System.out.println("Raiz da Árvore AVL: " + avlTreeRoot);
    }
}*/
