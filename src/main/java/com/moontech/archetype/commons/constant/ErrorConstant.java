package com.moontech.archetype.commons.constant;

/**
 * Constantes para errores de la aplicación.
 *
 * @author Felipe Monzón
 * @enterprise moontech
 * @since Mar 11., 2024
 */
public class ErrorConstant {
  /** Código genérico. */
  public static final Integer GENERIC_ERROR_CODE = 9009;

  /** Mensaje genérico. */
  public static final String GENERIC_ERROR_MESSAGE = "Ocurrió un error desconocido";

  /** Código para dato no encontrado. */
  public static final Integer BAD_REQUEST_CODE = 9002;

  /** Código para dato no encontrado. */
  public static final Integer RECORD_NOT_FOUND_CODE = 9003;

  /** Mensaje para dato no encontrado. */
  public static final String RECORD_NOT_FOUND_MESSAGE = "No se encontró el registro";

  /** Prefijo pata detalles. */
  public static final String PREFIX_DETAIL_MESSAGE = "Detail";

  /** Código de error para datos existentes. */
  public static final int DATA_EXIST_CODE = 9007;

  /** Código de error para datos no existentes */
  public static final int DATA_NOT_EXIST = 9008;

  /** Mensaje para usuario existente. */
  public static final String USER_EXIST = "El usuario ya esta registrado";

  /** Mensaje para usuario no encontrado. */
  public static final String USER_NOT_FOUND = "El usuario no esta registrado";

  /** Constructor privado. */
  private ErrorConstant() {}
}
