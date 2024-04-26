@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Int UserId;

    public String Time;

    public Int Total;

    public String UserOrders;

    public Int OrderId;

    public String PayOrders;

    public String Payment;

    public String Shipping;

    public Short Pay;

    public String OrderProducts;

    public String User;

    public String LastFour;
}
