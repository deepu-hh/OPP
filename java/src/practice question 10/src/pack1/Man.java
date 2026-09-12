package pack1;

public class Man {
    String name;
    int age;

    public Man(String n, int a) {
        name=n;
        age=a;
    }

    public void displayMe() {
        System.out.println("Man's Name: " + name + ", Age: " + age);
    }
}