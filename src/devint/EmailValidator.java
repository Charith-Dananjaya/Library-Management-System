package devint;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -e-
 */
public class EmailValidator {
    private Pattern pattern;
    private Matcher matcher;
    
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    public EmailValidator (){
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
    
    /*
    Validate hex with regular
    @param hex
        hx for validation
    @return true valdi hex, false invalid hex
    */
    
    public boolean validate(final String hex){
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
    
}
