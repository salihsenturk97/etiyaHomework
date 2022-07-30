package core.abstracts;

import entities.concretes.User;

public interface EmailValidator {
    boolean validator(User user);
}
