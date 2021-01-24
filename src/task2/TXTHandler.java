package task2;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.print("TXT document open");

    }

    @Override
    void create() {
        System.out.print("TXT document created");

    }

    @Override
    void change() {
        System.out.print("TXT document changed");

    }

    @Override
    void save() {
        System.out.print("TXT document saved");

    }
}
