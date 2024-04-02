package com.moontech.archetype.application.service;

import com.moontech.archetype.infrastructure.model.request.UserRequest;
import com.moontech.archetype.infrastructure.model.response.UserResponse;
import java.util.List;
import org.springframework.data.domain.Pageable;

/**
 * Reglas de negocio para usuarios.
 *
 * @author Felipe Monzón
 * @since Mar 25., 2024
 */
public interface UserService {
  /**
   * Consulta todos los usuarios
   *
   * @param pageable paginación
   * @return lista de usuarios
   */
  List<UserResponse> findAll(Pageable pageable);

  /**
   * Consulta los usuarios activos.
   *
   * @param pageable paginación
   * @return lista de usuarios
   */
  List<UserResponse> findAllActive(Pageable pageable);

  /**
   * guarda los datos de un usuario.
   *
   * @param request datos del usuario
   * @return datos del usuario registrado
   */
  UserResponse save(UserRequest request);

  /**
   * Actualiza los datos del usuario.
   *
   * @param id identificador del usuario
   * @param request datos a actualizar
   */
  void update(String id, UserRequest request);
}
