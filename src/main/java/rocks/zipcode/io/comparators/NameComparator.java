package rocks.zipcode.io.comparators;

import java.util.Comparator;

import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {

    public int compare(Item x, Item y){
        return x.getName().compareTo(y.getName());
    }

}
