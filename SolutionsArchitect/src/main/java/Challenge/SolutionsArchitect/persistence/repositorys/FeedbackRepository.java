package Challenge.SolutionsArchitect.persistence.repositorys;

import Challenge.SolutionsArchitect.domain.feedback.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}
