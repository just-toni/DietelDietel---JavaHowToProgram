package business.toni.mydiary.services;


import business.toni.mydiary.models.User;

public interface UserService {
    User saveUser(String username, String password);
}
