/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teach;

import java.util.*;

/**
 *
 * @author User
 */
public class Collection {
    public static void main(String[] args) {
        //เเสดงLinkedList
        LinkedList<String> fruit = new LinkedList<>();
        fruit.add("Apple"); //.addเพื่อเพิ่มข้อมูล
        fruit.add("Banana");
        fruit.add("Cherry");
        System.out.println(fruit);//[Apple,Banana,Cherry]
        fruit.remove("Apple");//ลบ apple
        System.out.println(fruit);//[Banana,Cherry]
        fruit.add(1, "PineApple");//เพิ่ม pineapple ลงไปเเทนในช่อง1
        System.out.println(fruit);//[Banana, PineApple, Cherry]
        System.out.println(fruit.getLast());//.getLast ตัวสุดท้าย
                                            //Cherry
        System.out.println(fruit.remove(1));//เเสดงช่องที่1 ที่จะถูกลบ //PineApple
        System.out.println(fruit);//[Banana, Cherry]

        Set <String> set = new LinkedHashSet<>();//LinkedHashSetเรียงตามตัวที่เราใส่ค่าเข้าไป
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Two");
        System.out.println(set);//[One, Two, Three, Four, Five]

        Map<Integer,String> map = new LinkedHashMap<>();//มีkeyเเละvalue
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(1, "Four");
        System.out.println(map);//{1=Four, 2=Two, 3=Three}
        map.remove(2); //ลบช่อง2
        System.out.println(map);//{1=Four, 3=Three}
        System.out.println(map.isEmpty());//false  //ว่างมั้ยก็ไม่ว่างหนิ
        System.out.println(map.containsKey(3));//true //ช่อง3 มีมั้ย ก็มีหนิ
    }
}
