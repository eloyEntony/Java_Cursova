package www.com.entities;

import javax.persistence.*;

@Entity
@Table(name="products_images")
public class Product_Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;

    private String image;


}
