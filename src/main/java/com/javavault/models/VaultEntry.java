/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javavault.models;

import java.time.LocalDateTime;
import java.util.UUID;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author tyler
 */
public class VaultEntry extends VaultObject {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private StringProperty iconStringProperty = new SimpleStringProperty();
    private StringProperty usernameProperty = new SimpleStringProperty();
    private StringProperty passwordProperty = new SimpleStringProperty();
    private StringProperty addressProperty = new SimpleStringProperty();
    private StringProperty notesProperty = new SimpleStringProperty();
    private BooleanProperty favoriteProperty = new SimpleBooleanProperty();
    
    StringProperty iconStringProperty() { return this.iconStringProperty; }
    StringProperty usernameProperty() { return this.usernameProperty; }
    StringProperty passwordProperty() { return this.passwordProperty; }
    StringProperty addressProperty() { return this.addressProperty; }
    StringProperty notesProperty() { return this.notesProperty; }
    BooleanProperty favoriteProperty() { return this.favoriteProperty; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructor ">
    
    public VaultEntry() {
        super();
    }
    public VaultEntry(String iconString, String username, String password, String address, String notes, boolean favorite) {
        super();
        
        setIconString(iconString);
        setUsername(username);
        setPassword(password);
        setAddress(address);
        setNotes(notes);
        setFavorite(favorite);
    }
    public VaultEntry(String iconString, String username, String password, String address, String notes, boolean favorite, String title, String createdBy, String modifiedBy,
            LocalDateTime createdDatetime, LocalDateTime modifiedDatetime, UUID uuid) {
        super(title, createdBy, modifiedBy, createdDatetime, modifiedDatetime, uuid);
        
        setIconString(iconString);
        setUsername(username);
        setPassword(password);
        setAddress(address);
        setNotes(notes);
        setFavorite(favorite);
    }
    public VaultEntry(int rowId, String iconString, String username, String password, String address, String notes, boolean favorite, String title, String createdBy, String modifiedBy,
            LocalDateTime createdDatetime, LocalDateTime modifiedDatetime, UUID uuid) {
        super(rowId, title, createdBy, modifiedBy, createdDatetime, modifiedDatetime, uuid);
        
        setIconString(iconString);
        setUsername(username);
        setPassword(password);
        setAddress(address);
        setNotes(notes);
        setFavorite(favorite);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    String getIconString() { return this.iconStringProperty().getValue(); }
    String getUsername() { return this.usernameProperty().getValue(); }
    String getPassword() { return this.passwordProperty().getValue(); }
    String getAddress() { return this.addressProperty().getValue(); }
    String getNotes() { return this.notesProperty().getValue(); }
    boolean getFavorite() { return this.favoriteProperty().getValue(); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    void setIconString(String val) { this.iconStringProperty().setValue(val); }
    void setUsername(String val) { this.usernameProperty().setValue(val); }
    void setPassword(String val) { this.passwordProperty().setValue(val); }
    void setAddress(String val) { this.addressProperty().setValue(val); }
    void setNotes(String val) { this.notesProperty().setValue(val); }
    void setFavorite(boolean val) { this.favoriteProperty().setValue(val); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>
    
}
