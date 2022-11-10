package p03.profile.classConfig;

public class BeanTwo implements BeanFood{
    private String name  ;

    public BeanTwo(String name) {
        this.name = name;
        System.out.println(name);
    }

    public BeanTwo() {
        System.out.println(name);
    }

    @Override
    public void make() {
        System.out.println(name);

    }
}
