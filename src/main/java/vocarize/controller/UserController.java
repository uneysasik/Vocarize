package vocarize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vocarize.data.User;
import vocarize.service.implementations.SetsServiceImpl;
import vocarize.service.implementations.UserServiceImpl;
import vocarize.service.implementations.VocabularyServiceImpl;


@Controller
public class UserController {

    private UserServiceImpl service;
    private VocabularyServiceImpl vocabularyService;
    private SetsServiceImpl setsService;

    @Autowired
    public UserController(UserServiceImpl service, VocabularyServiceImpl vocabularyService, SetsServiceImpl setsService) {
        this.service = service;
        this.vocabularyService = vocabularyService;
        this.setsService = setsService;
    }

    @GetMapping(path = "/findUser")
    public String findAllUser(Model model) {
        model.addAttribute("users", service.findAllUsers());
        return "index";
    }

    @GetMapping(path = "/findUserById/{id}")
    public String findUserById(@PathVariable Long id, Model model) {
        model.addAttribute("user", service.findUserById(id));
        return "index";
    }

    @DeleteMapping(path = "/deleteUserById/{id}")
    public String deleteUser(@PathVariable Long id, Model model) {
        model.addAttribute("deleteUser", service.deleteUser(id));
        return "index";
    }
    @PostMapping(path = "/createUser")
    public String createUser( User user){
        service.createUser(user);
        return "index";
    }
}
