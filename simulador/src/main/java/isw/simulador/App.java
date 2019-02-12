package isw.simulador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    Image IMAGE = new Image(getClass().getResourceAsStream("capitanAzul.png"), 500, 675, false, true); //1000 1255
    Image image2 = new Image(getClass().getResourceAsStream("soldadoAzul.png"), 500, 675, false, true);
    ImageView imageView = new ImageView(IMAGE);
    ImageView imageView2 = new ImageView(image2);
    Soldado soldado2 = new Soldado(imageView2);
    Soldado soldado = new Soldado(imageView);
    private HashMap<KeyCode, Boolean> keys = new HashMap<>();
    static VBox root = new VBox();
    static ArrayList<Soldado> soldados = new ArrayList<Soldado>();
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void update() {
    	if (isPressed(KeyCode.RIGHT)) {
    		soldado.animation.play();
    		soldado.animation.setOffsetY(0);
    		soldado.moveX(2);
    	}
    	else if(isPressed(KeyCode.DOWN)) {  		
    		soldado.animation.play();
    		soldado.animation.setOffsetY(145);//255
    	}
    	else if(isPressed(KeyCode.UP)) {
    		soldado.animation.play();
    		soldado.animation.setOffsetY(270);//510
    	}
    	else if(isPressed(KeyCode.LEFT)) {
    		soldado.animation.play();
    		soldado.animation.setOffsetY(422);//765
    	}
    	else {
    		soldado.animation.stop();
    	}
    }
    
    public boolean isPressed(KeyCode key) {
    	return keys.getOrDefault(key, false);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{    	
    	for(int i=0;i<10;i++) {
    		Soldado sold = new Soldado(imageView2);
    //		soldados.add(sold);
    		root.getChildren().add(sold);
    	}
        root.setPrefSize(1366, 768);
    //    root.getChildren().addAll(soldados);
    //    root.getChildren().addAll(soldado2);
        Scene scene = new Scene(root);
        scene.setOnKeyPressed(event->keys.put(event.getCode(),true));
        scene.setOnKeyReleased(event->{
        	keys.put(event.getCode(),false);
        });
        AnimationTimer timer = new AnimationTimer() {
        	@Override
        	public void handle(long now) {
        		update();
        	}
        };
        timer.start();
        primaryStage.setTitle("Simulador de pelea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}