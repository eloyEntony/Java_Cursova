package www.com.entities;

import javax.persistence.*;

@Entity
@Table(name="payMethod")
public class Payment_Method {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

}
