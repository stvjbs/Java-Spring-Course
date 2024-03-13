package ru.gb.Lection4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public String listOfUsers(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }
    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id, Model model){
        model.addAttribute("user", userService.getUserByID(id));
        return "userProfile";
    }
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "users";
    }
}
