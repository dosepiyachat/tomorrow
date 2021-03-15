/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeachOther;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TestArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("mango");
        fruit.add("Orange");
        System.out.println(fruit.get(3));
        fruit.add(3, "Avocado");
        System.out.println(fruit);
        fruit.set(2, "Blueberry");
        System.out.println(fruit);
        fruit.remove(1);
        System.out.println(fruit);
        fruit.remove("Mango");
        System.out.println(fruit);
        
    }
}
