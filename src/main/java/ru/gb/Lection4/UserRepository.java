package ru.gb.Lection4;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepository {
    private final Map<Long, User> users = new ConcurrentHashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public List<User> findAll(){
        return new ArrayList<>(users.values());
    }
    public User findUserById(Long id){
        return users.get(id);
    }
    public User saveUser(User user){
        user.setId(counter.incrementAndGet());
        users.put(user.getId(),user);
        return user;
    }
}
