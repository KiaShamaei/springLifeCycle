package p01.scope.ClassConfig;


import org.springframework.stereotype.Component;


public class ProductDao {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
