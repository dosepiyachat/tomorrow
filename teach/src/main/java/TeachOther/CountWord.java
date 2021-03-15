/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeachOther;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class CountWord {
    public static void main(String[] args) {
        String text = "Good morning. Have a good class." +
                "Have a good visit. Have fun!";
        String[] words = text.split("[ \n\t.!]");
        Map<String , Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            String x = words[i].toLowerCase();
            if(map.containsKey(words[i])){
                map.put(x, map.get(x)+1);
            }else{
                map.put(x, 1);
            }
            
        }
        System.out.println(map);
    }
}
