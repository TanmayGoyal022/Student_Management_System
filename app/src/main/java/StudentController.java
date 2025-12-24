


import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StudentController {
    
    @FXML private TextField nameField;
    @FXML private TextField ageField;
    @FXML private TextField courseField;
    @FXML private TableView<Student> studentTable;

    final StudentDao studentDao = new StudentDao(); 

    public void addStudent() {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String course = courseField.getText();
        


        StudentDao.insertStudent(name, age, course);
        loadStudents();
    }

    public void loadStudents() {
        studentTable.getItems().setAll(StudentDao.getAllStudents());
    }
}

