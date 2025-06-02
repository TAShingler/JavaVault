/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javavault.controllers;

import com.javavault.models.VaultEntry;
import com.javavault.models.VaultGroup;
import com.javavault.viewmodels.DatabaseViewModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.SVGPath;

/**
 *
 * @author tyler
 */
public class DatabaseController extends ControllerBase {
    
    //<editor-fold defaultstate="collapsed" desc=" Fields/Properties ">
    
    private DatabaseViewModel viewModel;
    
    private boolean leftPaneVisible = true;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" UI Controls ">
    
    @FXML private SplitPane rootPane;
    
    @FXML private GridPane leftPane;
    @FXML private GridPane rightPane;
    
    @FXML private Button btnCreateGroup;
    @FXML private Button btnEditGroup;
    @FXML private Button btnDeleteGroup;
    @FXML private Button btnHideLeftPane;
    @FXML private Button btnCreateEntry;
    @FXML private Button btnEditEntry;
    @FXML private Button btnDeleteEntry;
    
    @FXML private ListView<VaultGroup> listViewGroups;
    
    @FXML private ChoiceBox<String> choiceBoxFilters;
    
    @FXML private TableView<VaultEntry> tblViewEntryItems;
    
    @FXML private TableColumn<VaultEntry, String> tblColIcon;
    @FXML private TableColumn<VaultEntry, String> tblColTitle;
    @FXML private TableColumn<VaultEntry, String> tblColUsername;
    @FXML private TableColumn<VaultEntry, String> tblColPassword;
    @FXML private TableColumn<VaultEntry, String> tblColAddress;
    @FXML private TableColumn<VaultEntry, String> tblColCreatedBy;
    @FXML private TableColumn<VaultEntry, String> tblColCreatedDate;
    @FXML private TableColumn<VaultEntry, String> tblColModifiedBy;
    @FXML private TableColumn<VaultEntry, String> tblColModifiedDate;
    @FXML private TableColumn<VaultEntry, Boolean> tblColFavorite;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    
    public DatabaseController() {
        super();
        
        this.viewModel = new DatabaseViewModel();
    }
    public DatabaseController(ControllerBase parentController) {
        super(parentController);
        
        this.viewModel = new DatabaseViewModel();
    }
    public DatabaseController(ControllerBase parentController, DatabaseViewModel viewModel) {
        super(parentController);
        
        this.viewModel = viewModel;
    }
    
    //</editor-fold>

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.btnCreateGroup.setOnAction(evt -> this.viewModel.createVaultGroup(evt));
        this.btnEditGroup.setOnAction(evt -> this.viewModel.editVaultGroup(evt));
        this.btnDeleteGroup.setOnAction(evt -> this.viewModel.deleteVaultGroup(evt));
        this.btnCreateEntry.setOnAction(evt -> this.viewModel.createVaultEntry(evt));
        this.btnEditEntry.setOnAction(evt -> this.viewModel.editVaultEntry(evt));
        this.btnDeleteEntry.setOnAction(evt -> this.viewModel.deleteVaultEntry(evt));
        this.btnHideLeftPane.setOnAction(evt -> System.out.println("Hide left pane button nt yet implemented..."));
        this.choiceBoxFilters.setOnAction(evt -> this.viewModel.filterVaultEntryTable(evt));
        
        this.listViewGroups.setItems(this.viewModel.getGroupsList());
        this.tblViewEntryItems.setItems(this.viewModel.getEntryList());
        this.choiceBoxFilters.setItems(this.viewModel.getFiltersList());
        
        this.tblColIcon.setReorderable(false);
        this.tblColIcon.setResizable(false);
        this.tblColIcon.setCellValueFactory(data -> data.getValue().iconStringProperty());
//        this.tblColIcon.setCellFactory(cell -> new TableCell());    //use custom TableCell for icon images
        
        this.tblColTitle.setCellValueFactory(data -> data.getValue().titleProperty());
        this.tblColUsername.setCellValueFactory(data -> data.getValue().usernameProperty());
        this.tblColPassword.setCellValueFactory(data -> data.getValue().passwordProperty());
        this.tblColAddress.setCellValueFactory(data -> data.getValue().addressProperty());
        this.tblColCreatedDate.setCellValueFactory(data -> data.getValue().formattedCreatedDatetimeProperty());
        this.tblColCreatedBy.setCellValueFactory(data -> data.getValue().createdByProperty());
        this.tblColModifiedDate.setCellValueFactory(data -> data.getValue().formattedModifiedDatetimeProperty());
        this.tblColModifiedBy.setCellValueFactory(data -> data.getValue().modifiedByProperty());
        this.tblColFavorite.setCellValueFactory(data -> data.getValue().favoriteProperty());
        this.tblColFavorite.setCellFactory(col -> {
            return new TableCell<VaultEntry, Boolean>() {
                private final StackPane bounds = new StackPane();
                private final SVGPath check = new SVGPath();
                
                @Override
                protected void updateItem(Boolean cellData, boolean empty) {
                    super.updateItem(cellData, empty);
                    
                    if (cellData == null) {
                        this.setGraphic(null);
                    } else {
                        if (cellData.booleanValue() == true) {
                            this.bounds.getChildren().clear();
                            this.bounds.setPrefWidth(16);
                            this.bounds.setPrefHeight(16);
                            
                            this.check.setContent("M 20.5,8 9,19.5 3.5,14 5,12.5 l 4,4 10,-10 z");
                            this.check.setScaleX(0.666666);
                            this.check.setScaleY(0.666666);
                            this.bounds.getChildren().add(this.check);
                            
                            this.setGraphic(this.bounds);
                        } else {
                            this.setGraphic(null);
                        }
                    }
                }
            };
        });
        
//        this.viewModel.leftPaneVisibleProperty().addListener((obsVal, oldVal, newVal) -> {
//            this.rootPane.getItems().clear();
//            
//            if (newVal == true) {   //if visible
//                this.rootPane.getItems().add(this.leftPane);
//                this.rootPane.getItems().add(this.rightPane);
//                
//                this.rootPane.setDividerPosition(0, 0.25);
//            } else {    //if not visible
//                this.rootPane.getItems().add(this.rightPane);
//            }
//        });
        
//        this.rootPane.getDividers().get(0).positionProperty().addListener((ObservableValue<? extends Number> obsVal, Number oldVal, Number newVal) -> {
//            System.out.println("oldVal = " + oldVal.doubleValue() + "\tnewVal = " + newVal.doubleValue());
//            if (newVal.doubleValue() < 0.25)
//                rootPane.setDividerPosition(0, 0.25);
//            else if (newVal.doubleValue() > 0.75)
//                rootPane.setDividerPosition(0, 0.75);
//        });
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Accessors (get) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Mutators (set) ">
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
    
    
    //</editor-fold>
    
    
}
