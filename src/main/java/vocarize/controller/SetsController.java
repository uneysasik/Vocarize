package vocarize.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vocarize.entity.Sets;
import vocarize.service.interfaces.SetsServiceImpl;

@Controller
public class SetsController {
    SetsServiceImpl setsService;

    @RequestMapping("/AddSet")
    void AddSet(Sets set){
        setsService.AddSet(set);
    };


}
