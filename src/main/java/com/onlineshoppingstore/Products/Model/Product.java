package com.onlineshoppingstore.Products.Model;

public class Product {

    @SuppressWarnings("checkstyle:MemberName")
    String product_id;
    String product_name;
    int product_stock;
    String product_seller;
    String product_seller_id;
    String product_category;
    int product_price;
    String product_size;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(int product_stock) {
        this.product_stock = product_stock;
    }

    public String getProduct_seller() {
        return product_seller;
    }

    public void setProduct_seller(String product_seller) {
        this.product_seller = product_seller;
    }

    public String getProduct_seller_id() {
        return product_seller_id;
    }

    public void setProduct_seller_id(String product_seller_id) {
        this.product_seller_id = product_seller_id;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public String getProduct_specifications() {
        return product_specifications;
    }

    public void setProduct_specifications(String product_specifications) {
        this.product_specifications = product_specifications;
    }

    String product_specifications;


}
