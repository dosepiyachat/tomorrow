/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teach;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Toon");
        System.out.println(p1);
        
        Person p2 = new Student("Tent","tyuhbjb");
        Student p3 = new Student("Beam","ioigash");
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        System.out.println(p3.getId());
    
        System.out.println(p2.getId());
        
        Prathom p4 = new Prathom("Hello","jklhKXs","kjks");
        System.out.println(p4);
        System.out.println(p4.getSchool());
        System.out.println(p4.getName() + " " +  p4.getId());

        
        GenericPerson<Integer> p = new GenericPerson("kok",454646);
    }
}
