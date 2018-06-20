package superheroes;

import java.util.ArrayList;
import java.util.List;

public class SuperHero {


    private static final int ON_HIT_DAMAGE =10;
    private static final int MIN_NAME_LENGTH = 3;
    private static final int MAX_NAME_LENGTH = 60;
    private static final int MIN_SECRET_IDENTITY_LENGTH =3;
    private static final int MAX_SECRET_IDENTITY_LENGTH = 60;
    private static final int MIN_LIFE_POINTS = 0;
    private static final int MAX_LIFE_POINTS = 100;

    private String name;
    private String secretIdentity;
    private Alignment alignment;
    private int lifePoints;
    private List<PowerType> immunities;
    private List<Power> powers;


    public SuperHero(String name, String secretIdentity, Alignment alignment, int lifePoints) {
        this(name, secretIdentity, alignment, lifePoints,  new ArrayList<PowerType>(), new ArrayList<Power>());


    }

    public SuperHero(String name, String secretIdentity, Alignment alignment, int lifePoints, List<PowerType> immunities) {
        this(name, secretIdentity, alignment, lifePoints, immunities, new ArrayList<Power>());


    }

    SuperHero(String name, String secretIdentity, Alignment alignment, int lifePoints, List<PowerType> immunities, List<Power> powers) {
            setName(name);
            setSecretIdentity(secretIdentity);
            setAlignment(alignment);
            setLifePoints(lifePoints);
            setImmunities(immunities);
            setPowers(powers);


    }


    String getName() {
        return name;
    }

    void setName(String name) {
        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH)
            System.out.println("Invalid Name");
        else
            this.name = name;
    }

    String getSecretIdentity() {
        return secretIdentity;
    }

    private void setSecretIdentity(String secretIdentity) {
        if (secretIdentity.length() < MIN_SECRET_IDENTITY_LENGTH || secretIdentity.length() > MAX_SECRET_IDENTITY_LENGTH)
            System.out.println("Invalid Secret Identity");
        else
            this.secretIdentity = secretIdentity;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    private void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    int getLifePoints() {
        return lifePoints;
    }

    private void setLifePoints(int lifePoints) {
        if (lifePoints < MIN_LIFE_POINTS || lifePoints > MAX_LIFE_POINTS)
            System.out.println("Invalid life points");
        else
            this.lifePoints = lifePoints;
    }

    private List<PowerType> getImmunities() {
        return immunities;
    }

    private void setImmunities(List<PowerType> immunities) {
        this.immunities = immunities;
    }

    List<Power> getPowers() {
        return powers;
    }

    private void setPowers(List<Power> powers) {
        this.powers = powers;
    }


    void addPower(Power newPower) {
        powers.add(newPower);
    }

    void addImmunity(PowerType newImmunity) {
        immunities.add(newImmunity);
    }

    void attack(SuperHero victim, Power weapon) {
        if (victim.getImmunities().contains(weapon.getPowerType()))
            return;
        else
            victim.setLifePoints(victim.getLifePoints() - ON_HIT_DAMAGE);
    }

}
