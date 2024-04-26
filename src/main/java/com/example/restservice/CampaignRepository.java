import org.springframework.data.jpa.repository.JpaRepository;
import com.example.restservice.Campaign;
import java.util.List;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
    List<Campaign> findByLastName(String lastName);
}