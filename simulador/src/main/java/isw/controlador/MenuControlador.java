package isw.controlador;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuControlador {

	@FXML
	private Button btnJugar;

	@FXML
	private Button btnSalir;

	@FXML
	void clickBtnJugar(ActionEvent event) throws IOException {
		Stage stage = (Stage) btnJugar.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/isw/vista/juego.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	@FXML
	void clickBtnSalir(ActionEvent event) {
		Stage stage = (Stage) btnSalir.getScene().getWindow();
		stage.close();
	}
}
