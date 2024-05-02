package co.edu.sena.systemcarpet.model.actor.access;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "roles")
//lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Integer id;
    @Column(name = "is_active",nullable = false)
    private Boolean isActive;
    @Column(name = "created_at", length = 30, nullable = false)
    private Timestamp createdAt;
    @Column(name = "update_at", length = 30, nullable = false)
    private Timestamp updateAt;

}
