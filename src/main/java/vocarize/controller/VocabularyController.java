package vocarize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vocarize.data.User;
import vocarize.data.Vocabulary;
import vocarize.service.implementations.SetsServiceImpl;
import vocarize.service.implementations.UserServiceImpl;
import vocarize.service.implementations.VocabularyServiceImpl;

@Controller
public class VocabularyController {
    private UserServiceImpl service;
    private VocabularyServiceImpl vocabularyService;
    private SetsServiceImpl setsService;

    @Autowired
    public VocabularyController(UserServiceImpl service, VocabularyServiceImpl vocabularyService, SetsServiceImpl setsService) {
        this.service = service;
        this.vocabularyService = vocabularyService;
        this.setsService = setsService;
    }

    @GetMapping(path = "/findVocabularies")
    public String findAllVocabularies(Model model) {
        model.addAttribute("vocabularies", vocabularyService.findAllVocabularies());
        return "index";
    }

    @GetMapping(path = "/findVocabularyById/{id}")
    public String findVocabularyById(@PathVariable Long id, Model model) {
        model.addAttribute("vocabulary", vocabularyService.findVocabularyById(id));
        return "index";
    }

    @DeleteMapping(path = "/deleteVocabularyById/{id}")
    public String deleteVocabulary(@PathVariable Long id, Model model) {
        model.addAttribute("deleteVocabulary", vocabularyService.deleteVocabulary(id));
        return "index";
    }
    @PostMapping(path = "/createVocabulary")
    public String createVocabulary(Vocabulary vocabulary){
        vocabularyService.createVocabulary(vocabulary);
        return "index";
    }
}
