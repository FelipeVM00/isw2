package isw.simulador;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
public class Soldado extends Pane{
	
	ImageView imageView;
	int count = 7;
	int columns = 7;
	int offsetX = 0;
	int offsetY = 0;
	int width = 72;//143
	int heigth = 134;//250
	
	SpriteAnimation animation;
	
	public Soldado(ImageView imageView) {
		this.imageView = imageView;
		this.imageView.setViewport(new Rectangle2D(offsetX, offsetY, width, heigth));
		animation = new SpriteAnimation(imageView, Duration.millis(200), count, columns, offsetX, offsetY, width, heigth);
		getChildren().addAll(imageView);
	}
	
	public void moveX(int x) {
		boolean right = x>0?true:false;
		for(int i = 0; i < Math.abs(x); i++) {
			if(right) this.setTranslateX(this.getTranslateX()+1);
			else this.setTranslateX(this.getTranslateX()-1);
			
		}
	}
	
	public void moveY(int y) {
		boolean right = y>0?true:false;
		for(int i = 0; i < Math.abs(y); i++) {
			if(right) this.setTranslateY(this.getTranslateY()+1);
			else this.setTranslateY(this.getTranslateY()-1);
			
		}
	}
	
}
