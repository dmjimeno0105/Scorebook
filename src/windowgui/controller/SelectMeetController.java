package windowgui.controller;

import java.util.ArrayList;

import capstone.scorebook.data.concrete.Meet;
import capstone.scorebook.data.concrete.ScorebookDatabase;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class SelectMeetController extends BaseController {

	private String fxmlToOpen;

	@FXML
	private ComboBox<Meet> selectMeetBox;

	@FXML
	private Button selectMeetButton;



	@FXML
	private void initialize() {

		selectMeetBox.getItems().setAll(ScorebookDatabase.getDB().getAllMeets());
		selectMeetBox.getSelectionModel().selectFirst();

	}

	public void enterData() {

		System.out.println(fxmlToOpen);

		this.<MeetController>openFXML(fxmlToOpen, controller -> controller.setMeet(selectMeetBox.getValue()));
		
	}

	public void setFXMLtoOpen(String fxml) { this.fxmlToOpen = fxml; }

}
