package com.sunproject.fxml_loader;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sunproject.fxml_loader.ui.LoadedUi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;

public class Controller implements Initializable {

	@FXML
	private Button chooseFile;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void chooseFile(ActionEvent e) {
		FileChooser chooser = new FileChooser();
		chooser.setTitle("Choose fxml file ...");
		chooser.setInitialDirectory(new File(System.getProperty("user.home")));
		chooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Fxml files (*.fxml)", "*.fxml"));
		File fxmlPickedFile = chooser.showOpenDialog(ApplicationClass.primaryStage);

		if (fxmlPickedFile != null) {
			try {
				LoadedUi.loadUi(fxmlPickedFile.toURI());
				ApplicationClass.primaryStage.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
