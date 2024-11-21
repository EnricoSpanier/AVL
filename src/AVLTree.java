import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AVLTree extends BinaryTree {

	public int data;

	public AVLTree() {
		super();
	}

	public AVLTree(BTNode root) {
		super(root);
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
        updateHeight(node);
        return balance(node);
    }

	public void insert(int data, BTNode dados) {
		root = insert(root, null, data,dados);
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
		} else if (diff > 0) {
			node.setRight(insert(node.getRight(), node, data,dados));
		} else {
			node.setRep(1);
		}
		updateHeight(node);
		return balance(node);
	}

	public void analise(LLAVL head, String csvFilePath, String txtFilePath) {
        Map<String, Map<String, List<BTNode>>> DistritoPorAnoSemestre = new LinkedHashMap<>();

        LLAVL current = head;
        int semestre = 1;
        int ano = 2019; // Ajuste o ano inicial conforme necessário
        while (current != null) {
            Map<String, List<BTNode>> Distrito = new LinkedHashMap<>();
            coletarDados(current.getAvl().getRoot(), Distrito);
            String chaveAnoSemestre = ano + ": Semestre " + semestre;
            DistritoPorAnoSemestre.put(chaveAnoSemestre, Distrito);
            current = current.getNext();
            semestre++;
            if (semestre > 2) {
                semestre = 1;
                ano++;
            }
        }

        StringBuilder resultadoTxt = new StringBuilder();
        StringBuilder resultadoCsv = new StringBuilder();
        resultadoCsv.append("Distrito,Ano Semestre,EI,CE,SR,AI,AF,EM,EJAFAI,EJAFAF,EJAEM\n");

        for (Map.Entry<String, Map<String, List<BTNode>>> entryAnoSemestre : DistritoPorAnoSemestre.entrySet()) {
            String anoSemestreKey = entryAnoSemestre.getKey();
            Map<String, List<BTNode>> Distrito = entryAnoSemestre.getValue();

            for (Map.Entry<String, List<BTNode>> entryDistrito : Distrito.entrySet()) {
                String distritoKey = entryDistrito.getKey();
                List<BTNode> nodes = entryDistrito.getValue();

                double mediaEI = calcularMedia(nodes, "EI");
                double mediaCE = calcularMedia(nodes, "CE");
                double mediaSR = calcularMedia(nodes, "SR");
                double mediaAI = calcularMedia(nodes, "AI");
                double mediaAF = calcularMedia(nodes, "AF");
                double mediaEM = calcularMedia(nodes, "EM");
                double mediaEJAFAI = calcularMedia(nodes, "EJAFAI");
                double mediaEJAFAF = calcularMedia(nodes, "EJAFAF");
                double mediaEJAEM = calcularMedia(nodes, "EJAEM");

                resultadoTxt.append("Distrito: ").append(distritoKey).append(" Ano: ").append(anoSemestreKey).append("\n")
                        .append("Média de alunos na Educação Infantil: ").append(mediaEI).append("\n")
                        .append("Média de alunos nas Classes Especiais: ").append(mediaCE).append("\n")
                        .append("Média de alunos na Sala de Recursos: ").append(mediaSR).append("\n")
                        .append("Média de alunos nos Anos Iniciais: ").append(mediaAI).append("\n")
                        .append("Média de alunos nos Anos Finais: ").append(mediaAF).append("\n")
                        .append("Média de alunos no Ensino Médio: ").append(mediaEM).append("\n")
                        .append("Média de alunos no EJA Anos Iniciais: ").append(mediaEJAFAI).append("\n")
                        .append("Média de alunos no EJA Anos Finais: ").append(mediaEJAFAF).append("\n")
                        .append("Média de alunos no EJA Ensino Médio: ").append(mediaEJAEM).append("\n\n");

                resultadoCsv.append(distritoKey).append(",").append(anoSemestreKey).append(",")
                        .append(mediaEI).append(",").append(mediaCE).append(",").append(mediaSR).append(",")
                        .append(mediaAI).append(",").append(mediaAF).append(",").append(mediaEM).append(",")
                        .append(mediaEJAFAI).append(",").append(mediaEJAFAF).append(",").append(mediaEJAEM).append("\n");
            }
        }

        try (FileWriter txtWriter = new FileWriter(txtFilePath);
             FileWriter csvWriter = new FileWriter(csvFilePath)) {
            txtWriter.write(resultadoTxt.toString());
            csvWriter.write(resultadoCsv.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	private void coletarDados(BTNode node, Map<String, List<BTNode>> Distrito) {
        if (node == null) {
            return;
        }

        String distrito = node.getDistrito();
        Distrito.putIfAbsent(distrito, new ArrayList<>());
        Distrito.get(distrito).add(node);

        coletarDados(node.getLeft(), Distrito);
        coletarDados(node.getRight(), Distrito);
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


	public void avRemove() {
		avRemoveAux(root);
		root = null;
	}

	public void avRemoveAux(BTNode node) {
		if(node.getLeft() != null) {
			avRemoveAux(node.getLeft());
		}
		if(node.getRight() != null) {
			avRemoveAux(node.getRight());
		}
		//BTNode replica = new BTNode();
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

	public void remove(int data) {
		if(search(root,data)!= null) {
			System.out.println("\nValor "+ data +" foi removido!\n");
		}
		root = removea(root,data);
		// VerificaC'C#o apC3s a remoC'C#o
		if (root != null && root.getParent() != null) {
			root = root.getParent();
		}
		if (root!= null) {
			root.setParent(null);
		}

	}

	private BTNode removea(BTNode node,int data) {
		if (node == null) {
			System.out.println("\nNC3 com valor " + data + " nC#o existe na BinaryTree!\n");
			return null;
		}
		if(node.getCod()==data && node.getRep()!=0) {
			node.setRep(-1);
		} else {
			int diff = Integer.compare(data, node.getCod());
			if (diff < 0) {
				node.setLeft(removea(node.getLeft(), data));
			} else if (diff > 0) {
				node.setRight(removea(node.getRight(), data));
			} else {
				if (node.isLeaf()) {
					return null;
				} else if (!node.hasLeftChild()) {
					return node.getRight();
				} else if (!node.hasRightChild()) {
					return node.getLeft();
				} else {
					BTNode predecessor = findMax(node.getLeft());
					node.setCod(predecessor.getCod());
					node.setLeft(removea(node.getLeft(), predecessor.getCod()));
				}
			}
		}
		updateHeight(node);
		return balance(node);
	}

	private BTNode balance(BTNode node) {
		int balanceFactor = getBalanceFactor(node);
		if (balanceFactor > 1) {
			if (getBalanceFactor(node.getLeft()) < 0) {
				node.setLeft(rotateLeft(node.getLeft()));
			}
			return rotateRight(node);
		} else if (balanceFactor < -1) {
			if (getBalanceFactor(node.getRight()) > 0) {
				node.setRight(rotateRight(node.getRight()));
			}
			return rotateLeft(node);
		}
		return node;
	}

	private void updateHeight(BTNode node) {
		node.setHeight(1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight())));
	}

	private int getHeight(BTNode node) {
		return node == null ? -1 : node.getHeight();
	}

	private int getBalanceFactor(BTNode node) {
		return node == null ? 0 : getHeight(node.getLeft()) - getHeight(node.getRight());
	}

	private BTNode rotateRight(BTNode y) {
		BTNode x = y.getLeft();
		BTNode T2 = x.getRight();

		x.setRight(y);
		y.setLeft(T2);

		if (T2 != null) {
			T2.setParent(y);
		}

		x.setParent(y.getParent());
		y.setParent(x);

		updateHeight(y);
		updateHeight(x);

		return x;
	}

	private BTNode rotateLeft(BTNode x) {
		BTNode y = x.getRight();
		BTNode T2 = y.getLeft();

		y.setLeft(x);
		x.setRight(T2);

		if (T2 != null) {
			T2.setParent(x);
		}

		y.setParent(x.getParent());
		x.setParent(y);

		updateHeight(x);
		updateHeight(y);

		return y;
	}

	public BTNode findMin() {
		return findMin(root);
	}

	private BTNode findMin(BTNode node) {
		if (node == null) {
			return null;
		}
		while (node.hasLeftChild()) {
			node = node.getLeft();
		}
		return node;
	}

	public BTNode findMax() {
		return findMax(root);
	}

	private BTNode findMax(BTNode node) {
		if (node == null) {
			return null;
		}
		while (node.hasRightChild()) {
			node = node.getRight();
		}
		return node;
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
			    ", getDegree(): " + node.getDegree() +
			    ", getHeight(): " + node.getHeight() +
			    ", parent => {" + (node.getParent() != null ? node.getParent().getCod() : "null") + "}" +
			    ", right => {" + (node.getRight() != null ? node.getRight().getCod() : "null") + "}" +
			    ", left => {" + (node.getLeft() != null ? node.getLeft().getCod() : "null") + "}"
			);
		//System.out.println(node.getData()+" ");
		preOrderTraversalhelper(node.getLeft());
		preOrderTraversalhelper(node.getRight());
	}

	@Override
	public String toString() {
		return "AVLTree - root => { " + root + " }";
	}
}
