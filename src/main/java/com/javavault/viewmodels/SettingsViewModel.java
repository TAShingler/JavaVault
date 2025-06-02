/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.javavault.viewmodels;

import javafx.event.ActionEvent;

/**
 *
 * @author tashingler
 */
public class SettingsViewModel extends ViewModelBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public SettingsViewModel() {
        super();
    }
    public SettingsViewModel(ViewModelBase parentViewModel) {
        super(parentViewModel);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Event Handlers ">
    
    public void cancelUpdateSettings(ActionEvent evt) {
        if (getParentViewModel() instanceof MainViewModel vm) {
            if (vm.getUnlocked())
                vm.showPasswordGenerator(evt);
            else
                vm.lockDatabase(evt);
        }
    }
    public void updateSettings(ActionEvent evt) {
        if (getParentViewModel() instanceof MainViewModel vm) {
            if (vm.getUnlocked())
                vm.showPasswordGenerator(evt);
            else
                vm.lockDatabase(evt);
        }
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>
    
}
