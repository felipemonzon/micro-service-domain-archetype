package com.moontech.archetype.commons.constant;

/**
 * Constantes de rutas
 *
 * @author Felipe Monzón
 * @enterprise moontech
 * @since Mar. 28, 2024
 */
public abstract class RoutesConstant {
  /** Ruta base para usuarios. */
  public static final String USERS_BASE_PATH = "${api.uri.domain.users}";

  /** Ruta para búsqueda datos. */
  public static final String SEARCH_PATH = "${api.uri.data.search}";

  /** Ruta para modificar datos. */
  public static final String DATA_MODIFIED_PATH = "${api.uri.data.modified}";

  /** Constructor de la class. */
  private RoutesConstant() {}
}
