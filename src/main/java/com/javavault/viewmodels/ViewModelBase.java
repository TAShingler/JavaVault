/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.javavault.viewmodels;

/**
 *
 * @author tashingler
 */
public abstract class ViewModelBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private ViewModelBase parentViewModel;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    protected ViewModelBase() {
        this.parentViewModel = null;
    }
    protected ViewModelBase(ViewModelBase parentViewModel) {
        this.parentViewModel = parentViewModel;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    ViewModelBase getParentViewModel() { return this.parentViewModel; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    void setParentViewModel(ViewModelBase val) { this.parentViewModel = val; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Event Handlers ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>

}
