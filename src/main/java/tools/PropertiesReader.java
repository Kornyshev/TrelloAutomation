package tools;

import models.UserCredentials;
import tools.exceptions.NoSuchTestUserException;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class PropertiesReader {

    public static UserCredentials getUserCredentials() {
        ResourceBundle bundle = ResourceBundle.getBundle("credentials");
        try {
            String email = bundle.getString("email");
            String password = bundle.getString("pass");
            return new UserCredentials(email, password);
        } catch (MissingResourceException e) {
            throw new NoSuchTestUserException("I can't find such User in property file", e);
        }
    }

    public static String getReportPortalParameter(String param) {
        ResourceBundle bundle = ResourceBundle.getBundle("report_portal");
        return bundle.getString(param);
    }

    public static String getUiAutomationParameter(String param) {
        ResourceBundle bundle = ResourceBundle.getBundle("ui_automation");
        return bundle.getString(param);
    }
}