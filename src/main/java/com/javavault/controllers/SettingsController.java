/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.javavault.controllers;

import com.javavault.viewmodels.SettingsViewModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author tashingler
 */
public class SettingsController extends ControllerBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private final SettingsViewModel viewModel;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" UI Controls ">
    
    @FXML private BorderPane rootPane;
    
    @FXML private TabPane tabPaneSettings;
    
    @FXML private Tab tabAppearanceSettings;
    @FXML private Tab tabDatabaseSettings;
    
    @FXML private ToggleButton tglBtnAppearanceSettings;
    @FXML private ToggleButton tglBtnDatabaseSettings;
    
    @FXML private ToggleGroup tglGroupSettings;
    
    @FXML private Button btnCancel;
    @FXML private Button btnSave;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public SettingsController() {
        super();
        
        this.viewModel = new SettingsViewModel();
    }
    public SettingsController(ControllerBase parentController) {
        super(parentController);
        
        this.viewModel = new SettingsViewModel();
    }
    public SettingsController(ControllerBase parentController, SettingsViewModel viewModel) {
        super(parentController);
        
        this.viewModel = viewModel;
    }
    
    //</editor-fold>

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.btnCancel.setOnAction(evt -> this.viewModel.cancelUpdateSettings(evt));
        this.btnSave.setOnAction(evt -> this.viewModel.updateSettings(evt));
        this.tglBtnAppearanceSettings.setOnAction(evt -> {
            this.tglGroupSettings.selectToggle(this.tglBtnAppearanceSettings);
            this.tabPaneSettings.getSelectionModel().select(this.tabAppearanceSettings);
        });
        this.tglBtnDatabaseSettings.setOnAction(evt -> {
            this.tglGroupSettings.selectToggle(this.tglBtnDatabaseSettings);
            this.tabPaneSettings.getSelectionModel().select(this.tabDatabaseSettings);
        });
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
