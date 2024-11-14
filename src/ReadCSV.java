import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    private String csvFile;
    private String csvSeparator = ";";

    public ReadCSV(String csvFile) {
        this.csvFile = csvFile;
    }

    public void readAndInsertNodes(BinaryTree binaryTree, AVLTree avlTree) {
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            // Ignora o cabeçalho, se existir
            if ((line = reader.readLine()) != null) {
                //System.out.println("Cabeçalho: " + line);
            }

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(csvSeparator);
                String Endereco = data[0];
                String EI = data[1];
                String CE = data[2];
                String SR = data[3];
                String AI = data[4];
                String AF = data[5];
                String EM = data[6];
                String EJAFAI = data[7];
                String EJAFAF = data[8];
                String EJAEM = data[9];
                
                BTNode node = new BTNode(Endereco);
                node.setEI(EI);
                node.setCE(CE);
                node.setSR(SR);
                node.setAI(AI);
                node.setAF(AF);
                node.setEM(EM);
                node.setEJAFAI(EJAFAI);
                node.setEJAFAF(EJAFAF);
                node.setEJAEM(EJAEM);
                
                binaryTree.insert(Endereco, node);
                avlTree.insert(Endereco, node);

                System.out.println(node.toString());
                //System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
