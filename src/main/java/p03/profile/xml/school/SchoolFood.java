package p03.profile.xml.school;

import p03.profile.xml.FoodProvider;

public class SchoolFood implements FoodProvider {
    @Override
    public void make() {
        System.out.println("kababSchool");
        System.out.println("bozSchool");
    }
}
