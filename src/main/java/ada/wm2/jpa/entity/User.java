package ada.wm2.jpa.entity;


import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    String Username;


    @Id
    String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
