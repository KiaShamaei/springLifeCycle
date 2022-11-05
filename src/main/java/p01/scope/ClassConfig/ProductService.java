package p01.scope.ClassConfig;


public class ProductService {
    private String name ;
    private ProductDao productDao;

    public ProductService(ProductDao dao1) {
        this.productDao = dao1;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
