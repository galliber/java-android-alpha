package superheroes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //Create default SuperHero
        SuperHero def=new SuperHero("Default", "SecretDefault", Alignment.EVIL, 50);

        //Create batman(SuperHero)
        SuperHero batman=new SuperHero("Batman", "Bruce Wayne", Alignment.GOOD, 100);

        //Add Immunities and powers to batman
        batman.addImmunity(PowerType.INTELLECT);
        batman.addImmunity(PowerType.TECH);

        batman.addPower(new Power("Intelect", PowerType.INTELLECT));
        batman.addPower(new Power("Money", PowerType.OTHER));


        //Add Powers to default SuperHero
        def.addPower(new Power("PowerHit", PowerType.MAGIC));
        def.addPower(new Power("MindControll", PowerType.INTELLECT));

        //Show batman's initial health points
        System.out.println("Batman's HP before attack:"+batman.getLifePoints());

        //default SuperHero attacks batman
        def.attack(batman, def.getPowers().get(0));

        //Show batman's health points after first attack
        System.out.println("Batman's HP after 1st attack(Not immune):"+batman.getLifePoints());

        //defalt SuperHero attacks batman again
        def.attack(batman, def.getPowers().get(1));

        //Show batman's health points after second attack
        System.out.println("Batman's HP after 1st attack(Immune):"+batman.getLifePoints());

        //default SuperHero's initial name
        System.out.println("Default SuperHero's name: "+def.getName());

        //Set default SuperHero's name to an invalid one
        def.setName("2");

        //defalt SuperHero's name after Set with invalid one
        System.out.println("Default SuperHero's name after invalid Set: "+def.getName());

        //Set default SuperHero's name to a valid one
        def.setName("Superman");

        //default SuperHero's name after valid input
        System.out.println("Default SuperHero's name after valid Set"+def.getName());

    }
}
