package vocarize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vocarize.data.Sets;
import vocarize.service.implementations.SetsServiceImpl;
import vocarize.service.implementations.UserServiceImpl;
import vocarize.service.implementations.VocabularyServiceImpl;
import vocarize.service.interfaces.VocabularyService;

import java.util.List;

@Controller
public class SetsController {
    SetsServiceImpl setsService;
    VocabularyServiceImpl vocabularyService;
    UserServiceImpl userService;

    @Autowired
    public SetsController(SetsServiceImpl setsService, VocabularyServiceImpl vocabularyService, UserServiceImpl userService) {
        this.setsService = setsService;
        this.vocabularyService = vocabularyService;
        this.userService = userService;
    }




}
