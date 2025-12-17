package.com.example.springboot.Entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SampleEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer id;
        private String name;
        private String email;
        private String password;
        private Date created;
        private Date getCreated();
}