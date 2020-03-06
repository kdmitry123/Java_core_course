package _9_patterns._hw._strategy;

public class FilterByPrice implements ProductFilteringStrategy{
    private Integer price;


    public FilterByPrice(Integer price) {
        this.price = price;

    }

    @Override
    public boolean filter(Product product) {
        return this.price >= product.getListPrice() && this.price <= product.getSellingPrice();
    }
}
