package p03.profile.classConfig;

public class BeanOne implements BeanFood{
    private String name ;

    public BeanOne() {
        this.name = "bean one";
        System.out.println(name);
    }


    @Override
    public void make() {
        System.out.println("bean one");
    }
}
