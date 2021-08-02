package www.com.entities;

import javax.persistence.*;

@Entity
@Table(name="shipMethod")
public class Shipping_Method {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String type;
    private String city;
    private String branches;


}
