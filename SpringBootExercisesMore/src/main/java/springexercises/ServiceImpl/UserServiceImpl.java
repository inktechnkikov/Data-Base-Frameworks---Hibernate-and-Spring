package springexercises.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springexercises.Model.User;
import springexercises.Service.UserService;

@Service
public class UserServiceImpl implements UserService{
    private final UserService service;

    @Autowired
    public UserServiceImpl(UserService service) {
        this.service = service;
    }

    @Override
    public void persist(User user) {

    }
}
