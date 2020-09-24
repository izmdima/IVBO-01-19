public class Animal implements Nameable{
    String name;
    String who;

    Animal(String name, String who) {
        this.name = name;
        this.who = who;
    }

    public String getName(){
        return "Животное является " + who + " и его зовут " + name;
    }
}

