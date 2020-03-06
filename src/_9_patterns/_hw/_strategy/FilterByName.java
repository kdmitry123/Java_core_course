package _9_patterns._hw._strategy;

public class FilterByName implements ProductFilteringStrategy{

    private final String name;

    public FilterByName(String name) {
        this.name = name;
    }

    @Override
    public boolean filter(Product product) {
        return product.getName().toLowerCase().contains(this.name.toLowerCase());
    }
}
