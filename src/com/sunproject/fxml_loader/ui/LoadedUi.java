package com.sunproject.fxml_loader.ui;

import java.io.IOException;
import java.net.URI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoadedUi {

	public static void loadUi(URI fxmlFile) throws IOException {
		Parent root = FXMLLoader.load(fxmlFile.toURL());
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}
}
