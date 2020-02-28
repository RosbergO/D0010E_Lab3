import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GraphIO implements Graph {

    static public void readFile(Graph g, String filename) throws IOException {
    	
    	try {
    		System.out.println("fan");
    		File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int numberOfNodes = scanner.nextInt();
            int readLines = 0;
            
            while (readLines < numberOfNodes) {
                int id = scanner.nextInt();
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                g.addNode(id, x, y);
                readLines++;
            }
            while (scanner.hasNextLine()) {
                int id1 = scanner.nextInt();
                int id2 = scanner.nextInt();
                int weight = scanner.nextInt();
                g.addEdge(id1, id2, weight);
            }
    	}
    	catch (NoSuchElementException e) {
			// TODO: handle exception
		}
    }

    public void addNode(int id, int x, int y) {

    }

    public void addEdge(int id1, int id2, int weight) throws NoSuchElementException {

    }
}
