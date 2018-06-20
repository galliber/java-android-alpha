package superheroes;

public class Power {
    private static final int MIN_NAME_LENGTH = 3;
    private static final int MAX_NAME_LENGTH = 20;
    private String name;
    private PowerType powerType;

    public Power(String name, PowerType powerType){
            setName(name);
            setPowerType(powerType);
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerType powerType) {
        this.powerType = powerType;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<MIN_NAME_LENGTH||name.length()>MAX_NAME_LENGTH)
            System.out.println("Invalid Name");
        this.name = name;
    }
}
