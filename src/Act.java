import java.util.Date;
import java.util.List;

public class Act {


    private String description;
    private Date date;
    private int number;
    private List<String> checkProducts;

    public Act(String description, Date date, int number, List<String> checkProducts) {
        this.description = description;
        this.date = date;
        this.number = number;
        this.checkProducts = checkProducts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<String> getCheckProducts() {
        return checkProducts;
    }

    public void setCheckProducts(List<String> checkProducts) {
        this.checkProducts = checkProducts;
    }
}
