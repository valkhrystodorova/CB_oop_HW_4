package task2;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.print("DOC document open");

    }

    @Override
    void create() {
        System.out.print("DOC document created");

    }

    @Override
    void change() {
        System.out.print("DOC document changed");

    }

    @Override
    void save() {
        System.out.print("DOC document saved");

    }
}
