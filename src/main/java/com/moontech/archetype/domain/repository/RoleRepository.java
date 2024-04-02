package com.moontech.archetype.domain.repository;

import com.moontech.archetype.domain.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para los perfiles.
 *
 * @author Felipe Monzón
 * @enterprise moontech
 * @since Mar 25., 2024
 */
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {}
