package Challenge.SolutionsArchitect.service.feedback;

import Challenge.SolutionsArchitect.domain.feedback.Feedback;
import Challenge.SolutionsArchitect.persistence.repositorys.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository repository;

    @Override
    public Feedback saveFeedback(Feedback feedback) {
        return repository.save(feedback);
    }
}
