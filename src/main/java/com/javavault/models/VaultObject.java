/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javavault.models;

import java.time.LocalDateTime;
import java.util.UUID;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author tyler
 */
public abstract class VaultObject {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    protected StringProperty titleProperty = new SimpleStringProperty();
    protected StringProperty createdByProperty = new SimpleStringProperty();
    protected StringProperty modifiedByProperty = new SimpleStringProperty();
    protected ObjectProperty<LocalDateTime> createdDatetimeProperty = new SimpleObjectProperty<>();
    protected ObjectProperty<LocalDateTime> modifiedDatetimeProperty = new SimpleObjectProperty<>();
    protected ObjectProperty<UUID> uuidProperty = new SimpleObjectProperty<>();
    
    StringProperty titleProperty() { return this.titleProperty; }
    StringProperty createdByProperty() { return this.createdByProperty; }
    StringProperty modifiedByProperty() { return this.modifiedByProperty; }
    ObjectProperty<LocalDateTime> createdDatetimeProperty() { return this.createdDatetimeProperty; }
    ObjectProperty<LocalDateTime> modifiedDatetimeProperty() { return this.modifiedDatetimeProperty; }
    ObjectProperty<UUID> uuidProperty() { return this.uuidProperty; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    String getTitle() { return this.titleProperty().getValue(); }
    String getCreatedBy() { return this.createdByProperty().getValue(); }
    String getModifiedBy() { return this.modifiedByProperty().getValue(); }
    LocalDateTime getCreatedDatetime() { return this.createdDatetimeProperty().getValue(); }
    LocalDateTime getModifiedDatetime() { return this.modifiedDatetimeProperty().getValue(); }
    UUID getUUID() { return this.uuidProperty().getValue(); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    void setTitle(String val) { this.titleProperty().setValue(val); }
    void setCreatedBy(String val) { this.createdByProperty().setValue(val); }
    void setModifiedBy(String val) { this.modifiedByProperty().setValue(val); }
    void setCreatedDatetime(LocalDateTime val) { this.createdDatetimeProperty().setValue(val); }
    void setModifiedDatetime(LocalDateTime val) { this.modifiedDatetimeProperty().setValue(val); }
    
    //</editor-fold>
    
}
