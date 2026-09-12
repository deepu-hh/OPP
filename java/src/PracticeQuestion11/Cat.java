package PracticeQuestion11;
class Cat extends Animal implements Pet {
    String name;
    Cat(String name) {
        super(4);
        this.name=name;
    }
    Cat() {
        this("Unknown");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void play() {
        System.out.println(name + " plays with a ball.");
    }
    public void eat() {
        System.out.println(name + " eats fish.");
    }
    public void walk() {
        System.out.println(name + " walks using 4 legs.");
    }
}