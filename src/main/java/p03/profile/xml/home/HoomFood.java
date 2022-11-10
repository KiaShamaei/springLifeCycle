package p03.profile.xml.home;

import p03.profile.xml.FoodProvider;

public class HoomFood implements FoodProvider {
    @Override
    public void make() {
        System.out.println("kababHome");
        System.out.println("bozHome");
    }
}
