package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		//VBox box = new VBox(); // VBox -> Elementos na vertical
		
		HBox box = new HBox(); // HBox -> Elementos na horizontal
		
		box.setSpacing(10); // espaçamento entre os botões
		box.setAlignment(Pos.CENTER); // Centralizando os elementos
		box.getChildren().add(botaoA); // Adicionando o botão ao box
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		botaoA.setOnAction(e -> System.out.println("A")); // Ações dos botões
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e -> System.exit(0)); // Fecha no botãoC
		
		Scene unicaCena = new Scene(box, 200, 150);
		
		primaryStage.setScene(unicaCena);

		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
