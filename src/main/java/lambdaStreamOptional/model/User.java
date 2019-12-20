package lambdaStreamOptional.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class User {
    private static int id;
    private int user_id;
    private String login;
    private String password;
    private LocalDateTime registrationDate = LocalDateTime.now();
    private boolean status;
    private Set<Permission> permissions = new HashSet<>();

    public User(String login, String password) {
        id++;
        this.user_id =id;
        this.login = login;
        this.password = password;
        // nowy użytkownik domyślenie jest USER
        this.permissions.add(Permission.ROLE_USER);
    }
}






