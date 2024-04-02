package com.moontech.archetype.commons.utilities;

import java.security.SecureRandom;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Clase de utilerías.
 *
 * @author Felipe Monzón
 * @since Mar. 28, 2024
 */
public class Utilities {
  /**
   * Obtiene la pagina actual.
   *
   * @param pageable paginación
   * @return pagina actual
   */
  public static int getCurrentPage(Pageable pageable) {
    int page = pageable.getPageNumber();
    if (pageable.getPageNumber() != 0) {
      page -= 1;
    }
    return page;
  }

  /**
   * Genera el id a guardar.
   *
   * @param prefix prefijo del identificador aleatorio
   * @return identificador generado
   */
  public static String generateRandomId(String prefix) {
    return prefix
        + RandomStringUtils.random(17, 0, 0, Boolean.TRUE, Boolean.TRUE, null, new SecureRandom());
  }

  /**
   * Encripta la contraseña.
   *
   * @param password contraseña a encriptar
   * @return contraseña encriptada
   */
  public static String passwordEncoder(final String password) {
    return new BCryptPasswordEncoder().encode(password);
  }

  /** Constructor privado. */
  private Utilities() {}
}
