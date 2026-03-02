class Animal {
    protected String type = "Generic Animal";

    protected void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    public void showInfo() {
        System.out.println("Type: " + type); 
        sound(); 
        System.out.println("Dog says: Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showInfo(); 
    }
}
