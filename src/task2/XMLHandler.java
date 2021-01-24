package task2;

public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.print("XML document open");

    }

    @Override
    void create() {
        System.out.print("XML document created");

    }

    @Override
    void change() {
        System.out.print("XML document changed");

    }

    @Override
    void save() {
        System.out.print("XML document saved");

    }
}
