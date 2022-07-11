package controllers;

import vntourism.Beaches;
import vntourism.HeritageSites;
import vntourism.Lakes;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import vntourism.Lakes;
import vntourism.Museums;
import vntourism.NationalParks;
import vntourism.Temples;
import vntourism.TouristAttractions;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import hellofx.Initializer;

public class Controller3 {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String typeOfAttraction;
    private String nameOfAttraction;

    @FXML
    TextArea textArea3;
    @FXML
    TextArea textArea4;

    TouristAttractions attraction;

    public Controller3() {
    }

    public void switchToScene3(String typeOfAttraction, String nameOfAttraction) {
        this.typeOfAttraction = typeOfAttraction;
        this.nameOfAttraction = nameOfAttraction;

    }

    public void DisplayInTurtle(ActionEvent event) {
        textArea3.clear();
        String lang = "TURTLE";
        Initializer initializer = new Initializer();
        if (this.typeOfAttraction.equals("National_Parks")) {
            for (NationalParks x : initializer.nationalParkArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.typeOfAttraction.equals("Beaches")) {
            for (Beaches x : initializer.beachArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.typeOfAttraction.equals("Lakes")) {
            for (Lakes x : initializer.lakeArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        System.out.println("SHIT: " + currentPath + "/cache/cache.txt\n");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.typeOfAttraction.equals("Museums")) {
            for (Museums x : initializer.museumArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.typeOfAttraction.equals("Heritage_Sites")) {
            for (HeritageSites x : initializer.heritageSiteArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.typeOfAttraction.equals("Temples")) {
            for (Temples x : initializer.templeArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void DisplayInXML(ActionEvent event) {
        textArea3.clear();
        String lang = "RDF/XML";
        Initializer initializer = new Initializer();
        if (this.typeOfAttraction.equals("National_Parks")) {
            for (NationalParks x : initializer.nationalParkArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.typeOfAttraction.equals("Beaches")) {
            for (Beaches x : initializer.beachArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.typeOfAttraction.equals("Lakes")) {
            for (Lakes x : initializer.lakeArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.typeOfAttraction.equals("Museums")) {
            for (Museums x : initializer.museumArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.typeOfAttraction.equals("Heritage_Sites")) {
            for (HeritageSites x : initializer.heritageSiteArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.typeOfAttraction.equals("Temples")) {
            for (Temples x : initializer.templeArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    attraction = x;
                    try {
                        String currentPath = new java.io.File(".").getCanonicalPath();
                        Path path = Paths.get(currentPath + "/cache/cache.txt");
                        BufferedReader reader = Files.newBufferedReader(path);
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void printToTxt(ActionEvent event) throws IOException {
        String content = textArea3.getText();
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("data.txt"), "UTF-8"));
        try {
            out.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            out.close();
        }
    }

    public void printToTtl(ActionEvent event) throws IOException {

    }

    public void addPrefix(ActionEvent event) {
        String prefix = textArea4.getText();
        String[] component = prefix.split(" ");
        for (String x : component)
            System.out.println(x);
        attraction.addPrefix(component[0], component[1]);
        attraction.display1("TURTLE");
        DisplayInTurtle(event);

    }
}
