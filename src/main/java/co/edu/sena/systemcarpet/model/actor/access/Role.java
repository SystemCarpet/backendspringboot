package co.edu.sena.systemcarpet.model.actor.access;

import co.edu.sena.systemcarpet.model.actor.User;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "roles")
//lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Integer id;
    @Column(name = "is_active",nullable = false)
    private Boolean isActive;
    @Column(name = "name",nullable = false,length = 30,unique = true)
    private String name;
    @Column(name = "created_at", length = 30, nullable = false)
    private Timestamp createdAt;
    @Column(name = "update_at", length = 30, nullable = false)
    private Timestamp updateAt;

    @ManyToMany(mappedBy = "roleList")
    private List<User> userList;
}
