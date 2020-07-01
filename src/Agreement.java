import java.util.Date;
import java.util.List;

/*
 *
 */

public class Agreement {

    private String description;
    private Date regDate;
    private int number;
    private List<String> checkProducts;

    public Agreement(String description, Date regDate, int number, List<String> checkProducts) {
        this.description = description;
        this.regDate = regDate;
        this.number = number;
        this.checkProducts = checkProducts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
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
