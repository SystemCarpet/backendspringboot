package co.edu.sena.systemcarpet.model.actor;

import co.edu.sena.systemcarpet.model.actor.access.Role;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "users")
//lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Integer id;
    @Column(name = "fname", length = 30, nullable = false)
    private String firstName;
    @Column(name = "sname", length = 30)
    private String secondName;
    @Column(name = "flastname", length = 30, nullable = false)
    private String firstLastName;
    @Column(name = "slastname", length = 30)
    private String secondLastName;
    @Column(name = "email", length = 60, nullable = false, unique = true)
    private String email;
    //@Column(name = "email_verified_at", nullable = false)
    //private Timestamp emailVerifiedAt;
    @Column(name = "password", length = 30, nullable = false)
    private String password;
    @Column(name = "phone", length = 10, unique = true)
    private String phone;
    @Column(name = "created_at", length = 30, nullable = false)
    private Timestamp createdAt;
    @Column(name = "update_at", length = 30, nullable = false)
    private Timestamp updateAt;
    //@Column(name = "remember_token")
    //private String rememberToken;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "rol_id")
    private Role role;


}
