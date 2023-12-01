package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;
	
	private void attnumero(Label label) {
		label.setText(Integer.toString(contador));
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		} else if(contador < 0){
			label.getStyleClass().add("vermelho");
		}
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label labelTitulo = new Label("Contagem");
		labelTitulo.getStyleClass().add("titulo");
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero"); 
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(e ->{
			contador--;
			attnumero(labelNumero);
		});
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction(e ->{
			contador ++;
			attnumero(labelNumero);
		});
		
		HBox boxbotao = new HBox();
		boxbotao.setSpacing(10);
		boxbotao.setAlignment(Pos.CENTER);
		boxbotao.getChildren().add(botaoDecremento);
		boxbotao.getChildren().add(botaoIncremento);
		
		
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setSpacing(10);
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxbotao);
	
		String caminhoCss = getClass().getResource("/basico/Contador.css").toExternalForm();
		Scene tela = new Scene(boxConteudo, 400, 400);
		tela.getStylesheets().add(caminhoCss);
		tela.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		primaryStage.setScene(tela);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
