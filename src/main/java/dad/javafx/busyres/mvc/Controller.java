package dad.javafx.busyres.mvc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.fxml.Initializable;

public class Controller implements Initializable {

	@FXML
	private HBox root;

	@FXML
	private VBox leftVBox;

	@FXML
	private Label buscarLabel;

	@FXML
	private Label reemplazarLabel;

	@FXML
	private VBox centerVBox;

	@FXML
	private TextField buscarTextField;

	@FXML
	private TextField reemplazarTextField;

	@FXML
	private FlowPane OptionsFlowPane;

	@FXML
	private CheckBox mayusCheckBox;

	@FXML
	private CheckBox buscarCheckBox;

	@FXML
	private CheckBox exprCheckBox;

	@FXML
	private CheckBox resaltarCheckBox;

	@FXML
	private VBox rightVBox;

	@FXML
	private Button buscarButton;

	@FXML
	private Button reemplazarButton;

	@FXML
	private Button reemplazarTodoButton;

	@FXML
	private Button cerrarButton;

	@FXML
	private Button ayudaButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	public HBox getView() {
		return root;
	}

}
