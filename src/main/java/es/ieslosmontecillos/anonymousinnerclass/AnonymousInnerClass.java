package es.ieslosmontecillos.anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class AnonymousInnerClass extends Application {
    @Override
    public void start(Stage primaryStage){
        // Establezco un título
        primaryStage.setTitle("Botones anonimos");

        // Creo el grid panel
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        //grid.setVgap(10);
        //grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 320, 240);
        primaryStage.setScene(scene);

        // Creo los botones
        Button btnNew = new Button("New");
        Button btnOpen = new Button("Open");
        Button btnSave = new Button("Save");
        Button btnPrint = new Button("Print");

        // Los añado al grid indicando donde
        grid.add(btnNew, 0, 0);
        grid.add(btnOpen, 1, 0);
        grid.add(btnSave, 2, 0);
        grid.add(btnPrint, 3, 0);

        // Acción del botón new
        btnNew.setOnAction(
                new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent e){
                        System.out.println("Se ha pulsado el boton New.");
            }
        }
        );

        // Acción del botón Open
        btnOpen.setOnAction(
                new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent e){
                        System.out.println("Se ha pulsado el boton Open.");
                    }
                }
        );

        // Acción del botón Save
        btnSave.setOnAction(
                new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent e){
                        System.out.println("Se ha pulsado el boton Save.");
                    }
                }
        );

        // Acción del botón Print
        btnPrint.setOnAction(
                new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent e){
                        System.out.println("Se ha pulsado el boton Print.");
                    }
                }
        );

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}