package superuniverse;
import superheroes.*;

import java.util.ArrayList;
import java.util.List;


public class Hero extends Person {
    private String secretIdentity;
    private String backStory;
    private boolean isGood;
    private List<Power> listOfPowers;

    public Hero(String name, int weight, Gender gender, String secretIdentity, String backStory, boolean isGood, List<Power> listOfPowers) {
        super(name, weight, gender);
        setSecretIdentity(secretIdentity);
        setBackStory(backStory);
        setIsGood(isGood);
        setListOfPowers(listOfPowers);
    }

    public Hero(String name, int weight, Gender gender, String secretIdentity, String backStory, boolean isGood) {
        this(name, weight, gender, secretIdentity, backStory, isGood, new ArrayList<Power>());
    }

    public void addSuperpower(Power power){
        listOfPowers.add(power);
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public String getBackStory() {
        return backStory;
    }

    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setIsGood(boolean good) {
        isGood = good;
    }

    public List<Power> getListOfPowers() {
        return listOfPowers;
    }

    public void setListOfPowers(List<Power> listOfPowers) {
        this.listOfPowers = listOfPowers;
    }



}
