package PracticeQuestion11;
class Fish extends Animal implements Pet {
    String name;
    Fish() {
        super(0);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void play() {
        System.out.println(name + " plays in the water.");
    }
    public void walk() {
        System.out.println(name + " cannot walk.");
    }
    public void eat() {
        System.out.println(name + " eats food.");
    }
}