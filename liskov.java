//liskov principle
interface Flyer {
    void fly();
}

class Sparrow implements Flyer {
    public void fly() {
        System.out.println("Sparrow can fly");
    }
}

class Eagle implements Flyer {
    public void fly() {
        System.out.println("Eagle can fly");
    }
}

public class liskov {
    public static void main(String[] args) {
        Flyer f = new Sparrow();
        f.fly();
    }
}
