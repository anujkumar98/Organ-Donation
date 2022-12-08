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
 * @author slenk
 */
public class EmailUtil {
    public static void sendEmail(String recepient) throws Exception{
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
        
        Message message = prepareMessage(session, myAccountEmail, recepient);
        
        Transport.send(message);
        System.out.println("Message sent!");
    }
    
    public static Message prepareMessage(Session session, String myAccountEmail, String recepient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("AED Final Project");
//            String htmlCode = "<h1>AED Final Project</h1> </br> <h3>Email verification</h3>";
            String htmlCode = "<html>\n" +
"    <head>\n" +
"        <title>User Email Verification</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"        <style>\n" +
"            h1{\n" +
"                text-align: center;\n" +
"                color: blueviolet;\n" +
"                padding-top: 30px;\n" +
"            }\n" +
"            form{\n" +
"                width: 250px;\n" +
"                height: 300px;\n" +
"                padding: 20px;\n" +
"                position: absolute;\n" +
"                background-color: blueviolet;\n" +
"                top: 50%;\n" +
"                left: 50%;\n" +
"                transform: translate(-50%, -50%);\n" +
"                text-align: center;\n" +
"            }\n" +
"            input{\n" +
"                width: 100%;\n" +
"                display: inline-block;\n" +
"                margin: 20px 0;\n" +
"                font-size: 20px;\n" +
"            }\n" +
"            label{\n" +
"                color: #fff;\n" +
"                font-weight: 700;\n" +
"                font-size: 20px;\n" +
"            }\n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <h1>User Email Verification</h1>\n" +
"        <form action=\"UserVerify\" method=\"post\">\n" +
"            <label>User Name</label>\n" +
"            <input type=\"text\" name=\"username\">\n" +
"            <label>User Email</label>\n" +
"            <input type=\"email\" name=\"useremail\">\n" +
"            <input type=\"submit\" value=\"Register\">\n" +
"        </form>\n" +
"    </body>\n" +
"</html>\n" +
" \n" +
"";
            message.setContent(htmlCode, "text/html");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(EmailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
