package Main;
import pack1.Man;
import pack2.Woman;

public class Main {
    public static void main(String[] args) {

        Man m = new Man("Deepu", 19);
        Woman w = new Woman("Jane", 35);

        m.displayMe();
        w.displayMe();
    }
}
