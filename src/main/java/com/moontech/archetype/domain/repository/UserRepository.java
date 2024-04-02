package com.moontech.archetype.domain.repository;

import com.moontech.archetype.commons.enums.Status;
import com.moontech.archetype.domain.entity.UserEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio de usuarios.
 *
 * @author Felipe Monzón
 * @since Mar 25, 2024
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
  /**
   * Consulta un usuario por su nombre de usuario.
   *
   * @param username nombre de usuario
   * @return usuario encontrado o vacío sino se encontró nada
   */
  Optional<UserEntity> findByUsername(String username);

  /**
   * Consulta usuarios por su status.
   *
   * @param pageable paginación
   * @param status estatus del usuario
   * @return lista de usuarios encontrados
   */
  List<UserEntity> findAllByStatus(Pageable pageable, Status status);

  /**
   * Consulta un usuario por su identificador.
   *
   * @param idUser identificador del usuario
   * @return datos del usuario encontrado
   */
  UserEntity findByIdUser(String idUser);
}
