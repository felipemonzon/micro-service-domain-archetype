package com.moontech.archetype.infrastructure.exception.custom;

import java.io.Serial;
import lombok.Getter;

/**
 * Excepción de negocio.
 *
 * @author Felipe Monzón
 * @since Mar 11, 2024
 */
@Getter
public class BusinessException extends RuntimeException {
  /** Serial. */
  @Serial private static final long serialVersionUID = -6450278167900735942L;

  /** Código de error. */
  private final int code;

  /**
   * Constructor de la clase.
   *
   * @param code código de error
   * @param message mensaje de error
   */
  public BusinessException(int code, String message) {
    super(message);
    this.code = code;
  }
}
