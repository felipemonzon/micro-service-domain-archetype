package com.moontech.archetype.infrastructure.property;

import com.moontech.archetype.commons.constant.ApiConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Propiedades externalizadas de la aplicación.
 *
 * @author Felipe Monzón
 * @since Mar 11, 2024
 */
@Data
@Configuration
@ConfigurationProperties(prefix = ApiConstant.PROPERTY_PREFIX)
public class PropertiesConstant {
  /** Ruta para la intercepción de la petición. */
  private String interceptorPath;
}
