/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.javavault.viewmodels;

import com.javavault.controllers.ControllerBase;
import java.io.IOException;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author tashingler
 */
public class MainViewModel extends ViewModelBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private BooleanProperty unlockedProperty = new SimpleBooleanProperty(false);
    private StringProperty searchTextProperty = new SimpleStringProperty();
    private IntegerProperty entryCountProperty = new SimpleIntegerProperty(50);
    private IntegerProperty groupCountProperty = new SimpleIntegerProperty(5000);
    private ObjectProperty<ViewModelBase> childViewModelProperty = new SimpleObjectProperty();
    
    public BooleanProperty unlockedProperty() { return this.unlockedProperty; }
    public StringProperty searchTextProperty() { return this.searchTextProperty; }
    public IntegerProperty entryCountProperty() { return this.entryCountProperty; }
    public IntegerProperty groupCountProperty() { return this.groupCountProperty; }
    public ObjectProperty<ViewModelBase> childViewModelProperty() { return this.childViewModelProperty; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public MainViewModel() {
        super();
        init();
    }
    public MainViewModel(ViewModelBase parentViewModel) {
        super(parentViewModel);
        init();
    }
    private void init() {
        searchTextProperty().addListener((obsVal, oldVal, newVal) -> {
            if (this.getChildViewModel() instanceof DatabaseViewModel vm) {
                vm.filterVaultEntries(newVal);
            }
        });
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    public boolean getUnlocked() { return this.unlockedProperty().getValue(); }
    public String getSearchText() { return this.searchTextProperty().getValue(); }
    public int getEntryCount() { return this.entryCountProperty().getValue(); }
    public int getGroupCount() { return this.groupCountProperty().getValue(); }
    public ViewModelBase getChildViewModel() { return this.childViewModelProperty().getValue(); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    public void setUnlocked(boolean val) { this.unlockedProperty().setValue(val); }
    public void setSearchText(String val) { this.searchTextProperty().setValue(val); }
    public void setEntryCount(int val) { this.entryCountProperty().setValue(val); }
    public void setGroupCount(int val) { this.groupCountProperty().setValue(val); }
    public void setChildViewModel(ViewModelBase val) { this.childViewModelProperty().setValue(val); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Event Handlers ">
    
    public void exitApp(ActionEvent evt) { System.exit(0); }
    public void showAbout(ActionEvent evt) {
        System.out.println("showAbout() called...");
    }
    public void lockDatabase(ActionEvent evt) {
        System.out.println("lockDatabase() called...");
        this.setChildViewModel(new UnlockViewModel(this));
    }
    public void showPasswordGenerator(ActionEvent evt) {
        System.out.println("showPasswordGenerator() called...");
        this.setChildViewModel(new DatabaseViewModel(this));
    }
    public void showAppSettings(ActionEvent evt) {
        System.out.println("showAppSettings() called...");
//        this.setChildViewModel(new UnlockViewModel(this));
        this.setChildViewModel(new SettingsViewModel(this));
    }
    public void clearSearch(ActionEvent evt) {
        setSearchText("");
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    public void tryUnlockDatabase(String password) throws Exception {
        //TODO
    }
    
    //</editor-fold>

}
