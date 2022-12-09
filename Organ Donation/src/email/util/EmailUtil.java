/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package email.util;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author anujkumar
 */
public class EmailUtil {
    
    public static void sendEmail(String recepient,String uname,String pass) throws Exception{
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myAccountEmail = "fromsys.aedproject@gmail.com";
        String appPassword = "kznwneuhdxhpbpdh";
        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, appPassword); 
            }
        });
        
        Message message = prepareMessage(session, myAccountEmail, recepient,uname,pass);
        
        Transport.send(message);
        System.out.println("Message sent!");
    }
    
    public static Message prepareMessage(Session session, String myAccountEmail, String recepient,String username,String password) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Registration");
            String text="Your username is " + username + ". \nYour password is "+password+ "\n "
                    + "Thank you for registering.";
            message.setContent(text, "text/html");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(EmailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
