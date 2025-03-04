import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationDBRepository extends JpaRepository<Customer, Long> {
    Customer findByUsername(String username);
}
