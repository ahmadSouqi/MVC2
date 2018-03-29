package domin;

import java.io.Serializable;

/**
 * Created by asouqi on 3/22/18.
 */
public class Product implements Serializable{

    private String name;
    private String detail;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
