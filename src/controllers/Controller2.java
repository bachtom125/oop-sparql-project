package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import java.io.IOException;
import java.net.URL;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import vntourism.Beaches;
import vntourism.HeritageSites;
import vntourism.Lakes;
import vntourism.Museums;
import vntourism.NationalParks;
import vntourism.Temples;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import hellofx.Initializer;

public class Controller2 {

    @FXML
    ListView<String> listView2;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String nameOfAttraction;
    private String typeOfAttraction;

    public Controller2() {
    }

    public void switchToScene2(String typeOfAttaction) {
        this.typeOfAttraction = typeOfAttaction;
        Initializer initializer = new Initializer();
        if (typeOfAttaction.equals("Lakes")) {
            for (Lakes x : initializer.lakeArr) {
                listView2.getItems().add(x.getName());
            }
        }
        if (typeOfAttaction.equals("Beaches")) {
            for (Beaches x : initializer.beachArr) {
                listView2.getItems().add(x.getName());
            }
        }
        if (typeOfAttaction.equals("Heritage_Sites")) {
            for (HeritageSites x : initializer.heritageSiteArr) {
                listView2.getItems().add(x.getName());
            }
        }
        if (typeOfAttaction.equals("National_Parks")) {
            for (NationalParks x : initializer.nationalParkArr) {
                listView2.getItems().add(x.getName());
            }
        }
        if (typeOfAttaction == "Museums") {
            for (Museums x : initializer.museumArr) {
                listView2.getItems().add(x.getName());
            }
        }
        if (typeOfAttaction == "Temples") {
            for (Temples x : initializer.templeArr) {
                listView2.getItems().add(x.getName());
            }
        }

        listView2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
                // TODO Auto-generated method stub
                System.out.println("Selected Item: " + arg2);
                nameOfAttraction = arg2;
            }
        });

    }

    public void switchToScene1(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("../scenebuilder/scene1.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToScene3(ActionEvent event) {
        System.out.println("Switching to scene3");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../scenebuilder/scene3.fxml"));

        try {
            root = loader.load();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Controller3 controller3 = loader.getController();
        controller3.switchToScene3(typeOfAttraction, nameOfAttraction);
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
