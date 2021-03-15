package TeachOther;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author User
 */
public class TestSet {
    public static void main(String[] args) {
        /*Set<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Two");
        System.out.println(set);*/
        
        Set<Integer> A = new LinkedHashSet<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        System.out.println("A : " + A);
        
        Set<Integer> B = new LinkedHashSet<>();
        B.add(2);
        B.add(4);
        B.add(6);
        B.add(8);
        System.out.println("B : " + B);
        
        Set<Integer> C = new LinkedHashSet<>();
        C.addAll(A);
        C.addAll(B);
        System.out.println(C);
        
        Set<Integer> D = new LinkedHashSet<>();
        D.addAll(A);
        D.retainAll(B);
        System.out.println(D);
        
        Set<Integer> E = new LinkedHashSet<>();
        E.addAll(A);
        E.removeAll(B);
        System.out.println(E);
        /*
        Set<Integer> C = new LinkedHashSet<>();
        C.addAll(A);
        C.addAll(B);
        System.out.println(C);
        
        Set<Integer> D = new LinkedHashSet<>();
        D.addAll(A);
        D.retainAll(B);
        System.out.println(D);
        
        Set<Integer> E = new LinkedHashSet<>();
        E.addAll(A);
        E.removeAll(B);
        System.out.println(E);
*/
    }
}
