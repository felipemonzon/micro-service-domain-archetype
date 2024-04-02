package com.moontech.archetype.infrastructure.model.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Respuesta para perfiles.
 *
 * @author Felipe Monzón
 * @since Mar 25., 2025
 */
@Getter
@Setter
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AuthorityResponse implements Serializable {
  /** Identificador del perfil. */
  private long id;

  /** Descripción del perfil. */
  private String name;

  /** Valor del perfil. */
  private String value;
}
