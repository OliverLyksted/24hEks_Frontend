package org.example.pizza24heks_frotend.Model;

public class Pizza {

    private Long pizza_id;

    private String title;

    private int price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getPizza_id() {
        return pizza_id;
    }

    public void setPizza_id(Long pizza_id) {
        this.pizza_id = pizza_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
