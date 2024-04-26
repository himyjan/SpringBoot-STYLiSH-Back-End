@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long Id;

    public String Title;

    public String Description;

    public Int Price;

    public String Texture;

    public String Wash;

    public String Place;

    public String Note;

    public String Story;

    public String MainImage;

    public String Category;
}
