import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scan the user input
        int Input = 0;

        // a call to SingleLinkedList class
        SingleLinkedList List = new SingleLinkedList();

        // reading from user input
        try (Scanner reader = new Scanner(System.in)) {

        Input = reader.nextInt();
        List.AddNode(Input, false);

        Input = reader.nextInt();
        List.AddNode(Input, true);
        List.Delete(false);
        }
    }
}