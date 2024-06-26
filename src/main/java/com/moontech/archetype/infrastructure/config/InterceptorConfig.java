package com.moontech.archetype.infrastructure.config;

import com.moontech.archetype.infrastructure.interceptor.TimeInterceptor;
import com.moontech.archetype.infrastructure.property.PropertiesConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuración para añadir el interceptor.
 *
 * @author Felipe Monzón
 * @since Mar 11, 2024
 */
@Configuration
@RequiredArgsConstructor
public class InterceptorConfig implements WebMvcConfigurer {
  /** Componente para medir el tiempo de la petición. */
  private final TimeInterceptor timeInterceptor;

  /** Constantes generales de la aplicación. */
  private final PropertiesConstant properties;

  /** Se registra el interceptor y al ruta a interceptar. */
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(timeInterceptor).addPathPatterns(this.properties.getInterceptorPath());
  }
}
