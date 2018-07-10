import slacklike.IconType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<SomeClass> sl=new ArrayList<>();
        sl.add(new SomeClass());

        boolean b=sl.stream().anyMatch(s->s instanceof SomeInerface);
        System.out.println(b);

        sl.add(new SomeClass2());
        b=sl.stream().anyMatch(s->s instanceof SomeInerface);
        System.out.println(b);

    }
}
