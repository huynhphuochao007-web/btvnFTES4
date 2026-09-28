public class Dog extends Pet {
    public Dog() {
        super();
    }
    
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    public String speak() {
        return "Dog is barking";
    }
    public void fetchBall() {
        System.out.println("Dog is fetching ball!");
    }
}
