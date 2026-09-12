package pack2;

public class Woman {
    String name;
    int age;

    public Woman(String n, int a) {
        name=n;
        age=a;
    }

    public void displayMe() {
        System.out.println("Woman's Name: " + name + ", Age: " + age);
    }
}