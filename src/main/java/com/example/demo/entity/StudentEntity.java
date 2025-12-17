package.com.example.springboot.Entity;

import jakarta.persistence.Entity;
import jakarta.per
import jakarta.per

@Entity
public class SampleEntity{
    @ID
    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer id;
        private String name;
        private String email;
        private String password;
        private Date created;
}