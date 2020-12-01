
public class Product_Manager {
    //iş katmanı class is here 
    //iş Katmanı
    private BaseProductDao baseProductDao;
    
//dependents == etkilenenler (olark ifade ediliyor yaprığımz işlem)
    //başka bir classs başka bir classın referansına bağımlı olma durumu(dependency injection == bağımlılık ekleme)
    //biz bunu constructur ile yapmış olduk
    public Product_Manager(BaseProductDao baseProductDao){
       
        this.baseProductDao = baseProductDao;
  

    }

    public void add(Product product) {
        baseProductDao.add(product);
        System.out.println("Ürün iş katmanı devreye girdi");
        System.out.println("Ürün iş katmanı devrede");
        System.out.println("Ürün iş katmanı işlemleri");
        System.out.println("Ürün ismi : " +product.getName());
        System.out.println("Ürün fiyatyı : " +product.getPrice());
    }
    
}
