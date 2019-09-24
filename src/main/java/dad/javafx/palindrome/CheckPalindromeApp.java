package dad.javafx.palindrome;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindromeApp extends Application {
	
	private TextField sentenceText;
	private Button checkButton;
	private Label resultLabel;

	@Override
	public void start(Stage primaryStage) throws Exception {

		sentenceText = new TextField();
		sentenceText.setPromptText("Introduce una sentencia");
		sentenceText.setMaxWidth(150);
		
		checkButton = new Button("Comprobar");
		checkButton.setDefaultButton(true);
		checkButton.setOnAction(e -> onCheckButtonAction(e));
		
		resultLabel = new Label();
		
		VBox root = new VBox(5, sentenceText, checkButton, resultLabel);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Check Palindrome");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	private void onCheckButtonAction(ActionEvent e) {
		String sentence = sentenceText.getText();
		if (Palindrome.check(sentence)) {
			resultLabel.setText("Es palíndromo");
			resultLabel.setStyle("-fx-text-fill: green;");
		} else {
			resultLabel.setText("NO es palíndromo");			
			resultLabel.setStyle("-fx-text-fill: red;");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
