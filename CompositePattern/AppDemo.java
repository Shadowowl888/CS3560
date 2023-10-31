package CompositePattern;

public class AppDemo {
    public static void main(String[] args) {
        Wheel w1 = new Wheel();
        w1.setMode("Contin1");
        Wheel w2 = new Wheel();
        w2.setMode("Contin1");

        Engine e1 = new Engine();
        Body b1 = new Body();

        Car car1 = new Car();
        
    }
}
