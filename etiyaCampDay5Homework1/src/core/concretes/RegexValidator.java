package core.concretes;

import core.abstracts.EmailValidator;
import entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator implements EmailValidator {
    @Override
    public boolean validator(User user) {

        String regex = "^(.+)@(.+).(\\.com|io)$";

        if (!(user.geteMail().matches(regex))) {
            System.out.println("Hatalı mail adresi");
            return true;
        } else {
            return false;
        }
    }
}
