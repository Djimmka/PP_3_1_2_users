package com.example.pp_3_1_2_users.servise;

import com.example.pp_3_1_2_users.models.User;
import com.example.pp_3_1_2_users.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserServiceImp(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> findAll() {
        return usersRepository.findAll();
    }

    public User findById(long id) {
        Optional<User> user = usersRepository.findById(id);
        return user.orElse(null);
    }

    @Transactional
    public void save(User user) {
        usersRepository.save(user);
    }

    @Transactional
    public void update(long id, User updUser) {
        updUser.setId(id);
        usersRepository.save(updUser);
    }

    @Transactional
    public void delete(long id) {
        usersRepository.deleteById(id);
    }

    @Transactional
    public void gen5Users() {
        for (int i = 1; i < 6; i++) {
            User user = new User(2220 + i, "lastName_" + i, "name_" + i);
            update((long) i, user);
        }
    }

}
