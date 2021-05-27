package sample;

import javafx.application.Platform;
import javafx.scene.control.Button;

import java.util.Random;

//1
public class Hilo extends Thread{
    private Button button;
    //2
    public Hilo(Button button){
        this.button=button;
    }
    //2.5


    @Override
    public void run() {
        while (true){
            try {
                //3
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        //3.5
                        Random random=new Random();
                        int r=random.nextInt(50);
                        button.setLayoutX(button.getLayoutX()+r);
                        if (button.getLayoutX() >= 450) {
                            button.setLayoutY(button.getLayoutY() + 50);
                            button.setLayoutX(450);
                        }if (button.getLayoutY() >= 450) {
                            button.setLayoutX(button.getLayoutY() + r);
                            button.setLayoutX(50);
                        }
                    }
                });
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
