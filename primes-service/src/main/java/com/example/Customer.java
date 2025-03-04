import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    public Customer() {}

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
