package App.ServiceImpl;

import App.Repositories.ShampoosDao;
import App.ServiceAPI.ShampoosService;
import model.BasicShampoos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ShampooServiceImpl implements ShampoosService{
    private final ShampoosDao shampoosDao;

    @Autowired
    public ShampooServiceImpl(ShampoosDao shampoosDao) {
        this.shampoosDao = shampoosDao;
    }

    @Override
    public BasicShampoos save(BasicShampoos shampoos) {
        return shampoosDao.save(shampoos);
    }
}
