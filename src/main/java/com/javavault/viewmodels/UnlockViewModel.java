/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javavault.viewmodels;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;

/**
 *
 * @author tyler
 */
public class UnlockViewModel extends ViewModelBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private ObjectProperty<Image> imageProperty = new SimpleObjectProperty(new Image(getClass().getResource("/images/logo_x128.png").toString()));
    private StringProperty databasePathProperty = new SimpleStringProperty("C:\\Users\\tyler\\Desktop\\Income Driven Repayment (IDR).pdf");
    private StringProperty passwordProperty = new SimpleStringProperty("test");
    
    public ObjectProperty<Image> imageProperty() { return this.imageProperty; }
    public StringProperty databasePathProperty() { return this.databasePathProperty; }
    public StringProperty passwordProperty() { return this.passwordProperty; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public UnlockViewModel() {
        super();
    }
    public UnlockViewModel(ViewModelBase parentViewModel) {
        super(parentViewModel);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    public Image getImage() { return this.imageProperty().getValue(); }
    public String getDatabasePath() { return this.databasePathProperty().getValue(); }
    public String getPassword() { return this.passwordProperty().getValue(); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    public void setImage(Image val) { this.imageProperty().setValue(val); }
    public void setDatabasePath(String val) { this.databasePathProperty().setValue(val); }
    public void setPassword(String val) { this.passwordProperty().setValue(val); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Event Handlers ">
    
    public void unlockDatabase(ActionEvent evt) {
//        System.out.println("unlockDatabase() called...");
        System.out.println("Image == null: " + getImage().getUrl());
    }
    public void closeApp(ActionEvent evt) {
        System.exit(0);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>
    
}
