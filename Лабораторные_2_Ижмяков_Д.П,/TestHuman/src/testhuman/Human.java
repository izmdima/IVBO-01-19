package testhuman;

public class Human {
    
    private Hand LeftHand;
    private Hand RightHand;
    private Leg LeftLeg;
    private Leg RightLeg;
    private Head Head;
    private String name;
    
    
    Human(String name) 
    {
        this.name = name;
        LeftHand = new Hand();
        RightHand = new Hand();
        RightLeg = new Leg();
        LeftLeg = new Leg();
        Head = new Head();
    }
    
}
