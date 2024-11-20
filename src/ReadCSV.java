import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    private String csvSeparator = ";";


    public void readAndInsertNodesBynary(BinaryTree binaryTree,String csvFile) {
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            // Ignora o cabeçalho, se existir
            if ((line = reader.readLine()) != null) {
                //System.out.println("Cabeçalho: " + line);
            }

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(csvSeparator);
                int Cod = Integer.valueOf(data[0]);
                String Nome = data[1];
                String EI = data[2];
                String CE = data[3];
                String SR = data[4];
                String AI = data[5];
                String AF = data[6];
                String EM = data[7];
                String EJAFAI = data[8];
                String EJAFAF = data[10];
                String EJAEM = data[9];
                
                BTNode node = new BTNode(Cod);
                node.setNome(Nome);
                node.setEI(EI);
                node.setCE(CE);
                node.setSR(SR);
                node.setAI(AI);
                node.setAF(AF);
                node.setEM(EM);
                node.setEJAFAI(EJAFAI);
                node.setEJAFAF(EJAFAF);
                node.setEJAEM(EJAEM);
                
                binaryTree.insert(Cod, node);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void readAndInsertNodesAvl(AVLTree avl, String csvFile) {
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            // Ignora o cabeçalho, se existir
            if ((line = reader.readLine()) != null) {
                //System.out.println("Cabeçalho: " + line);
            }

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(csvSeparator);
                int Cod = Integer.valueOf(data[0]);
                String Nome = data[1];
                String EI = data[2];
                String CE = data[3];
                String SR = data[4];
                String AI = data[5];
                String AF = data[6];
                String EM = data[7];
                String EJAFAI = data[8];
                String EJAFAF = data[10];
                String EJAEM = data[9];
                
                BTNode node = new BTNode(Cod);
                node.setNome(Nome);
                node.setEI(EI);
                node.setCE(CE);
                node.setSR(SR);
                node.setAI(AI);
                node.setAF(AF);
                node.setEM(EM);
                node.setEJAFAI(EJAFAI);
                node.setEJAFAF(EJAFAF);
                node.setEJAEM(EJAEM);
                
                avl.insert(Cod, node);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}