package com.moontech.archetype.infrastructure.apis;

import com.moontech.archetype.application.service.UserService;
import com.moontech.archetype.commons.constant.RoutesConstant;
import com.moontech.archetype.infrastructure.model.request.UserRequest;
import com.moontech.archetype.infrastructure.model.response.UserResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = RoutesConstant.USERS_BASE_PATH)
public class TemplateController {
  /** Servicio de usuarios. */
  private final UserService userService;

  /**
   * API para consultar los usuarios.
   *
   * @param pageable datos de paginación
   * @return lista de usuarios
   */
  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<UserResponse>> findAll(@PageableDefault Pageable pageable) {
    return ResponseEntity.ok(this.userService.findAll(pageable));
  }

  /**
   * API para consultar los usuarios activos.
   *
   * @param pageable datos de la paginación
   * @return lista de usuarios encontrados
   */
  @GetMapping(path = "/active", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<UserResponse>> findAllActive(@PageableDefault Pageable pageable) {
    return ResponseEntity.ok(this.userService.findAllActive(pageable));
  }

  /**
   * Guarda los datos del usuario.
   *
   * @param request datos del usuario
   * @return usuario registrado con éxito
   */
  @PostMapping(
      produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<UserResponse> save(@RequestBody @Valid UserRequest request) {
    return new ResponseEntity<>(this.userService.save(request), HttpStatus.CREATED);
  }

  /**
   * API para actualizar los datos del usuario
   *
   * @param request datos del usuario
   * @param id identificador del usuario
   * @return 204 si se actualizó correctamente
   */
  @PutMapping(path = RoutesConstant.DATA_MODIFIED_PATH, consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Void> update(
      @RequestBody @Valid UserRequest request, @PathVariable @NotEmpty String id) {
    this.userService.update(id, request);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
