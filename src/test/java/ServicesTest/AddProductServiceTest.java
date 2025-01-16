package ServicesTest;

import com.imt.projet_api1.Services.AddProductService;
import com.imt.projet_api1.model.Product;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddProductServiceTest {

    private AddProductService addProductService = new AddProductService() {
        @Override
        public void execute(Product produit) {}
    };
    @Test
    public void addProductServiceTest(){
        Product produit = new Product(1,"Shampoing", "Anti", 3);
        addProductService.execute(produit);
    }

}
