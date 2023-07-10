import java.util.ArrayList;
import java.util.List;

public class Product {
    private String id;
    private float price;
    private String name;
    private ProductCategory category;
    private List<Comment> comments = new ArrayList<>();
    private Seller seller;

    public Product(String id, float price, String name, ProductCategory category, Seller seller) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
        this.seller = seller;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
