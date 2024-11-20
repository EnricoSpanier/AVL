// imports para a fila usada na levelOrderTraversal(BTNode node). 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

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
	
	public BTNode getRoot() { 
	    return root;
	}
	
	public BTNode search(int data) {
        return search(root, data);
    }

    private BTNode search(BTNode node, int data) {
        if (node == null) {
            return null;
        }
        int diff = Integer.compare(data, node.getCod());
        if (diff < 0) {
            return search(node.getLeft(), data);
        } else if (diff > 0) {
            return search(node.getRight(), data);
        } else {
            return node;
        }
    }
	
	public void insert(int data, BTNode dados) {
        root = insert(root, null, data,dados);
        // Verificação após a inserção
        if (root.getParent() != null) {
            root = root.getParent();
        }
        root.setParent(null); // Garantir que o parent do root seja null
    }

    private BTNode insert(BTNode node, BTNode parent, int data, BTNode dados) {
        if (node == null) {
            dados.setParent(parent);
            return dados;
        }
        int diff = Integer.compare(data, node.getCod());
        if (diff < 0) {
            node.setLeft(insert(node.getLeft(), node, data,dados));
        } else{
            node.setRight(insert(node.getRight(), node, data,dados));
        } 
        return node;
    } 
	
    public void insertm(int data, BTNode dados) {
        root = insertm(root, null, data, dados);
        // Verificação após a inserção
        if (root.getParent() != null) {
            root = root.getParent();
        }
        root.setParent(null); // Garantir que o parent do root seja null
    }

    private BTNode insertm(BTNode node, BTNode parent, int data, BTNode dados) {
        Scanner sa = new Scanner(System.in);

        System.out.println("Insira o Nome da escola: ");
        String nome = sa.nextLine();
        while (nome.isEmpty()) {
            System.out.println("Valor inválido! Tente novamente");
            System.out.println("Insira o Nome da escola: ");
            nome = sa.next();
        }
        dados.setNome(nome);

        System.out.println("Insira o número de alunos no Ensino Infantil na escola: ");
        int EI = sa.nextInt();
        while (EI < 0) {
            System.out.println("Valor inválido! Tente novamente.");
            System.out.println("Insira o número de alunos no Ensino Infantil na escola: ");
            EI = sa.nextInt();
        }
        dados.setEI(String.valueOf(EI));
        
        System.out.println("Insira o número de alunos na Classe Especial na escola: ");
        int CE = sa.nextInt();
        while (CE < 0) {
            System.out.println("Valor inválido! Tente novamente.");
            System.out.println("Insira o número de alunos na Classe Especial na escola: ");
            CE = sa.nextInt();
        }
        dados.setCE(String.valueOf(CE));
        
        System.out.println("Insira o número de alunos na Sala de Recursos na escola: ");
        int SR = sa.nextInt();
        while (SR < 0) {
            System.out.println("Valor inválido! Tente novamente.");
            System.out.println("Insira o número de alunos na Sala de Recursos na escola: ");
            SR = sa.nextInt();
        }
        dados.setSR(String.valueOf(SR));
        
        System.out.println("Insira o número de alunos no Fundamental Anos Iniciais na escola: ");
        int AI = sa.nextInt();
        while (AI < 0) {
            System.out.println("Valor inválido! Tente novamente.");
            System.out.println("Insira o número de alunos no Fundamental Anos Iniciais na escola: ");
            AI = sa.nextInt();
        }
        dados.setAI(String.valueOf(AI));
        
        System.out.println("Insira o número de alunos no Fundamental Anos Finais na escola: ");
        int AF = sa.nextInt();
        while (AF < 0) {
            System.out.println("Valor inválido! Tente novamente.");
            System.out.println("Insira o número de alunos no Fundamental Anos Finais na escola: ");
            AF = sa.nextInt();
        }
        dados.setAF(String.valueOf(AF));
        
        System.out.println("Insira o número de alunos no Ensino Médio na escola: ");
        int EM = sa.nextInt();
        while (EM < 0) {
            System.out.println("Valor inválido! Tente novamente.");
            System.out.println("Insira o número de alunos no Ensino Médio na escola: ");
            EM = sa.nextInt();
        }
        dados.setEM(String.valueOf(EM));
        
        System.out.println("Insira o número de alunos no EJA - Fundamental Anos Iniciais na escola: ");
        int EJAFAI = sa.nextInt();
        while (EJAFAI < 0) {
            System.out.println("Valor inválido! Tente novamente.");
            System.out.println("Insira o número de alunos no EJA - Fundamental Anos Iniciais na escola: ");
            EJAFAI = sa.nextInt();
        }
        dados.setEJAFAI(String.valueOf(EJAFAI));
        
        System.out.println("Insira o número de alunos no EJA - Fundamental Anos Finais na escola: ");
        int EJAFAF = sa.nextInt();
        while (EJAFAF < 0) {
            System.out.println("Valor inválido! Tente novamente.");
            System.out.println("Insira o número de alunos no EJA - Fundamental Anos Finais na escola: ");
            EJAFAF = sa.nextInt();
        }
        dados.setEJAFAF(String.valueOf(EJAFAF));
        
        System.out.println("Insira o número de alunos no EJA - Ensino Médio na escola: ");
        int EJAEM = sa.nextInt();
        while (EJAEM < 0) {
            System.out.println("Valor inválido! Tente novamente.");
            System.out.println("Insira o número de alunos no EJA - Ensino Médio na escola: ");
            EJAEM = sa.nextInt();
        }
        dados.setEJAEM(String.valueOf(EJAEM));


        sa.close();

        if (node == null) {
            dados.setParent(parent);
            return dados;
        }

        int diff = Integer.compare(data, node.getCod());
        if (diff < 0) {
            node.setLeft(insertm(node.getLeft(), node, data, dados));
        } else if (diff > 0) {
            node.setRight(insertm(node.getRight(), node, data, dados));
        } else {
            node.setRep(1);
        }
        
        return node;
    }

    public void remove(int data) {
        if (search(root, data) != null) {
            System.out.println("\nValor " + data + " foi removido!\n");
            root = remove(root, data); // Atualiza a raiz após remoção
        } else {
            System.out.println("Valor " + data + " não encontrado.");
        }
        // Verificação após a remoção
        if (root != null && root.getParent() != null) {
            root = root.getParent();
        }
        if (root != null) {
            root.setParent(null);
        }
    }

    private BTNode remove(BTNode node, int data) {
        if (node == null) {
            return node; // Caso a árvore esteja vazia ou o nó não encontrado
        }

        // Caso 1: Se o valor a ser removido é maior que o valor do nó, vai para a subárvore direita
        if (data > node.getCod()) {
            node.setRight(remove(node.getRight(), data));
        }
        // Caso 2: Se o valor a ser removido é menor que o valor do nó, vai para a subárvore esquerda
        else if (data < node.getCod()) {
            node.setLeft(remove(node.getLeft(), data));
        }
        // Caso 3: Encontrou o nó a ser removido
        else {
            // Caso 3.1: O nó não tem filhos (nó folha)
            if (node.isLeaf()) {
                return null; // O nó é removido
            }   
            // Caso 3.2: O nó tem um filho à direita
            else if (node.getLeft() == null) {
                return node.getRight(); // Substitui o nó pelo filho à direita
            }
            // Caso 3.3: O nó tem um filho à esquerda
            else if (node.getRight() == null) {
                return node.getLeft(); // Substitui o nó pelo filho à esquerda
            }
            // Caso 3.4: O nó tem dois filhos
            else {
                // Encontrar o nó com o valor mínimo na subárvore direita (sucessor em ordem)
                BTNode minNode = findMin(node.getRight());
                node.setCod(minNode.getCod()); // Substitui o valor do nó a ser removido pelo sucessor
                node.setRight(remove(node.getRight(), minNode.getCod())); // Remove o sucessor
            }
        }
        return node; // Retorna o nó possivelmente alterado
    }

    private BTNode findMin(BTNode node) {
        while (node.getLeft() != null) {
            node = node.getLeft(); // Vai até o nó mais à esquerda
        }
    return node;
    }

	public String analise(LLBT head) {
        Map<String, List<BTNode>> municipios = new HashMap<>();
        
        LLBT current = head;
        while (current != null) {
            coletarDados(current.getBT().getRoot(), municipios);
            current = current.getNext();
        }

        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<String, List<BTNode>> entry : municipios.entrySet()) {
            String municipio = entry.getKey();
            List<BTNode> nodes = entry.getValue();

            double mediaEI = calcularMedia(nodes, "EI");
            double mediaCE = calcularMedia(nodes, "CE");
            double mediaSR = calcularMedia(nodes, "SR");
            double mediaAI = calcularMedia(nodes, "AI");
            double mediaAF = calcularMedia(nodes, "AF");
            double mediaEM = calcularMedia(nodes, "EM");
            double mediaEJAFAI = calcularMedia(nodes, "EJAFAI");
            double mediaEJAFAF = calcularMedia(nodes, "EJAFAF");
            double mediaEJAEM = calcularMedia(nodes, "EJAEM");

            resultado.append("Município: ").append(municipio).append("\n")
                    .append("Média de alunos na Educação Infantil: ").append(mediaEI).append("\n")
                    .append("Média de alunos nas Classes Especiais: ").append(mediaCE).append("\n")
                    .append("Média de alunos na Sala de Recursos: ").append(mediaSR).append("\n")
                    .append("Média de alunos nos Anos Iniciais: ").append(mediaAI).append("\n")
                    .append("Média de alunos nos Anos Finais: ").append(mediaAF).append("\n")
                    .append("Média de alunos no Ensino Médio: ").append(mediaEM).append("\n")
                    .append("Média de alunos no EJA Anos Iniciais: ").append(mediaEJAFAI).append("\n")
                    .append("Média de alunos no EJA Anos Finais: ").append(mediaEJAFAF).append("\n")
                    .append("Média de alunos no EJA Ensino Médio: ").append(mediaEJAEM).append("\n\n");
        }

        return resultado.toString();
    }

    private void coletarDados(BTNode node, Map<String, List<BTNode>> municipios) {
        if (node == null) {
            return;
        }

        String municipio = node.getMunicipio();
        municipios.putIfAbsent(municipio, new ArrayList<>());
        municipios.get(municipio).add(node);

        coletarDados(node.getLeft(), municipios);
        coletarDados(node.getRight(), municipios);
    }

    private double calcularMedia(List<BTNode> nodes, String tipo) {
        int soma = 0;
        int count = 0;

        for (BTNode node : nodes) {
            switch (tipo) {
                case "EI":
                    soma += Integer.parseInt(node.getEI());
                    break;
                case "CE":
                    soma += Integer.parseInt(node.getCE());
                    break;
                case "SR":
                    soma += Integer.parseInt(node.getSR());
                    break;
                case "AI":
                    soma += Integer.parseInt(node.getAI());
                    break;
                case "AF":
                    soma += Integer.parseInt(node.getAF());
                    break;
                case "EM":
                    soma += Integer.parseInt(node.getEM());
                    break;
                case "EJAFAI":
                    soma += Integer.parseInt(node.getEJAFAI());
                    break;
                case "EJAFAF":
                    soma += Integer.parseInt(node.getEJAFAF());
                    break;
                case "EJAEM":
                    soma += Integer.parseInt(node.getEJAEM());
                    break;
            }
            count++;
        }

        return count == 0 ? 0 : (double) soma / count;
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
        node.setCod(-1);
        node.setNome("");
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
			    "Código da escola - " + node.getCod() +
			    ", parent => {" + (node.getParent() != null ? node.getParent().getCod() : "null") + "}" +
			    ", right => {" + (node.getRight() != null ? node.getRight().getCod() : "null") + "}" +
			    ", left => {" + (node.getLeft() != null ? node.getLeft().getCod() : "null") + "}"
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
		sb.append("├─» " + node.getCod() + "\n");

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
