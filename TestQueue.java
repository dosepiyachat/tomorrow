/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeachOther;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author User
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("One");
        queue.offer("Two");
        queue.add("Three");
        System.out.println(queue.peek());
        while(queue.size() > 0){
            System.out.println(queue.poll());
        }
    }
}
