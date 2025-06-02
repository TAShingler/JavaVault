/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.javavault.ui;

import com.javavault.models.VaultEntry;
import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author tashingler
 */
public class IconTableCell extends TableCell<VaultEntry, String> {
    
    private final ImageView imgView;

    public IconTableCell() {
        this.imgView = new ImageView();
        this.imgView.setFitWidth(24d);
        this.imgView.setFitHeight(24d);
        this.imgView.setSmooth(false);
    }

    @Override
    protected void updateItem(String cellData, boolean empty) {
        super.updateItem(cellData, empty);

        if (empty != true && cellData != null) {
            try {
                imgView.setImage(new Image(getClass().getResource("/img/icons/" + cellData + "_x24.png").toString()));
            } catch (Exception ex) {
                imgView.setImage(null);
            }
        }
        
        this.setGraphic(imgView);
    }

}
