import java.util.Scanner;
import java.util.InputMismatchException;
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

    private int getValidInput(Scanner sa) {
        int value = -1;
        while (value < 0) {
            try {
                value = sa.nextInt();
                if (value < 0) {
                    System.out.println("Valor inválido! Tente novamente");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro.");
                sa.nextLine(); // Limpa a entrada inválida
            }
        }
        return value;
    }



		public void insert(int data, BTNode dados) {
			root = insert(root, null, data,dados);
			// VerificaC'C#o apC3s a inserC'C#o
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

		@Override
		public String toString() {
			return "AVLTree - root => { " + root + " }";
		}
	}
