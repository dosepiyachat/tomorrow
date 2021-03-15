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
public class TestException {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        try{
            System.out.println(x/y);
        }
        catch(ArithmeticException ex){
            System.out.println("Arith error");
        }
        catch(RuntimeException ex){
            System.out.println("run error");
        }
        catch(Exception ex){
            System.out.println("Exception");
        }
        finally{
            System.out.println("End");
        }
    }
}
