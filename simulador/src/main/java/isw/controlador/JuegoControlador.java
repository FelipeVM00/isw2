package isw.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import isw.simulador.Arquero;
import isw.simulador.Caballero;
import isw.simulador.Capitan;
import isw.simulador.Guerrero;
import isw.simulador.Soldado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;

public class JuegoControlador implements Initializable{
	
	private boolean ejercitoCreado = false;
	
    @FXML
    private Pane pane;
    
	@FXML
	private Button btnCrearEjer;

	@FXML
	private Button btnIniciarPelea;

	@FXML
	private Button btnReiniciar;

	@FXML
	void clickBtnCrearEjer(ActionEvent event) {
		if(ejercitoCreado) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle(null);
			alert.setHeaderText(null);
			alert.setContentText("¡¡ Ya se crearon los ejercitos !!");
			alert.showAndWait();
		}
		else {
			ejercitoCreado = true;
			int tamañoEjercito = (int) (Math.random() * 10) + 5;
			Soldado capitan = new Capitan();
			capitan.getSprite().setX(-100);
			capitan.getSprite().setY(450);
			pane.getChildren().add(capitan.getSprite());
			Soldado capitan2 = new Capitan();
			capitan2.getSprite().setX(1210);
			capitan2.getSprite().setY(450);
			capitan2.getSprite().setScaleX(-1);
			pane.getChildren().add(capitan2.getSprite());
			for(int i=0; i <tamañoEjercito-2; i++) {
				int x = 0;
				int y = 0;
				int tipo = (int) (Math.random() * 3) + 1;
				switch(tipo) {
				case 1:{
					x = 200;
					y = (int) (Math.random() * 50) + 500;
					Soldado guerrero = new Guerrero();
					guerrero.getSprite().setX(x);
					guerrero.getSprite().setY(y);
					pane.getChildren().add(guerrero.getSprite());
					break;
				}
				case 2:{
					x = 250;
					y = (int) (Math.random() * 40) + 420;
					Soldado caballero = new Caballero();
					caballero.getSprite().setX(x);
					caballero.getSprite().setY(y);
					pane.getChildren().add(caballero.getSprite());
					break;
				}
				case 3:{
					x = 100;
					y = (int) (Math.random() * 50) + 500;
					Soldado arquero = new Arquero();
					arquero.getSprite().setX(x);
					arquero.getSprite().setY(y);
					pane.getChildren().add(arquero.getSprite());
					break;
				}
				}
			}
			for(int i=0; i <tamañoEjercito-2; i++) {
				int x = 0;
				int y = 0;
				int tipo = (int) (Math.random() * 3) + 1;
				switch(tipo) {
				case 1:{
					x = 1080;
					y = (int) (Math.random() * 50) + 500;
					Soldado guerrero = new Guerrero();
					guerrero.getSprite().setScaleX(-1);
					guerrero.getSprite().setX(x);
					guerrero.getSprite().setY(y);
					pane.getChildren().add(guerrero.getSprite());
					break;
				}
				case 2:{
					x = 900;
					y = (int) (Math.random() * 40) + 420;
					Soldado caballero = new Caballero();
					caballero.getSprite().setScaleX(-1);
					caballero.getSprite().setX(x);
					caballero.getSprite().setY(y);
					pane.getChildren().add(caballero.getSprite());
					break;
				}
				case 3:{
					x = 1200;
					y = (int) (Math.random() * 50) + 500;
					Soldado arquero = new Arquero();
					arquero.getSprite().setScaleX(-1);
					arquero.getSprite().setX(x);
					arquero.getSprite().setY(y);
					pane.getChildren().add(arquero.getSprite());
					break;
				}
				}
			}
		}
	}

	@FXML
	void clickBtnIniciarPelea(ActionEvent event) {
		
	}

	@FXML
	void clickBtnReiniciar(ActionEvent event) {
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	    
}
