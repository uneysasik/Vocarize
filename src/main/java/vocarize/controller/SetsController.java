package vocarize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vocarize.data.Sets;
import vocarize.data.User;
import vocarize.data.Vocabulary;
import vocarize.service.implementations.SetsServiceImpl;
import vocarize.service.implementations.UserServiceImpl;
import vocarize.service.implementations.VocabularyServiceImpl;
import vocarize.service.interfaces.VocabularyService;

import java.util.List;

@Controller
@RequestMapping(method = RequestMethod.GET)
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

    @GetMapping(path = "")
    public String indexPage(Model model) {
        return "index";
    }



        @GetMapping(path = "/findSets")
        public String findAllSets(Model model) {
            model.addAttribute("sets", setsService.findAllSets());
            return "createVocabulary";
        }


        @GetMapping(path = "/findSetsById/{id}")
        public String findSetsById(@PathVariable Long id, Model model) {
            model.addAttribute("set", setsService.findSetById(id));
            return "index";
        }

        @DeleteMapping(path = "/deleteSetById/{id}")
        public String deleteSet(@PathVariable Long id, Model model) {
            model.addAttribute("deleteSet", setsService.deleteSet(id));
            return "index";
        }
        @PostMapping(path = "/vocuets")
        public String createSet(Vocabulary sets){

            return "createVocabulary";
        }




}
