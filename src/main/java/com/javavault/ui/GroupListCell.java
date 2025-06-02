/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.javavault.ui;

import com.javavault.models.VaultGroup;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.SVGPath;

/**
 *
 * @author tashingler
 */
public class GroupListCell extends ListCell<VaultGroup> {
    
//    private final HBox rootPane;
//    
//    private final StackPane imgWrapper;
    
//    private SVGPath svgGroupIcon;
    
//    private Label lblGroupName;

    public GroupListCell() {
//        this.rootPane = new HBox();
//        this.imgWrapper = new StackPane();
//        this.imgWrapper.setPrefSize(16d, 16d);
//        this.imgWrapper.setMinSize(USE_PREF_SIZE, USE_PREF_SIZE);
//        this.imgWrapper.setMaxSize(USE_PREF_SIZE, USE_PREF_SIZE);
        
        //initialize Label
//        this.lblGroupName = new Label();
//        this.lblGroupName.setText("Group Label");
        
        //initialize SVGPath
//        this.svgGroupIcon = new SVGPath();
//        this.svgGroupIcon.setContent(
//                """
//                m 4.5,2.000001
//                c -0.6443321,0 -1.1666666,0.5372582 -1.1666666,1.1999998
//                V 10.399999
//                C 3.3333334,11.062742 3.8556679,11.6 4.5,11.6
//                h 9.333334
//                C 14.477664,11.6 15,11.062742 15,10.399999
//                V 4.4000006
//                C 15,3.7372591 14.477664,3.2000008 13.833334,3.2000008
//                H 9.1666666
//                L 8,2.000001
//                Z
//                
//                M 2.1666666,4.4000006
//                C 1.5203333,4.4000006 1,4.9352006 1,5.6000004
//                v 7.1999986
//                c 0,0.6648 0.5203333,1.2 1.1666666,1.2
//                H 11.5
//                c 0.646334,0 1.166666,-0.5352 1.166666,-1.2
//                H 2.1666666
//                Z
//                
//                m 2.3333334,0
//                h 9.333334
//                V 10.399999
//                H 4.5
//                Z
//                """
//        );
    }

    @Override
    protected void updateItem(VaultGroup group, boolean bln) {
        if (group == null) return;
        
        super.updateItem(group, bln);
        setText(group.getTitle());
        
//        switch(group.getTitle()) {
//            case "group1" -> this.svgGroupIcon.setContent("M4 2A2 2 0 0 0 2 4V12H4V8H6V12H8V4A2 2 0 0 0 6 2H4M4 4H6V6H4M22 15.5V14A2 2 0 0 0 20 12H16V22H20A2 2 0 0 0 22 20V18.5A1.54 1.54 0 0 0 20.5 17A1.54 1.54 0 0 0 22 15.5M20 20H18V18H20V20M20 16H18V14H20M5.79 21.61L4.21 20.39L18.21 2.39L19.79 3.61Z");
//            case "group2" -> this.svgGroupIcon.setContent("M5 5H7V11H5V5M10 5H8V11H10V5M5 19H7V13H5V19M10 13H8V19H10V17H15V15H10V13M2 21H4V3H2V21M20 3V7H13V5H11V11H13V9H20V15H18V13H16V19H18V17H20V21H22V3H20Z");
//            case "group3" -> this.svgGroupIcon.setContent("M12 4C10.08 4 8.5 5.58 8.5 7.5C8.5 8.43 8.88 9.28 9.5 9.91C7.97 10.91 7 12.62 7 14.5C7 17.53 9.47 20 12.5 20C14.26 20 16 19.54 17.5 18.66L16.5 16.93C15.28 17.63 13.9 18 12.5 18C10.56 18 9 16.45 9 14.5C9 12.91 10.06 11.53 11.59 11.12L16.8 9.72L16.28 7.79L11.83 9C11.08 8.9 10.5 8.28 10.5 7.5C10.5 6.66 11.16 6 12 6C12.26 6 12.5 6.07 12.75 6.2L13.75 4.47C13.22 4.16 12.61 4 12 4Z");
//        }
//        this.svgGroupIcon.setScaleX(0.66666);
//        this.svgGroupIcon.setScaleY(0.66666);
//        
//        this.imgWrapper.getChildren().clear();
//        this.imgWrapper.getChildren().add(this.svgGroupIcon);
//        
//        setGraphic(this.imgWrapper);
    }

}
