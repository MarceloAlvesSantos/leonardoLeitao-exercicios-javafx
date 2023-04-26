package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	
	private int contador = 0;
	
	private void atulizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		} else if(contador < 0) {
			label.getStyleClass().add("vermelho");
		}
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button botaoDecremento = new  Button("-");
		botaoDecremento.setOnAction(e -> {
			contador--;
			atulizarLabelNumero(labelNumero);
		});
		
		botaoDecremento.getStyleClass().add("botoes");
		
		Button botaoIncremento = new  Button("+");
		botaoIncremento.setOnAction(e -> {
			contador++;
			atulizarLabelNumero(labelNumero);			
		});
		botaoIncremento.getStyleClass().add("botoes");
		
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		String caminhoDoCss = getClass().getResource("/basico/Contador.css").toExternalForm();
		
		
		Scene cenaPricipal = new Scene(boxConteudo, 400, 400);
		
		cenaPricipal.getStylesheets().add(caminhoDoCss);
		cenaPricipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		
		primaryStage.setScene(cenaPricipal);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
