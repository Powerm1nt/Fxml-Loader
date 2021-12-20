package com.sunproject.fxml_loader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author sundev79
 *
 */
public class ApplicationClass extends Application {
	
	protected static Stage primaryStage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;

		Parent root = FXMLLoader.load(getClass().getResource("ui/loader.fxml"));
		Scene scene = new Scene(root);

		/*
		 * Mettre une Icone pour le launcher. primaryStage.getIcons().add(new
		 * Image(getClass().getResource("Open_Logo.png").toExternalForm()));
		 */
		primaryStage.setTitle("Fxml_Loader");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		primaryStage.centerOnScreen();
	}

	public static void main(String[] args) {
		// Launch method
		launch(args);
	}

}
