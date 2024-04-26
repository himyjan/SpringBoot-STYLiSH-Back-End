public interface CampaignRepository extends JpaRepository<Campaign, Long> {
    List<Campaign> findByLastName(String lastName);
}