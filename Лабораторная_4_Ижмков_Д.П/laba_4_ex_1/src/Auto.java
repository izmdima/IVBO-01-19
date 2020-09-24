public class Auto implements Nameable{
    String name;
    String version;

    Auto(String name,String version) {
        this.name = name;
        this.version = version;
    }

    public String getName(){
        return "Название автомобиля: " + name + " серии " + version;
    }
}
