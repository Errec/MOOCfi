import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void add() {
        System.out.print("In Finnish: ");
        String key = reader.nextLine();
        System.out.print("Translation: ");
        String value = reader.nextLine();

        dictionary.add(key,value);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(word));
    }

    public void start() {

        boolean done = false;

        System.out.println("Statements:\n\tadd - adds a word pair to the dictionary" +
                                      "\n\tquit - quit the text user interface" +
                                      "\n\ttranslate - asks a word and prints its translation\n");
        while(!done) {
            System.out.print("Statement: ");
            String str = reader.nextLine();

            switch (str) {
                case "quit":
                    System.out.println("Cheers!\n");
                    done = true;
                    break;

                case "add":
                    add();
                    break;

                case "translate":
                    translate();
                    break;

                default:
                    System.out.println("Unknown statement\n");
                    break;
            }

        }
    }
}
