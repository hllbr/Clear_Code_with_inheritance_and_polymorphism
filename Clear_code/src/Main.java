
public class Main {
    public static void main(String[] args) {
        BaseProductDao baseProductDao = new OracleProductDao("Oracle String");
        baseProductDao.add(new Product(1, "halı", 2));
        Product_Manager product_Manager = new Product_Manager(new OracleProductDao("Oracle String"));
        product_Manager.add(new Product(3, "COCONUT", 58));
        Product_Manager mysql = new Product_Manager(new MysqlProductDao("Mysql String"));
        mysql.add(new Product(58, "@potato",850));
        
        //sistemde oymana yapmadık ihtiyaç duymadık sadece bir kelimeyi main class içerisinde obje oluşturma kısmında değiştirerek farklı bir badatabase geçişi gerçekleştirdik
        //zaman , maliyet , karşıklık gibi sorunlar oradan kalktı
        //bu kolaylık inheritance polmorphism gibi yapıları kullandığımız için oldu.
        //bu yapılar c# ve java gibi programlama dillerinde kritik öneme sahip.
        //Spring IOS CONTAİNER ARAŞTIR.Kolaylıklar sağlıyor.
    }
    
}
