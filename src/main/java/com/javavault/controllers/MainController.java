/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.javavault.controllers;

import com.javavault.viewmodels.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 *
 * @author tashingler
 */
public class MainController extends ControllerBase {

    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private MainViewModel viewModel;
    private Timeline clearClipboardAnimationTimeline = new Timeline();
    private ObjectProperty<ObservableList<Node>> childViewChildrenListProperty = new SimpleObjectProperty<>();
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" UI Controls ">
    
    @FXML private Button btnLockDatabase;
    @FXML private Button btnPasswordGenerator;
    @FXML private Button btnSettings;
    @FXML private Button btnClearSearch;
    
    @FXML private MenuItem menuItemExit;
    @FXML private MenuItem menuItemAbout;
    
    @FXML private TextField txtFldSearch;
    
    @FXML private Label lblGroupsCount;
    @FXML private Label lblEntriesCount;
    
    @FXML private HBox paneClearClipboard;
    @FXML private HBox paneCounters;
    
    @FXML private ProgressBar progressBarClearClipboard;
    
    @FXML private AnchorPane paneChildView;
    
    @FXML private BorderPane paneRoot;
    
    private Pane testPane;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public MainController() {
        super();
        
        this.viewModel = new MainViewModel();
    }
    public MainController(ControllerBase parentController) {
        super(parentController);
        
        this.viewModel = new MainViewModel();
    }
    public MainController(ControllerBase parentController, MainViewModel viewModel) {
        super(parentController);
        
        this.viewModel = viewModel;
    }
    
    //</editor-fold>
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //bindings to viewmodel
        this.btnLockDatabase.disableProperty().bind(this.viewModel.unlockedProperty().not());
        this.paneCounters.visibleProperty().bind(this.viewModel.unlockedProperty());
        this.lblEntriesCount.textProperty().bind(this.viewModel.entryCountProperty().asString());
        this.lblGroupsCount.textProperty().bind(this.viewModel.groupCountProperty().asString());
        
        this.txtFldSearch.textProperty().bindBidirectional(this.viewModel.searchTextProperty());
        
        this.menuItemExit.setOnAction(evt -> this.viewModel.exitApp(evt));
        this.menuItemAbout.setOnAction(evt -> this.viewModel.showAbout(evt));
        this.btnLockDatabase.setOnAction(evt -> this.viewModel.lockDatabase(evt));
        this.btnPasswordGenerator.setOnAction(evt -> this.viewModel.showPasswordGenerator(evt));
        this.btnSettings.setOnAction(evt -> this.viewModel.showAppSettings(evt));
        this.btnClearSearch.setOnAction(evt -> this.viewModel.clearSearch(evt));
        
        //bindings between controls
        this.btnClearSearch.visibleProperty().bind(this.txtFldSearch.textProperty().isEmpty().not());
        
        this.viewModel.childViewModelProperty().addListener((obsVal, oldVal, newVal) -> {
            if (newVal == null) return;
            
            if (newVal instanceof UnlockViewModel vm) {
                Platform.runLater(() -> {
                    try {
                        setChildView(loadChildView("unlock", new UnlockController(this, vm)));
                    } catch (IOException ex) {
                        System.getLogger(MainController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                    }
                });
            }
            
            if (newVal instanceof DatabaseViewModel vm) {
                Platform.runLater(() -> {
                    try {
                        setChildView(loadChildView("database", new DatabaseController(this, vm)));
                    } catch (IOException ex) {
                        System.getLogger(MainController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                    }
                });
            }
            
            if (newVal instanceof SettingsViewModel vm) {
                Platform.runLater(() -> {
                    try {
                        setChildView(loadChildView("settings", new SettingsController(this, vm)));
                    } catch (IOException ex) {
                        System.getLogger(getClass().getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                    }
                });
            }
        });
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mustators (set) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    private Parent loadChildView(String fxml, ControllerBase controller) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/" + fxml + ".fxml"));
        loader.setController(controller);
        return loader.load();
    }
    private void setChildView(Parent childView) {
        this.paneChildView.getChildren().clear();
        this.paneChildView.getChildren().add(childView);
        
        AnchorPane.setTopAnchor(childView, 12d);
        AnchorPane.setRightAnchor(childView, 12d);
        AnchorPane.setBottomAnchor(childView, 12d);
        AnchorPane.setLeftAnchor(childView, 12d);
    }
    
    //</editor-fold>

}
