
package TeachOther;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author User
 */
public class TestIterator {
    public static void main(String[] args) {
        List <String> fruit = new LinkedList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        
        ListIterator iterator = fruit.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
        
        ListIterator ite = fruit.listIterator(fruit.size());
        while(ite.hasPrevious()){
            System.out.print(ite.previous() + " ");
        }
    }
}
