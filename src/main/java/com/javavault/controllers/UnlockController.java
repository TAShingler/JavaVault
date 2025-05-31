/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javavault.controllers;

import com.javavault.viewmodels.UnlockViewModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author tyler
 */
public class UnlockController extends ControllerBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private UnlockViewModel viewModel;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" UI Controls ">
    
    @FXML private StackPane rootPane;
    
    @FXML private ImageView imgView;
    
    @FXML private Label lblDatabasePath;
    
    @FXML private TextField txtFldPassword;
    
    @FXML private PasswordField pwdFldPassword;
    
    @FXML private ToggleButton tglBtnShowPassword;
    
    @FXML private Button btnUnlock;
    @FXML private Button btnClose;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public UnlockController() {
        super();
        
        this.viewModel = new UnlockViewModel();
    }
    public UnlockController(ControllerBase parentController) {
        super(parentController);
        
        this.viewModel = new UnlockViewModel();
    }
    public UnlockController(ControllerBase parentController, UnlockViewModel viewModel) {
        super(parentController);
        
        this.viewModel = viewModel;
    }
    
    //</editor-fold>

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //bindings to viewmodel
        this.imgView.imageProperty().bind(this.viewModel.imageProperty());
        this.lblDatabasePath.textProperty().bind(this.viewModel.databasePathProperty());
        this.txtFldPassword.textProperty().bindBidirectional(this.viewModel.passwordProperty());
        this.pwdFldPassword.textProperty().bindBidirectional(this.viewModel.passwordProperty());
        
        this.btnUnlock.setOnAction(evt -> this.viewModel.unlockDatabase(evt));
        this.btnClose.setOnAction(evt -> this.viewModel.closeApp(evt));
        
        //bindings between UI controls
        this.txtFldPassword.visibleProperty().bind(this.tglBtnShowPassword.selectedProperty());
        this.pwdFldPassword.visibleProperty().bind(this.tglBtnShowPassword.selectedProperty().not());
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>
    
}
