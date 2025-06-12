/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javavault.viewmodels;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author tyler
 */
public class AboutViewModel extends ViewModelBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private StringProperty versionProperty = new SimpleStringProperty();
    private StringProperty versionDateProperty = new SimpleStringProperty();
    
    public StringProperty versionProperty() { return this.versionProperty; }
    public StringProperty versionDateProperty() { return this.versionDateProperty; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public AboutViewModel() {
        super();
        init();
    }
    public AboutViewModel(ViewModelBase parentViewModel) {
        super(parentViewModel);
        init();
    }
    private void init() {
        setVersion("1.5.3");
        setVersionDate("2025-06-11");
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    public String getVersion() { return this.versionProperty().getValue(); }
    public String getVersionDate() { return this.versionDateProperty().getValue(); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    public void setVersion(String val) { this.versionProperty().setValue(val); }
    public void setVersionDate(String val) { this.versionDateProperty().setValue(val); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Event Handlers ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>
    
}
