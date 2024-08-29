/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapplication;

import java.util.ArrayList;

/**
 *
 * @author BIHAN
 */
public class Observer {
    private ArrayList<Observable> observableList = new ArrayList<>();
    
    private String txt;
    private String name;
    public void setTextValue(String txt, String name){
        this.txt = txt;
        this.name = name;
        notifyMessage();
    }
    public void notifyMessage(){
        for(Observable observable: observableList){
            observable.sendMassageUpdate(txt,name);
        }
    }
    public void addObservable(Observable observable){
       observableList.add(observable); 
    }
}
