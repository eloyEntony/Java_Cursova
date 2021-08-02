package www.com.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="productsInCart")
public class Product_In_Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int Quantity;

    @OneToOne
    @JoinColumn(name="product_id", nullable=false, referencedColumnName = "id")
    private Product product;

    @ManyToOne
    @JoinColumn(name="products")
    private Order order;
}
