package sample;

import javafx.application.Platform;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Hilo2 extends Thread{
    private ImageView[] buttono;

    public Hilo2(ImageView[] buttono) {
        this.buttono =buttono;
    }

    @Override
    public void run() {
        while (true){
            try {
                //3
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {

                    }
                });
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
