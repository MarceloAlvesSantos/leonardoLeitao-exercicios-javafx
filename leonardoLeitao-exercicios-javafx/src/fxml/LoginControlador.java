package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField emailField;
	@FXML
	private PasswordField senhaField;
	
	public void entrar() {
		
		boolean emailValido = emailField.getText().equals("aluno@gmail.com");
		boolean senhaValida = senhaField.getText().equals("123456");
		
		if (emailValido && senhaValida) {
			System.out.println("Sucesso!!");
			Notifications.create()
				.position(Pos.BOTTOM_RIGHT)
				.title("Login FXML")
				.text("Login efetuado com sucesso")
				.showInformation();
				
		} else {
			System.out.println("Falho");
			Notifications.create()
				.position(Pos.BOTTOM_RIGHT)
				.title("Login FXML")
				.text("Falha no Login")
				.showError();
		}
		
	}

}
