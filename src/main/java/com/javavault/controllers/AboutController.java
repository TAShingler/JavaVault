/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.javavault.controllers;

import com.javavault.viewmodels.AboutViewModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author tyler
 */
public class AboutController extends ControllerBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private AboutViewModel viewModel;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" UI Controls ">
    
    @FXML private Label lblVersion;
    @FXML private Label lblVersionDate;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public AboutController() {
        super();
        
        this.viewModel = new AboutViewModel();
    }
    public AboutController(ControllerBase parentController) {
        super(parentController);
        
        this.viewModel = new AboutViewModel();
    }
    public AboutController(ControllerBase parentController, AboutViewModel viewModel) {
        super();
        
        this.viewModel = viewModel;
    }
    
    //</editor-fold>

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.lblVersion.textProperty().bind(this.viewModel.versionProperty());
        this.lblVersionDate.textProperty().bind(this.viewModel.versionDateProperty());
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Event Handlers ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>
    
}
