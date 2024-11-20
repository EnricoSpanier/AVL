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
                String Municipio = data[3]
                int Cod = Integer.valueOf(data[5]);
                String Nome = data[8];
                String EI = data[15];
                String CE = data[16];
                String SR = data[17];
                String AI = data[18];
                String AF = data[19];
                String EM = data[20];
                String EJAFAI = data[21];
                String EJAFAF = data[23];
                String EJAEM = data[22];
                
                BTNode node = new BTNode(Cod);
                node.setMunicipio(Municipio)
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
                String Municipio = data[3]
                int Cod = Integer.valueOf(data[5]);
                String Nome = data[8];
                String EI = data[15];
                String CE = data[16];
                String SR = data[17];
                String AI = data[18];
                String AF = data[19];
                String EM = data[20];
                String EJAFAI = data[21];
                String EJAFAF = data[23];
                String EJAEM = data[22];
                
                BTNode node = new BTNode(Cod);
                node.setMunicipio(Municipio)
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