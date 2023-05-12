/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.assignment1;

import java.io.Serializable;

/**
 *
 * @author Zac
 */
public class FireTruck implements Serializable{
    
    private int id;
    private String name;
    private int fireID;
    private int positionX;
    private int positionY;

    public FireTruck(int id, String name, int fireID, int positionX, int positionY) {
        this.id = id;
        this.name = name;
        this.fireID = fireID;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFireID() {
        return fireID;
    }

    public void setFireID(int fireID) {
        this.fireID = fireID;
    }
    
    public int getPositionX(){
        return positionX;
    }
    
    public void setPositionX(int positionX){
        this.positionX = positionX;
    }
    
    public int getPositionY(){
        return positionY;
    }
    
    public void setPositionY(int positionY){
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        return "FireTruck{" + "id=" + id + ", name=" + name + 
                ", fireID=" + fireID + ", positionX=" + 
                positionX + ", positionY=" + positionY + '}';
    }

   
    }
    

