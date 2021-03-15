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
public class GenericPerson <T> { //<T>เป็นการกำหนดว่า เราไม่รู้ว่าค่าที่จะเข้ามาเป็นค่าอะไร จึงใส่Tเเทน ไม่ว่าค่าอะไรเข้ามาก็รับได้หมด
    private String Name;
    private T id; //ไม่ทราบT
    
    public GenericPerson(String name , T id){
        this.Name = name;
        this.id = id;
    }
    public String getName(){
        return Name;
    }
    public T getId(){
        return id;
    }
}
