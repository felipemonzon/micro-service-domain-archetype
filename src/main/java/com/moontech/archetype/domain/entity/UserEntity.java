package com.moontech.archetype.domain.entity;

import com.moontech.archetype.commons.enums.Genre;
import com.moontech.archetype.commons.enums.Status;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Set;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.NaturalId;

/**
 * Entidad para usuario.
 *
 * @author Felipe Monzón
 * @since May 27, 2023
 */
@Getter
@Setter
@ToString
@Entity(name = "users")
@Table(name = "users")
public class UserEntity extends AuditableEntity implements Serializable {
  /** Identificador del usuario. */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  /** Identificador del usuario. */
  @Column(name = "id_user", nullable = false, length = 20)
  private String idUser;

  /** Propiedad para el nombre del usuario. */
  @NaturalId
  @Column(name = "username", nullable = false, length = 20, unique = true)
  private String username;

  /** Propiedad primer nombre. */
  @Column(name = "first_name", nullable = false)
  private String firstName;

  /** Propiedad segundo nombre. */
  @Column(name = "last_name", nullable = false)
  private String lastName;

  /** Propiedad para el correo. */
  @Column(name = "email_address", nullable = false)
  private String email;

  /** Propiedad para el celular. */
  @Column(name = "cellphone", nullable = false)
  private String cel;

  /** Propiedad para el género. */
  @Enumerated(EnumType.STRING)
  @Column(name = "genre", nullable = false, columnDefinition = "varchar")
  private Genre genre;

  /** Propiedad para la contraseña. */
  @Column(name = "password", nullable = false, length = 200)
  private String password;

  /** Propiedad para el status del usuario. */
  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false, columnDefinition = "varchar")
  private Status status;

  /** Propiedad para el rol del usuario. */
  @ManyToMany
  @ToString.Exclude
  @EqualsAndHashCode.Include
  @JoinTable(
      name = "user_roles",
      joinColumns = {@JoinColumn(name = "id_user")},
      inverseJoinColumns = {@JoinColumn(name = "id_role")})
  @Column(name = "id_role", nullable = false)
  private Set<RoleEntity> roles;
}
