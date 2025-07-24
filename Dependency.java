//DependencyInversion
interface Keyboard {
    void type();
}

class WiredKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing using Wired Keyboard");
    }
}

public class Dependency {
    private Keyboard keyboard;

    public Dependency(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void startTyping() {
        keyboard.type();
    }

    public static void main(String[] args) {
        Keyboard keyboard = new WiredKeyboard();
        Dependency computer = new Dependency(keyboard);
        computer.startTyping();
    }
}
