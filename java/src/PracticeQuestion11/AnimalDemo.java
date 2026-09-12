package PracticeQuestion11;
public class AnimalDemo {
    public static void main(String[] args) {
    	Spider s = new Spider();
        Cat c = new Cat("Kitty");
        Fish f = new Fish();
        f.setName("Goldie");
        System.out.println("--- Spider ---");
        s.eat();
        s.walk();
        System.out.println("\n--- Cat ---");
        System.out.println("Name: " + c.getName());
        c.eat();
        c.walk();
        c.play();
        System.out.println("\n--- Fish ---");
        System.out.println("Name: " + f.getName());
        f.eat();
        f.walk();
        f.play();
        System.out.println("\n--- Polymorphism ---");
        Animal a1 = new Spider();
        Animal a2 = new Cat("Tom");
        Animal a3 = new Fish();
        a1.eat();
        a2.eat();
        a3.eat();
        a1.walk();
        a2.walk();
        a3.walk();
    }
}