import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {

  @FXML
  private TextField username;

  @FXML
  private PasswordField password;

  @FXML
  private Label passIncorrect; // label to be set to visible if pass is incorrect

  /*------------------------------------------------------
    loginButton:
    code to be executed when the login button is hit
    checks the database to see if user/pass is correct
  --------------------------------------------------------*/
  @FXML
  public void loginButton(ActionEvent event) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

    Scene scene = new Scene(root, 450, 400);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(scene);
    window.show();
  }
}
