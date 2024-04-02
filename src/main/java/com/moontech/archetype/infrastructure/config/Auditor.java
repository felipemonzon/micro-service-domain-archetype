package com.moontech.archetype.infrastructure.config;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

/**
 * Configuración de la clase auditora.
 *
 * @author Felipe Monzón
 * @since Mar 31, 2024
 */
@Component
public class Auditor implements AuditorAware<String> {
  /**
   * Consulta el usuario auditor.
   *
   * @return usuario encontrado
   */
  @Override
  public Optional<String> getCurrentAuditor() {
    String user = "system";
    return Optional.of(user);
  }
}
