module org.example.java_lab_task_master {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.java_lab_task_master to javafx.fxml;
    exports org.example.java_lab_task_master;
    exports org.example.java_lab_task_master.controller;
    opens org.example.java_lab_task_master.controller to javafx.fxml;
}