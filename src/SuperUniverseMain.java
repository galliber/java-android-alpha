import superheroes.Power;
import superheroes.PowerType;
import superuniverse.*;
public class SuperUniverseMain {
    public static void main(String[] args){
        Hero superman=new Superhero("Superman", 100, Gender.MALE, "Clark Kent", "An alien with dead parents.", true);
        Hero wonderWoman=new Superhero("WonderWoman", 58, Gender.FEMALE,"Diana Prince", "An amazon that is a demi-god.", true);
        Hero darkseid=new Supervilain("Darkseid", 200, Gender.MALE, "Prince Uxas", "Alien", false);
        Hero someHero=new Hero("SomeHero", 50, Gender.FEMALE, "None", "None", false);
        superman.addSuperpower(new Power("SuperStrength", PowerType.OTHER));
        wonderWoman.addSuperpower(new Power("MindReading", PowerType.INTELLECT));
        darkseid.addSuperpower(new Power("MindControll", PowerType.MAGIC));
        Person somePerson=new Person("SomePerson", 70, Gender.MALE);
        System.out.println(someHero.getName());

    }

}
