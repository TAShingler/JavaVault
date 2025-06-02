package com.javavault;

import com.javavault.controllers.MainController;
import com.javavault.viewmodels.MainViewModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.animation.PauseTransition;
import javafx.scene.input.InputEvent;
import javafx.util.Duration;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
//    private PauseTransition timer;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("main"), 640, 480);
//        scene.addEventFilter(InputEvent.ANY, evt -> restartTimer());
//        
//        timer = new PauseTransition(Duration.seconds(5));
//        timer.setOnFinished(evt -> System.out.println("Inactivity timeout reached..."));
        
        stage.setScene(scene);
        stage.setMinWidth(700);
        stage.setMinHeight(500);
        stage.setWidth(800);
        stage.setHeight(600);
//        stage.focusedProperty().addListener((obsVal, oldVal, newVal) -> {
//            if (newVal == true) {
//                System.out.println("stage regained focus...");
//                restartTimer();
//            }
//        });
        stage.show();
        
//        restartTimer();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/" + fxml + ".fxml"));
        fxmlLoader.setController(new MainController(null, new MainViewModel(null)));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    //<editor-fold defaultstate="collapsed" desc=" Other Methods ">
    
//    private void restartTimer() {
//        System.out.println("timer restarted...");
//        timer.stop();
//        timer.playFromStart();
//    }
    
    //</editor-fold>
}