package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


import java.util.Random;

public class Controller {
    @FXML
    Button btnSi, btnNo;
    Hilo hilo1;
    Hilo2 hilo2;
    AnchorPane anchor=new AnchorPane();


    public void Si(ActionEvent event) {
        anchor.setMaxHeight(500);
        anchor.setMaxWidth(500);
        anchor.setLayoutX(0);
        anchor.setLayoutY(0);
        Random random = new Random();
        int r = random.nextInt(50);
        ImageView[] button = new ImageView[r];
        for (int x = 0; x < r; x++) {
            button[x] = new ImageView(new Image("./sample/heart.png"));
            button[x].setFitHeight(50);
            button[x].setFitWidth(50);
            button[x].setLayoutY(440);
            button[x].setLayoutX(random.nextInt(500));
            anchor.getChildren().add(button[x]);

        }
        if (hilo2 != null) hilo2.stop();
        hilo2 = null;
        hilo2 = new Hilo2(button);
        hilo2.start();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Ya somos novios");
        alert.show();
    }

    public void No(MouseEvent event) {
        hilo1 = new Hilo(btnNo);
        hilo1.start();

        int x = (int) Math.round(Math.random());
        int y = (int) Math.round(Math.random());
        btnNo.setLayoutX(x);
        btnNo.setLayoutY(y);

    }
}
