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

    Image IMAGE = new Image("\\caballeroQuieto.gif", 1100, 800, false, true); //1000 1255
    Image image2 = new Image("\\caballeroQuieto.gif", 500, 675, false, true);
    ImageView imageView = new ImageView(IMAGE);
    ImageView imageView2 = new ImageView(image2);
    private HashMap<KeyCode, Boolean> keys = new HashMap<>();
    static Pane root = new Pane();
    static ArrayList<Soldado> soldados = new ArrayList<Soldado>();
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void update() throws InterruptedException {
    	if (isPressed(KeyCode.RIGHT)) {
    		/*
    		for(int i = 0; i<10; i++) {
        		imageView.setTranslateX(imageView.getTranslateX()+1);;
    		}
    		*/
    		imageView.setImage(new Image("\\caballeroMov.gif", 500, 674, false, true));  	
    		for(int i = 0; i<10; i++) {
        		imageView.setTranslateX(imageView.getTranslateX()+1);;
        		imageView.setTranslateY(imageView.getTranslateY()+1);;
    		}
    	}
    	if (isPressed(KeyCode.LEFT)) {
    		/*
    		for(int i = 0; i<10; i++) {
        		imageView.setTranslateX(imageView.getTranslateX()+1);;
    		}
    		*/
    		imageView.setImage(new Image("\\caballeroQuieto.gif", 1100, 800, false, true));  		
    	}
    }
    
    public boolean isPressed(KeyCode key) {
    	return keys.getOrDefault(key, false);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{    	
    //mirror	imageView.setScaleX(-1);
    	imageView.setScaleX(0.5);
    	imageView.setScaleY(0.5);
    	imageView.setX(-100);
    	imageView2.setScaleX(0.5);
    	imageView2.setScaleY(0.5);
    	imageView2.setX(10);
        root.setPrefSize(1366, 768);
        root.getChildren().addAll(imageView);
   //     root.getChildren().addAll(imageView2);
        Scene scene = new Scene(root);
        scene.setOnKeyPressed(event->keys.put(event.getCode(),true));
        scene.setOnKeyReleased(event->{
        	keys.put(event.getCode(),false);
        });
        AnimationTimer timer = new AnimationTimer() {
        	@Override
        	public void handle(long now) {
        		try {
					update();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        	}
        };
        timer.start();
        primaryStage.setTitle("Simulador de pelea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}