package www.com.entities;

import javax.persistence.*;

@Entity
@Table(name="totalChecks")
public class Total_Check {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private float total_price;
    private String comment;

    @OneToOne
    @JoinColumn(name="shipping_method_id", nullable=false, referencedColumnName = "id")
    private Shipping_Method shipping_method;

    @OneToOne
    @JoinColumn(name="payment_method_id", nullable=false, referencedColumnName = "id")
    private Payment_Method payment_method;

    @OneToOne
    @JoinColumn(name="order_id", nullable=false, referencedColumnName = "id")
    private Order order;
}
