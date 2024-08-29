/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatapplication;

/**
 *
 * @author BIHAN
 */
public class ChatApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observer observarObj = new Observer();
        
        observarObj.addObservable(new SenderOne(observarObj,"Bihan"));
        observarObj.addObservable(new SenderOne(observarObj,"Hasini"));
        
    }
    
}
