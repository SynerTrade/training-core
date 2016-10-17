package com.synertrade.training.core.common.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Custom specific extension of {@link org.springframework.data.jpa.repository.JpaRepository}
 * 
 * @author marianab
 *
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

	/**
	 * Finds an object by String UUID without dashes
	 * 
	 */
	public T findByExternalUUID(String externalUUIDWithoutDashes);

	public ID getIdByExternalUUID(String externalUUIDWithoutDashes);

	public int deleteByExternalUUID(String externalUUIDWithoutDashes);
}
