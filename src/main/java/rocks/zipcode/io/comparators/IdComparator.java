package rocks.zipcode.io.comparators;

import java.util.Comparator;

import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

    public int compare (Item first, Item second){
        return first.getId().compareTo(second.getId());
    }
}