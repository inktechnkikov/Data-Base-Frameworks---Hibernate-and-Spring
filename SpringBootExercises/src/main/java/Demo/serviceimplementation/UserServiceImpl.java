package Demo.serviceimplementation;

import Demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Demo.repositories.UserRepo;
import Demo.services.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void persist(User user) {
        this.userRepo.save(user);
    }

    @Override
    public void multipleUsersPersist(List<User> userList) {
        this.userRepo.save(userList);
    }


}
