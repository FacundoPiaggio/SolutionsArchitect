package Challenge.SolutionsArchitect.controller;

import Challenge.SolutionsArchitect.service.feedback.FeedbackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackServiceImpl feedbackService;

    @GetMapping("/feedback")
    public String getFeedbackForm(Model model){

        return "feedback";
    }

    @PostMapping("/feedback")
    public String postFeedbackForm(Model model,
                                   @ModelAttribute("name") String name,
                                   @ModelAttribute("email") String email,
                                   @ModelAttribute("feedback") String feedback){

        System.out.println(name + " " + email + " " + feedback);


        return "home";
    }
}
