package com.moontech.archetype.domain.entity;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Entidad auditora.
 *
 * @author Felipe Monzón
 * @enterprise moontech
 * @since Mae 30., 2024
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditableEntity implements Serializable {
  /** serial. */
  @Serial private static final long serialVersionUID = -7937775898702198567L;

  /** Usuario que crea el registro. */
  @CreatedBy
  @Column(name = "created_user", updatable = false, nullable = false)
  protected String createdBy;

  /** Fecha de creación. */
  @CreatedDate
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_date", updatable = false, nullable = false)
  protected Date createdDate;

  /** Usuario que modifica el registro. */
  @LastModifiedBy
  @Column(name = "last_modified_user", nullable = false)
  protected String lastModifiedBy;

  /** Fecha que modifica. */
  @LastModifiedDate
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "last_modified_date", nullable = false)
  protected Date lastModifiedDate;
}
