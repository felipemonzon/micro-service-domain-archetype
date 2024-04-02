package com.moontech.archetype.infrastructure.exception.custom;

import java.io.Serial;
import java.util.Collections;
import java.util.List;
import lombok.Getter;

/**
 * Excepción para badRequest.
 *
 * @author Felipe Monzón
 * @since Mar 11, 2024
 */
@Getter
public class BadRequestException extends RuntimeException {
  /** UID auto generado para el versionado de la clase. */
  @Serial private static final long serialVersionUID = 8925303792177335247L;

  /** Lista de campos incorrectos en la petición. */
  private final List<String> badFields;

  /**
   * Constructor de la clase.
   *
   * @param message mensaje de excepción arrojada por bad request.
   * @param badFields lista de campos que originaron la excepción.
   */
  public BadRequestException(String message, List<String> badFields) {
    super(message);
    this.badFields = Collections.unmodifiableList(badFields);
  }
}
