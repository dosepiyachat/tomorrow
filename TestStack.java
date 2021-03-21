/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeachOther;

import java.util.Stack;

/**
 *
 * @author User
 */
public class TestStack {
    public static void main(String[] args) {
        Stack<String> num = new Stack<>();
        num.push("One");
        num.push("Two");
        num.add("Three");
        
        System.out.println(num);
        System.out.println(num.peek());
        
        System.out.println(num.size());
        System.out.println(num.get(1));
        while(!num.empty()){
            System.out.println(num.pop());
        }
        System.out.println(num);
    }
}
