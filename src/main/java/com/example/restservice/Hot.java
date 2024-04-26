@Entity
@Table(name = "Hot")
public class Hot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String Title;

    public String Products;

    protected Hot() {
    }

    public Hot(String Title, String Products) {
        this.Title = Title;
        this.Products = Products;
    }

    public String getTitle() {
        return Title;
    }

    public String getProducts() {
        return Products;
    }
}
