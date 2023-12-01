package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application{
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		criarPasso1();
		criarPasso2();
		criarPasso3();
		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();
	}
	private void criarPasso1() {
		Button proximopasso = new Button("Ir p/ 2º etapa");
		proximopasso.setOnAction(e -> {
			janela.setScene(passo2);
		});
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximopasso);
		
		passo1 = new Scene(box, 400, 400);
	}
	private void criarPasso2() {
		Button passoanterior = new Button("Voltar p/ 1º etapa");
		passoanterior.setOnAction(e -> {
			janela.setScene(passo1);
		});		
		Button proximopasso = new Button("Ir p/ 3º etapa");
		proximopasso.setOnAction(e -> {
			janela.setScene(passo3);
		});
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoanterior);
		box.getChildren().add(proximopasso);
		
		passo2 = new Scene(box, 400, 400);
	}
	private void criarPasso3() {
		Button passoanterior = new Button("Voltar p/ 2º etapa");
		passoanterior.setOnAction(e -> {
			janela.setScene(passo2);
		});		
		Button proximopasso = new Button("Finalizar");
		proximopasso.setOnAction(e -> System.exit(0));
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoanterior);
		box.getChildren().add(proximopasso);
		
		passo3 = new Scene(box, 400, 400);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
