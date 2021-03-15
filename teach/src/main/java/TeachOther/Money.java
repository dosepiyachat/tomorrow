/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeachOther;
import java.util.*;

/**
 *
 * @author User
 */
public class Money {
    public static void main(String[] args) {
        String text = "4 7 6 5 6 7 4";
        String[] num = text.split("[ ]");
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        
        
        for (int i = 0; i < num.length; i++) {
            queue.offer(num[i]);
            stack.push(num[i]);
        }
        String queueNum = "";
        String stackNum = "";
        
        for (int i = 0; i < num.length; i++) {
            String string = num[i];
            
        }
    }
}
