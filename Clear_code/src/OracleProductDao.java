
public class OracleProductDao extends BaseProductDao{

    @Override
    public void add(Product product) {
        System.out.println("Oracle Database : " +product.getName()+" eklendi");
    }
    
    public OracleProductDao(String connectionString) {
        super(connectionString);
    }
    
}
