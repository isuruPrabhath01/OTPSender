package controller;


import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


import service.EmailSender;
import util.NotificationController;



public class LoginFormController  {


    public AnchorPane LoginFormContext;
    public String email;
    public JFXTextField txtEmail;
    public JFXTextField txtOTP;
    NotificationController notificationController=new NotificationController();

    public void btnForgotPasswordOnAction(ActionEvent actionEvent) {
        email=txtEmail.getText();
        new EmailSender(email);
        notificationController.confirmMassage("OTP IN Your Mail","Your OTP is in your "+email);
    }


    public void btnCheckOnAction(ActionEvent actionEvent) {
        if (txtOTP.getText().equals(EmailSender.OTP))
        notificationController.confirmMassage("OTP Confomation","Your OTP is Correct");
        else notificationController.confirmMassage("OTP Confomation","Your OTP is Incorrect");
    }
}






