/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author bangz
 */
public class InputanKosongException extends Exception{
    public String message(){
        return "Field input tidak boleh kosong!";
    } 
}
