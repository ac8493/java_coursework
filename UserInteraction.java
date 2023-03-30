import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class UserInteraction {
    static Server svr;
    public static void main(String[] args) throws FileNotFoundException {
        svr = new Server();
        Node n = svr.getNode(1);
        Scanner UserInput = new Scanner(System.in);
        console:
        while (true) {
            System.out.println(n.getQuestion());
            System.out.println(n.getDescription());
            String NextNodeID = UserInput.nextLine();

            switch (NextNodeID) {
                case "1":
                    n = svr.getNode(n.getYesID());
                    break;
                case "2":
                    n = svr.getNode(n.getNoID());
                    break;
                case "3":
                    break console;
                default:
                    System.out.println("INPUT ERROR: Please ensure you are only using [1] OR [2] to enter your input. USE [3] if you wish to exit.\n");
                    break;
            }
            }
    }
    }
