package TeachOther;

import java.util.LinkedList;


public class TestLinkedList {
    
    public static void main(String[] args) {
        LinkedList<String> fruit = new LinkedList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Mango");
        fruit.add("Orange");
        
        fruit.addFirst("grave");
        System.out.println(fruit);
        fruit.addLast("Lemon");
        System.out.println(fruit);
        System.out.println(fruit.get(3));
        fruit.add(3, "Avocado");
        fruit.set(2, "Blueberry");
        fruit.remove(1);
        System.out.println(fruit);
        fruit.remove("Mango");
        System.out.println(fruit);
    }
}
