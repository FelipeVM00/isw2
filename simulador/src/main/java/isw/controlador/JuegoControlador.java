package isw.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;

import isw.simulador.Arquero;
import isw.simulador.Caballero;
import isw.simulador.Capitan;
import isw.simulador.Ejercito;
import isw.simulador.Guerrero;
import isw.simulador.Soldado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JuegoControlador{
	
	private boolean ejercitoCreado = false;
	
	private static Ejercito ejercito1;
	
	private static Ejercito ejercito2;
	
	private static ArrayList<Soldado> soldados1 = new ArrayList<Soldado>();
	
	private static ArrayList<Soldado> soldados2 = new ArrayList<Soldado>();
	
	private Soldado soldado1;
	
	private Soldado soldado2;
	
	private Soldado soldadoGanador;
	
    @FXML
    private Pane pane;
    
	@FXML
	private Button btnCrearEjer;

	@FXML
	private Button btnIniciarPelea;

	@FXML
	private Button btnReiniciar;
	
	@FXML
    private ImageView banderaRoja;

    @FXML
    private ImageView banderaAzul;
	
	@FXML
    private Text textoTamañoEquipo1;
	
	@FXML
    private Text textoTamañoEquipo2;

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
			int tamañoEjercito1 = 5 + (int) (Math.random() * 6);
			int tamañoEjercito2 = 5 + (int) (Math.random() * 6);
			Capitan capitan = new Capitan("Rojo");
			capitan.getSprite().setX(-100);
			capitan.getSprite().setY(450);
			pane.getChildren().add(capitan.getSprite());
			Capitan capitan2 = new Capitan("Azul");
			capitan2.getSprite().setX(1210);
			capitan2.getSprite().setY(450);
			capitan2.getSprite().setScaleX(-1);
			pane.getChildren().add(capitan2.getSprite());
			banderaRoja.setVisible(true);
			banderaAzul.setVisible(true);
			textoTamañoEquipo1.setText(""+(tamañoEjercito2));
			textoTamañoEquipo2.setText(""+(tamañoEjercito1));
			textoTamañoEquipo1.setVisible(true);
			textoTamañoEquipo2.setVisible(true);
			
			for(int i=0; i <tamañoEjercito1-1; i++) {
				int x = 0;
				int y = 0;
				int tipo = (int) (Math.random() * 3) + 1;
				switch(tipo) {
				case 1:{
					x = 200;
					y = (int) (Math.random() * 50) + 500;
					Guerrero guerrero = new Guerrero("Rojo");
					guerrero.getSprite().setX(x);
					guerrero.getSprite().setY(y);
					pane.getChildren().add(guerrero.getSprite());
					soldados1.add(guerrero);
					break;
				}
				case 2:{
					x = 250;
					y = (int) (Math.random() * 40) + 420;
					Caballero caballero = new Caballero("Rojo");
					caballero.getSprite().setX(x);
					caballero.getSprite().setY(y);
					pane.getChildren().add(caballero.getSprite());
					soldados1.add(caballero);
					break;
				}
				case 3:{
					x = 100;
					y = (int) (Math.random() * 50) + 500;
					Arquero arquero = new Arquero("Rojo");
					arquero.getSprite().setX(x);
					arquero.getSprite().setY(y);
					pane.getChildren().add(arquero.getSprite());
					soldados1.add(arquero);
					break;
				}
				}
			}
			
			for(int i=0; i <tamañoEjercito2-1; i++) {
				int x = 0;
				int y = 0;
				int tipo = (int) (Math.random() * 3) + 1;
				switch(tipo) {
				case 1:{
					x = 1080;
					y = (int) (Math.random() * 50) + 500;
					Guerrero guerrero = new Guerrero("Azul");
					guerrero.getSprite().setScaleX(-1);
					guerrero.getSprite().setX(x);
					guerrero.getSprite().setY(y);
					pane.getChildren().add(guerrero.getSprite());
					soldados2.add(guerrero);
					break;
				}
				case 2:{
					x = 900;
					y = (int) (Math.random() * 40) + 420;
					Caballero caballero = new Caballero("Azul");
					caballero.getSprite().setScaleX(-1);
					caballero.getSprite().setX(x);
					caballero.getSprite().setY(y);
					pane.getChildren().add(caballero.getSprite());
					soldados2.add(caballero);
					break;
				}
				case 3:{
					x = 1200;
					y = (int) (Math.random() * 50) + 500;
					Arquero arquero = new Arquero("Azul");
					arquero.getSprite().setScaleX(-1);
					arquero.getSprite().setX(x);
					arquero.getSprite().setY(y);
					pane.getChildren().add(arquero.getSprite());
					soldados2.add(arquero);
					break;
				}
				}
			}
			
			soldados1.add(capitan);
			soldados2.add(capitan2);
			ejercito1 = new Ejercito("Rojo", soldados1, capitan);
			ejercito2 = new Ejercito("Azul", soldados2, capitan2);
		}
	}

	@FXML
	void clickBtnIniciarPelea(ActionEvent event) throws InterruptedException {
		boolean esTurno = false;
		boolean peleaActiva = false;
		int soldadoPrimero = 1 + (int) (Math.random() * (2 - 1 + 1));	
		if(ejercitoCreado) {		
			soldado1 = ejercito1.seleccionarSoldado();
			soldado2 = ejercito2.seleccionarSoldado();
			if(ejercito1.getSoldados().isEmpty() || ejercito2.getSoldados().isEmpty()){
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle(null);
				alert.setHeaderText(null);
				alert.setContentText("¡¡ LA BATALLA FINALIZO !!");
				alert.showAndWait();
			}else {
				do {
					Thread.sleep(2000);
					peleaActiva = true;
					if(soldadoPrimero == 1) {
						if(!esTurno) {		
							if(soldado2.getPuntosResistencia() > 0) {
								esTurno = soldado2.atacar(soldado1.getPuntosAtaque(), soldado1);
							}			
							else {	
								soldadoGanador = soldado1;
								pane.getChildren().remove(soldado2.getSprite());
								soldado2 = null;
								textoTamañoEquipo2.setText(Integer.toString((Integer.parseInt(textoTamañoEquipo2.getText()) - 1)));
								peleaActiva = false;
							}
						}
						if(esTurno) {
							if(soldado1.getPuntosResistencia() > 0) {
								soldado1.atacar(soldado1.getPuntosAtaque(), soldado2);
								esTurno = false;
							}
							else {
								soldadoGanador = soldado2;
								pane.getChildren().remove(soldado1.getSprite());
								soldado1 = null;
								textoTamañoEquipo1.setText(Integer.toString((Integer.parseInt(textoTamañoEquipo1.getText()) - 1)));
								peleaActiva = false;
							}		
						}
					}
					else {				
						if(!esTurno) {		
							if(soldado1.getPuntosResistencia() > 0) {
								esTurno = soldado1.atacar(soldado1.getPuntosAtaque(), soldado2);
							}			
							else {				
								soldadoGanador = soldado2;
								pane.getChildren().remove(soldado1.getSprite());
								soldado1 = null;
								textoTamañoEquipo1.setText(Integer.toString((Integer.parseInt(textoTamañoEquipo1.getText()) - 1)));
								peleaActiva = false;
							}
						}
						if(esTurno) {
							if(soldado2.getPuntosResistencia() > 0) {
								soldado2.atacar(soldado2.getPuntosAtaque(), soldado1);
								esTurno = false;
							}
							else {
								soldadoGanador = soldado1;
								pane.getChildren().remove(soldado2.getSprite());
								soldado2 = null;
								textoTamañoEquipo2.setText(Integer.toString((Integer.parseInt(textoTamañoEquipo2.getText()) - 1)));
								peleaActiva = false;
							}		
						}
					}			
					
				}while(peleaActiva);
				soldado1 = soldadoGanador;
				if(soldado1.getColor() == "Rojo") {
					soldado2 = ejercito2.seleccionarSoldado();
				}
				else if(soldado1.getColor() == "Azul") {
					soldado2 = ejercito1.seleccionarSoldado();
				}
			}
			
		}
		else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle(null);
			alert.setHeaderText(null);
			alert.setContentText("¡¡ NO hay ejercitos creados !!");
			alert.showAndWait();
		}
		
	}

	@FXML
	void clickBtnReiniciar(ActionEvent event) throws IOException {
		Stage stage = (Stage) btnReiniciar.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/isw/vista/juego.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

}
