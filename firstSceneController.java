package myapp1;


import java.io.IOException;
import logical.EmployeeData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
public class firstSceneController {

    @FXML
    private Button btn_add;

    @FXML
    private Button btn_display;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton rb_male;

    @FXML
    private RadioButton rd_female;

    @FXML
    private TextArea ta_all;

    @FXML
    private TextField tx_email;

    @FXML
    private TextField tx_name;

    @FXML
    void onDisplayButtonclicked(ActionEvent event) throws IOException {
            String data =ta_all.getText();
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Display.fxml"));
        Parent root = loader.load();
        DisplayController controller = (DisplayController)loader.getController();
        //controller.setData(data);
        Scene scene = new Scene(root);
        Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
       //controller.setStage(stage);
      //controller.fillfield();
     //stage.setUserData(data);
        stage.setScene(scene);
        stage.show();
          // تأخير التمرير لما يتم تحميل العناصر فعليًا
    javafx.application.Platform.runLater(() -> {
        controller.setStage(stage);
        controller.setData(data);
    });
    }

    

    @FXML
    void onSaveButtonCliicked(ActionEvent event) {
        String name = tx_name.getText().trim();
        String email = tx_email.getText().trim();
        boolean isMale = rb_male.isSelected();
   boolean isadded =EmployeeData.addEmployee(name,email,isMale);
   if(isadded){
   String allEmps =EmployeeData.getEmployeesAsString();
   ta_all.setText(allEmps);
   }
    }
}
