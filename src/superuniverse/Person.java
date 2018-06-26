package superuniverse;

public class Person {
    private String name;
    private int weight;
    private Gender gender;

    public Person(String name, int weight, Gender gender) {
        setName(name);
        setWeight(weight);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 0)
            return;
        else
            this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 1)
            return;
        else
            this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
