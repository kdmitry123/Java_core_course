package _3_generics._hw._hw_1_generics;

public class TestTable {
    public static void main(String[] args) {
        Table<Integer, String> table = new Table<>();

        table.add(new Entry<>(1,"q"));
        table.add(new Entry<>(2,"w"));
        table.add(new Entry<>(3,"e"));

        System.out.println(table.getEntryList());

        System.out.println(table.getValue(2));

        table.addValue(1, "a");
        System.out.println(table.getEntryList());

        table.remove(2);
        System.out.println(table.getEntryList());
    }
}
