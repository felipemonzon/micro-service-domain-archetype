package com.moontech.archetype.commons.enums;

import lombok.Getter;

/**
 * Enum de identificadores.
 *
 * @author Felipe Monzón
 * @since Mar. 28, 2024
 */
@Getter
public enum Identifier {
  USERS("USR");

  /** Código del identificador. */
  private final String code;

  /**
   * Constructor del enum
   *
   * @param code código
   */
  Identifier(String code) {
    this.code = code;
  }
}
