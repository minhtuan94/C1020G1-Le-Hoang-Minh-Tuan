package _11_map_tree._02_exercise.arrylist_in_collection;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }

}
