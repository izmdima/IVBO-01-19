public class Planet implements Nameable{
    String name;

    Planet(String name) {
        this.name = name;
    }

    public String getName(){
        return "Название планеты: " + name;
    }
}

