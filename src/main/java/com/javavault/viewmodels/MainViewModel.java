/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.javavault.viewmodels;

import com.javavault.controllers.ControllerBase;
import com.javavault.controllers.DatabaseController;
import com.javavault.controllers.MainController;
import com.javavault.controllers.UnlockController;
import java.io.IOException;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author tashingler
 */
public class MainViewModel extends ViewModelBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private BooleanProperty unlockedProperty = new SimpleBooleanProperty(true);
    private StringProperty searchTextProperty = new SimpleStringProperty();
    private IntegerProperty entryCountProperty = new SimpleIntegerProperty(50);
    private IntegerProperty groupCountProperty = new SimpleIntegerProperty(5000);
    private ObservableList<Node> childViewChildrenList = FXCollections.observableArrayList();
    
    public BooleanProperty unlockedProperty() { return this.unlockedProperty; }
    public StringProperty searchTextProperty() { return this.searchTextProperty; }
    public IntegerProperty entryCountProperty() { return this.entryCountProperty; }
    public IntegerProperty groupCountProperty() { return this.groupCountProperty; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public MainViewModel() {
        super();
    }
    public MainViewModel(ViewModelBase parentViewModel) {
        super(parentViewModel);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    public boolean getUnlocked() { return this.unlockedProperty().getValue(); }
    public String getSearchText() { return this.searchTextProperty().getValue(); }
    public int getEntryCount() { return this.entryCountProperty().getValue(); }
    public int getGroupCount() { return this.groupCountProperty().getValue(); }
    public ObservableList<Node> getChildViewChildrenList() { return this.childViewChildrenList; }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    public void setUnlocked(boolean val) { this.unlockedProperty().setValue(val); }
    public void setSearchText(String val) { this.searchTextProperty().setValue(val); }
    public void setEntryCount(int val) { this.entryCountProperty().setValue(val); }
    public void setGroupCount(int val) { this.groupCountProperty().setValue(val); }
    public void setChildrenViewChildrenList(ObservableList<Node> val) { this.childViewChildrenList = val; }
    public void setChildView(Node val) {
        if (this.childViewChildrenList == null) return;
        
        if (this.childViewChildrenList.isEmpty())
            this.childViewChildrenList.clear();
        
        this.childViewChildrenList.add(val);
        AnchorPane.setTopAnchor(val, 12d);
        AnchorPane.setRightAnchor(val, 12d);
        AnchorPane.setBottomAnchor(val, 12d);
        AnchorPane.setLeftAnchor(val, 12d);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Event Handlers ">
    
    public void exitApp(ActionEvent evt) { System.exit(0); }
    public void showAbout(ActionEvent evt) {
        System.out.println("showAbout() called...");
    }
    public void lockDatabase(ActionEvent evt) {
        System.out.println("lockDatabase() called...");
    }
    public void showPasswordGenerator(ActionEvent evt) {
        System.out.println("showPasswordGenerator() called...");
        Platform.runLater(() -> {
            try {
                var vm = new DatabaseViewModel(this);
                setChildView(loadChildView("database", new DatabaseController(null, vm)));
            } catch (IOException ex) {
                System.getLogger(MainViewModel.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        });
    }
    public void showAppSettings(ActionEvent evt) {
        System.out.println("showAppSettings() called...");
        Platform.runLater(() -> {
            try {
                var vm = new UnlockViewModel();
                setChildView(loadChildView("unlock", new UnlockController(null, vm)));
            } catch (IOException ex) {
                System.getLogger(MainViewModel.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        });
    }
    public void clearSearch(ActionEvent evt) {
        setSearchText(null);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    private Parent loadChildView(String fxml, ControllerBase controller) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/" + fxml + ".fxml"));
        loader.setController(controller);
        return loader.load();
    }
    
    //</editor-fold>

}
