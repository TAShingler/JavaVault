/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.javavault.controllers;

import javafx.fxml.Initializable;

/**
 *
 * @author tashingler
 */
public abstract class ControllerBase implements Initializable {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields ">
    
    private ControllerBase parentController;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    protected ControllerBase() {
        this.parentController = null;
    }
    protected ControllerBase(ControllerBase parentController) {
        this.parentController = parentController;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Getters ">
    
    ControllerBase getParentController() { return this.parentController; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Setters ">
    
    void setParentController(ControllerBase val) { this.parentController = val; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>

}
