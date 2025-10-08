/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.template;

import co.edu.unicauca.DesignPatterns.template.*;

/**
 *
 * @author Dana Isabella
 */
public class Project {
    private String name;
    private String type;
    private String nameStudent;
    private boolean approved;

    public Project(String name, String type, String nameStudent) {
        this.name = name;
        this.type = type;
        this.nameStudent=nameStudent;
        this.approved = false;
    }

    public String getName() {
        return name;
    }
    
    public String getNameStudent(){
        return nameStudent;
    }

    public String getType() {
        return type;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
