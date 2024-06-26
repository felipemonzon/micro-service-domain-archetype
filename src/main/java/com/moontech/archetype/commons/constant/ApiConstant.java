package com.moontech.archetype.commons.constant;

/**
 * Constantes para la aplicación.
 *
 * @author Felipe Monzón
 * @enterprise moontech
 * @since Mar 11., 2024
 */
public abstract class ApiConstant {
  /** Constante para el símbolo de la coma. */
  public static final String COMMA = ",";

  /** Constante para el header uuid. */
  public static final String HEADER_UUID = "uuid";

  /** Constante para mostrar el inicio de la petición. */
  public static final String START_REQUEST = "Inicia Llamado [{}]";

  /** Constante para la llave req.time. */
  public static final String TIME_REQ_ATTRIBUTE = "req.time";

  /** Constante usada como llave para el atributo uuid header. */
  public static final String UUID_MDC_LABEL = "mdc.uuid";

  /** Constante para mostrar el tiempo de petición y respuesta. */
  public static final String TIME_ELAPSED_MESSAGE =
      "Time elapsed for request round trip [{}]: {} ms";

  /** Prefijo para las propiedades de la aplicación. */
  public static final String PROPERTY_PREFIX = "api";

  /** Prefijo para las propiedades de swagger. */
  public static final String SWAGGER_PROPERTIES = "swagger";

  /** Espacio en blanco. */
  public static final String WHITE_SPACE = " ";

  /** Constructor privado. */
  private ApiConstant() {}
}
