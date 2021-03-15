
package Teach;

/**
 *
 * @author User
 */
public class Prathom extends Student { //คลาสลูกที่สืบทอดจาก student
    private String school; //เก็บโรงเรียน
    
    public Prathom(String name  ,String id , String school){
        super(name,id); //ดึง name id จากเเม่
        this.school = school; 
        this.status = "Prathom student"; //กำหนดเลยว่าเป็นประถม
    }
    public String getSchool(){
        return school;
    }
    @Override
    public String toString(){
        return super.toString() + " , School : " + school; //super จะได้overrideจากคลาสที่extendsมา
    }
}
