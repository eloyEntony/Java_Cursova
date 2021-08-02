package www.com.service;

import org.springframework.data.domain.Page;
import www.com.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

}
