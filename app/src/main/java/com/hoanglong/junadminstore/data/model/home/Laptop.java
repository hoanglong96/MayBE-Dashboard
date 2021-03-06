package com.hoanglong.junadminstore.data.model.home;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Laptop {
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("installment")
    @Expose
    private String installment;
    @SerializedName("promo")
    @Expose
    private String promo;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("imagePromo")
    @Expose
    private String imagePromo;

    public Laptop() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInstallment() {
        return installment;
    }

    public void setInstallment(String installment) {
        this.installment = installment;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImagePromo() {
        return imagePromo;
    }

    public void setImagePromo(String imagePromo) {
        this.imagePromo = imagePromo;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "href='" + href + '\'' +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", installment='" + installment + '\'' +
                ", promo='" + promo + '\'' +
                ", id='" + id + '\'' +
                ", imagePromo='" + imagePromo + '\'' +
                '}';
    }
}
