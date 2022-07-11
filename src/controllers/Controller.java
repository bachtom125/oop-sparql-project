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
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Controller{
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ListView<String> myListView;
    @FXML
    private Label myLabel;
    @FXML
    private Button selectButton;

    public void switchToScene2(ActionEvent event){ // when user click on select button then switch to scene 2
   
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../scenebuilder/scene2.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Controller2 controller2 = loader.getController();
        controller2.switchToScene2(currentAttraction);
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    String[] attractions = {"Lakes", "National_Parks", "Beaches", "Heritage_Sites", "Museums", "Temples"};
    String currentAttraction;

    public void loadInfor(ActionEvent event){ // when user click on load infor button, the information will get loaded 
        myListView.getItems().addAll(attractions);
        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
                // TODO Auto-generated method stub
                System.out.println("Selected Item: "+ arg2);
                currentAttraction = arg2;
                System.out.println(currentAttraction);
            }
        });
    }
    
}



