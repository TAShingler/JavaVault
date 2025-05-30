/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javavault.models;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author tyler
 */
public class VaultGroup extends VaultObject {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public VaultGroup() {
        super();
    }

    public VaultGroup(String title, String createdBy, String modifiedBy, LocalDateTime createdDatetime, LocalDateTime modifiedDatetime, UUID uuid) {
        super(title, createdBy, modifiedBy, createdDatetime, modifiedDatetime, uuid);
    }

    public VaultGroup(int rowId, String title, String createdBy, String modifiedBy, LocalDateTime createdDatetime, LocalDateTime modifiedDatetime, UUID uuid) {
        super(rowId, title, createdBy, modifiedBy, createdDatetime, modifiedDatetime, uuid);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>
    
}
