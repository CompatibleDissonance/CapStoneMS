package com.Cian.CapStoneMS.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;

    @Column(name = "product_price")
    private double price;

    private String songName;
    public String getId() { return Id; }

    public void setId(String id) { Id = id; }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }


}
