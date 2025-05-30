/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javavault.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.UUID;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author tyler
 */
public abstract class VaultObject {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    
    protected IntegerProperty rowIrdProperty = new SimpleIntegerProperty();
    protected StringProperty titleProperty = new SimpleStringProperty();
    protected StringProperty createdByProperty = new SimpleStringProperty();
    protected StringProperty modifiedByProperty = new SimpleStringProperty();
    protected StringProperty formattedCreatedDatetimeProperty = new SimpleStringProperty();
    protected StringProperty formattedModifiedDatetimeProperty = new SimpleStringProperty();
    protected ObjectProperty<LocalDateTime> createdDatetimeProperty = new SimpleObjectProperty<>();
    protected ObjectProperty<LocalDateTime> modifiedDatetimeProperty = new SimpleObjectProperty<>();
    protected ObjectProperty<UUID> uuidProperty = new SimpleObjectProperty<>();
    
    IntegerProperty rowIdProperty() { return this.rowIrdProperty; }
    StringProperty titleProperty() { return this.titleProperty; }
    StringProperty createdByProperty() { return this.createdByProperty; }
    StringProperty modifiedByProperty() { return this.modifiedByProperty; }
    StringProperty formattedCreatedDatetimeProperty() { return this.formattedCreatedDatetimeProperty; }
    StringProperty formattedModifiedDatetimeProperty() { return this.formattedModifiedDatetimeProperty; }
    ObjectProperty<LocalDateTime> createdDatetimeProperty() { return this.createdDatetimeProperty; }
    ObjectProperty<LocalDateTime> modifiedDatetimeProperty() { return this.modifiedDatetimeProperty; }
    ObjectProperty<UUID> uuidProperty() { return this.uuidProperty; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public VaultObject() {
        setRowId(-1);
        setTitle("");
        setCreatedBy("");
        setModifiedBy("");
        setCreatedDatetime(LocalDateTime.now());
        setModifiedDatetime(LocalDateTime.now());
        setUUID(UUID.randomUUID());
    }
    public VaultObject(String title, String createdBy, String modifiedBy, LocalDateTime createdDatetime, LocalDateTime modifiedDatetime, UUID uuid) {
        setRowId(-1);
        setTitle(title);
        setCreatedBy(createdBy);
        setModifiedBy(modifiedBy);
        setCreatedDatetime(createdDatetime);
        setModifiedDatetime(modifiedDatetime);
        setUUID(uuid);
    }
    public VaultObject(int rowId, String title, String createdBy, String modifiedBy, LocalDateTime createdDatetime, LocalDateTime modifiedDatetime, UUID uuid) {
        setRowId(rowId);
        setTitle(title);
        setCreatedBy(createdBy);
        setModifiedBy(modifiedBy);
        setCreatedDatetime(createdDatetime);
        setModifiedDatetime(modifiedDatetime);
        setUUID(uuid);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    int getRowId() { return this.rowIdProperty().getValue(); }
    String getTitle() { return this.titleProperty().getValue(); }
    String getCreatedBy() { return this.createdByProperty().getValue(); }
    String getModifiedBy() { return this.modifiedByProperty().getValue(); }
    String getFormattedCreatedDatetime() { return this.formattedCreatedDatetimeProperty().getValue(); }
    String getFormattedModifiedDatetime() { return this.formattedModifiedDatetimeProperty().getValue(); }
    LocalDateTime getCreatedDatetime() { return this.createdDatetimeProperty().getValue(); }
    LocalDateTime getModifiedDatetime() { return this.modifiedDatetimeProperty().getValue(); }
    UUID getUUID() { return this.uuidProperty().getValue(); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    void setRowId(int val) { this.rowIdProperty().setValue(val); }
    void setTitle(String val) { this.titleProperty().setValue(val); }
    void setCreatedBy(String val) { this.createdByProperty().setValue(val); }
    void setModifiedBy(String val) { this.modifiedByProperty().setValue(val); }
    void setCreatedDatetime(LocalDateTime val) {
        this.createdDatetimeProperty().setValue(val);
        this.formattedCreatedDatetimeProperty.setValue(val.format(this.dateTimeFormat));
    }
    void setModifiedDatetime(LocalDateTime val) {
        this.modifiedDatetimeProperty().setValue(val);
        this.formattedModifiedDatetimeProperty.setValue(val.format(this.dateTimeFormat));
    }
    void setUUID(UUID val) { this.uuidProperty().setValue(val); }
    
    //</editor-fold>
    
}
