package _9_patterns._hw._strategy;

class Product {
    private String name;
    private Integer listPrice;
    private Integer sellingPrice;

    public Product(String name, Integer listPrice, Integer sellingPrice) {
        this.name = name;
        this.listPrice = listPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", listPrice=" + listPrice +
                ", sellingPrice=" + sellingPrice +
                '}';
    }
}
