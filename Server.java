import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {

    private Scanner file;
    private ArrayList<Node> nodes;

    public Server() throws FileNotFoundException {

        java.io.File filePath = new java.io.File("data.csv");
        file = new Scanner(filePath);
        nodes = new ArrayList<Node>();

        while(hasAnotherLine()){
            String line = getline();
            String[] stringArray = line.split(",");
            int NodeID = Integer.parseInt(stringArray[0]);
            int YesID = Integer.parseInt(stringArray[1]);
            int NoID = Integer.parseInt(stringArray[2]);

            String description = stringArray[3];
            String question = stringArray[4];

            Node n = new Node();
            n.setNodeID(NodeID);
            n.setYesID(YesID);
            n.setNoID(NoID);
            n.setDescription(description);
            n.setQuestion(question);

            nodes.add(n);
        }
        Close();
    }

    public String getline() { return file.nextLine(); }
    public void Close(){file.close(); }

    public boolean hasAnotherLine() {return file.hasNext(); }

    public Node getNode(int NodeID){
        for (Node n: nodes){
            if (n.getNodeID() == NodeID){
                return n;
            }
        }
        return null;
    }
}
