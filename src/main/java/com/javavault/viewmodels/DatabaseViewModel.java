/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javavault.viewmodels;

import com.javavault.models.VaultEntry;
import com.javavault.models.VaultGroup;
import java.time.LocalDateTime;
import java.util.UUID;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 *
 * @author tyler
 */
public class DatabaseViewModel extends ViewModelBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private ObservableList<VaultGroup> groupsList = FXCollections.observableArrayList();
    private ObservableList<VaultEntry> entryList = FXCollections.observableArrayList();
    private ObservableList<String> filtersList = FXCollections.observableArrayList(
            "Ascending",
            "Descending",
            "Oldest",
            "Newest",
            "Favorites"
    );
    private ObservableList<Node> childPanesList = FXCollections.observableArrayList();
    
    private BooleanProperty leftPaneVisibleProperty = new SimpleBooleanProperty(true);
    private ObjectProperty<VaultGroup> selectedGroupProperty = new SimpleObjectProperty();
    private ObjectProperty<VaultEntry> selectedEntryProperty = new SimpleObjectProperty();
    private StringProperty selectedFilterProperty = new SimpleStringProperty();
    private ObjectProperty<Pane> leftPaneProperty = new SimpleObjectProperty();
    private ObjectProperty<Pane> rightPantProperty = new SimpleObjectProperty();
    private ObjectProperty<ObservableList<VaultEntry>> filterableEntryListProperty = new SimpleObjectProperty();
    
    public BooleanProperty leftPaneVisibleProperty() { return this.leftPaneVisibleProperty; }
    public ObjectProperty<VaultGroup> selectedGroupProperty() { return this.selectedGroupProperty; }
    public ObjectProperty<VaultEntry> selectedEntryProperty() { return this.selectedEntryProperty; }
    public StringProperty slectedFilterProperty() { return this.selectedFilterProperty; }
    public ObjectProperty<Pane> leftPaneProperty() { return this.leftPaneProperty; }
    public ObjectProperty<Pane> rightPaneProperty() { return this.rightPantProperty; }
    public ObjectProperty<ObservableList<VaultEntry>> filterableEntryListProperty() { return this.filterableEntryListProperty; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public DatabaseViewModel() {
        super();
        init();
    }
    public DatabaseViewModel(ViewModelBase parentViewModel) {
        super(parentViewModel);
        init();
    }
    private void init() {
        this.entryList.addAll(
                new VaultEntry(
                        "icon1",
                        "title1",
                        "username1",
                        "password1",
                        "address1",
                        "notes1",
                        true,
                        System.getProperty("user.name"),
                        System.getProperty("user.name"),
                        LocalDateTime.now(),
                        LocalDateTime.now(),
                        UUID.randomUUID()
                ),
                new VaultEntry(
                        "icon2",
                        "title2",
                        "username2",
                        "password2",
                        "address2",
                        "notes2",
                        true,
                        System.getProperty("user.name"),
                        System.getProperty("user.name"),
                        LocalDateTime.now(),
                        LocalDateTime.now(),
                        UUID.randomUUID()
                ),
                new VaultEntry(
                        "icon3",
                        "title3",
                        "username3",
                        "password3",
                        "address3",
                        "notes3",
                        true,
                        System.getProperty("user.name"),
                        System.getProperty("user.name"),
                        LocalDateTime.now(),
                        LocalDateTime.now(),
                        UUID.randomUUID()
                )
        );
        
        this.groupsList.addAll(
                new VaultGroup(
                        "group1",
                        System.getProperty("user.name"),
                        System.getProperty("user.name"),
                        LocalDateTime.now(),
                        LocalDateTime.now(),
                        UUID.randomUUID()
                ),
                new VaultGroup(
                        "group3",
                        System.getProperty("user.name"),
                        System.getProperty("user.name"),
                        LocalDateTime.now(),
                        LocalDateTime.now(),
                        UUID.randomUUID()
                ),
                new VaultGroup(
                        "group2",
                        System.getProperty("user.name"),
                        System.getProperty("user.name"),
                        LocalDateTime.now(),
                        LocalDateTime.now(),
                        UUID.randomUUID()
                )
        );
        
        this.filterableEntryListProperty.setValue(this.entryList.filtered(null));
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    public ObservableList<VaultGroup> getGroupsList() { return this.groupsList; }
    public ObservableList<VaultEntry> getEntryList() { return this.entryList; }
    public ObservableList<String> getFiltersList() { return this.filtersList; }
    public ObservableList<Node> getChildPanesList() { return this.childPanesList; }
    public Pane getLeftPane() { return this.leftPaneProperty().getValue(); }
    public Pane getRightPane() { return this.rightPaneProperty().getValue(); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    public void setGroupsList(ObservableList<VaultGroup> val) { this.groupsList = val; }
    public void setEntryList(ObservableList<VaultEntry> val) { this.entryList = val; }
    public void setFiltersList(ObservableList<String> val) { this.filtersList = val; }
    public void setChildPanesList(ObservableList<Node> val) { this.childPanesList = val; }
    public void setLeftPane(Pane val) { this.leftPaneProperty().setValue(val); }
    public void setRightPane(Pane val) { this.rightPaneProperty().setValue(val); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Event Handlers ">
    
    public void createVaultGroup(ActionEvent evt) {
        System.out.println("createVaultGroup() called...");
    }
    public void editVaultGroup(ActionEvent evt) {
        System.out.println("editVaultGroup() called...");
    }
    public void deleteVaultGroup(ActionEvent evt) {
        System.out.println("deleteVaultGroup() called...");
    }
    public void createVaultEntry(ActionEvent evt) {
        System.out.println("createVaultEntry() called...");
    }
    public void editVaultEntry(ActionEvent evt) {
        System.out.println("editVaultEntry() called...");
    }
    public void deleteVaultEntry(ActionEvent evt) {
        System.out.println("deleteVaultEntry() called...");
    }
    public void toggleLeftPaneVisibility(boolean visible) {
        this.leftPaneVisibleProperty().setValue(visible);
    }
    public void filterVaultEntryTable(ActionEvent evt) {
        System.out.println("filterVaultEntryTable() called...");
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    public void filterVaultEntries(String filter) {
        var filteredList = this.entryList.filtered(item -> item.titleProperty().getValue().toLowerCase().contains(filter.toLowerCase()));
        System.out.println("filteredList.size = " + filteredList.size());
        this.filterableEntryListProperty.setValue(filteredList);
    }
    
    //</editor-fold>
    
}
