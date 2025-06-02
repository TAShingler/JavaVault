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
    
    public StringProperty iconStringProperty() { return this.iconStringProperty; }
    public StringProperty usernameProperty() { return this.usernameProperty; }
    public StringProperty passwordProperty() { return this.passwordProperty; }
    public StringProperty addressProperty() { return this.addressProperty; }
    public StringProperty notesProperty() { return this.notesProperty; }
    public BooleanProperty favoriteProperty() { return this.favoriteProperty; }
    
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
    public VaultEntry(String iconString, String title, String username, String password, String address, String notes, boolean favorite, String createdBy, String modifiedBy,
            LocalDateTime createdDatetime, LocalDateTime modifiedDatetime, UUID uuid) {
        super(title, createdBy, modifiedBy, createdDatetime, modifiedDatetime, uuid);
        
        setIconString(iconString);
        setUsername(username);
        setPassword(password);
        setAddress(address);
        setNotes(notes);
        setFavorite(favorite);
    }
    public VaultEntry(int rowId, String iconString, String title, String username, String password, String address, String notes, boolean favorite, String createdBy, String modifiedBy,
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
    
    public final String getIconString() { return this.iconStringProperty().getValue(); }
    public final String getUsername() { return this.usernameProperty().getValue(); }
    public final String getPassword() { return this.passwordProperty().getValue(); }
    public final String getAddress() { return this.addressProperty().getValue(); }
    public final String getNotes() { return this.notesProperty().getValue(); }
    public final boolean getFavorite() { return this.favoriteProperty().getValue(); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    public final void setIconString(String val) { this.iconStringProperty().setValue(val); }
    public final void setUsername(String val) { this.usernameProperty().setValue(val); }
    public final void setPassword(String val) { this.passwordProperty().setValue(val); }
    public final void setAddress(String val) { this.addressProperty().setValue(val); }
    public final void setNotes(String val) { this.notesProperty().setValue(val); }
    public final void setFavorite(boolean val) { this.favoriteProperty().setValue(val); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>
    
}
