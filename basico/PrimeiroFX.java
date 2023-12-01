package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button botaoA = new Button("Entrar");
		Button botaoB = new Button("Opções");
		Button botaoC = new Button("Sair :(");
		botaoA.setOnAction(e -> System.out.println("Seja Bem vindo"));
		botaoB.setOnAction(e -> System.out.println("Faça suas mudanças"));
		botaoC.setOnAction(e -> System.exit(0));

		VBox box = new VBox();
		
		box.setSpacing(20);
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		Scene menu = new Scene(box, 100, 200);
		
		primaryStage.setScene(menu);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
