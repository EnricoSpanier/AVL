import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    private String csvFile;
    private String csvSeparator = ";";

    public ReadCSV(String csvFile) {
        this.csvFile = csvFile;
    }

    public void readAndInsertNodes() {
        int i = 0;
        String line;
        BTNode rootNode = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            // Ignora o cabeçalho, se existir
            if ((line = reader.readLine()) != null) {
                //System.out.println("Cabeçalho: " + line);
            }

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(csvSeparator);
                String nome = data[0];
                String EI = data[1];
                String CE = data[2];
                String SR = data[3];
                String AI = data[4];
                String AF = data[5];
                String EM = data[6];
                String EJAFAI = data[7];
                String EJAFAF = data[8];
                String EJAEM = data[9];
                
                BTNode node = new BTNode(nome);
                node.setEI(EI);
                node.setCE(CE);
                node.setSR(SR);
                node.setAI(AI);
                node.setAF(AF);
                node.setEM(EM);
                node.setEJAFAI(EJAFAI);
                node.setEJAFAF(EJAFAF);
                node.setEJAEM(EJAEM);
                
                if (rootNode == null) {
                    rootNode = node;
                } else {
                    insertNode(rootNode, node);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void insertNode(BTNode parent, BTNode newNode) {
        if (newNode.getEndereco().compareTo(parent.getEndereco()) < 0) {
            if (parent.getLeft() == null) {
                parent.setLeft(newNode);
            } else {
                insertNode(parent.getLeft(), newNode);
            }
        } else {
            if (parent.getRight() == null) {
                parent.setRight(newNode);
            } else {
                insertNode(parent.getRight(), newNode);
            }
        }
    }

}
