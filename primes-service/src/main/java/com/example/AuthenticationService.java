import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements IAuthenticationService {

    @Autowired
    private AuthenticationDBRepository repository;

    @Override
    public Customer register(String username, String password) {
        Customer customer = new Customer(username, password);
        return repository.save(customer);
    }
}
