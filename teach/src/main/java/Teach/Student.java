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
public abstract class Student extends Person {
    private String id;
    
    public Student(String name , String id){
        super(name);
        this.id = id;
        this.status = "Student";
    }
    public String getId(){
        return id;
    }
    @Override
    public String toString(){
        return super.toString() + " , Id : " + id;
    }
}
