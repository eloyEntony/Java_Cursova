package www.com.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="notes")
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 255, nullable = false)
    private String name;

//    @ManyToOne()
//    @JoinColumn(name="notes", insertable = false, updatable = false)
//    private Product product;

    @ManyToMany(mappedBy="notes")
    private List<Product> products = new ArrayList<Product>();
}
