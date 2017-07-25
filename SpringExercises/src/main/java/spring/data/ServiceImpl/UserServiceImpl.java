package spring.data.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.data.Models.User;
import spring.data.Repos.UserRepo;
import spring.data.Services.UserService;

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
}
