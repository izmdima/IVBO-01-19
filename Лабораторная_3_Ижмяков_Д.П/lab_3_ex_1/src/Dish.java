abstract public class Dish {
    protected String color;
    protected String company;

    Dish(){}
    Dish(String color, String company) {
        this.color = color;
        this.company = company;
    }

    abstract void use();

    void setColor(String color) {
        this.color = color;
    }
    String getColor() {
        return color;
    }

    void setCompany(String color) {
        this.company = company;
    }
    String getCompany() {
        return company;
    }
}
