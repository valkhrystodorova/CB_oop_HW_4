package task2;

public class Main {
    public static void main(String[] args) {
        AbstractHandler[] documents = {new XMLHandler(), new TXTHandler(), new DOCHandler()};
        for (AbstractHandler document : documents) {
            document.open();
            document.create();
            document.change();
            document.save();

        }
    }
}
