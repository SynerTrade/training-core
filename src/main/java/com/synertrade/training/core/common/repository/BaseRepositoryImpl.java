package com.synertrade.training.core.common.repository;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * Custom repository base class
 * 
 * @author marianab
 */
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {

	private EntityManager	entityManager;

	public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.entityManager = entityManager;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T findByExternalUUID(String externalUUIDWithoutDashes) {
		UUID uuid = getUUIDfromStringWithoutDashes(externalUUIDWithoutDashes);

		return (T)entityManager.createQuery("select obj from " + getDomainClass().getName() + " obj where obj.externalUUID = :uuid").setParameter("uuid", uuid).getSingleResult();
	}

	@Override
	public int deleteByExternalUUID(String externalUUIDWithoutDashes) {
		UUID uuid = getUUIDfromStringWithoutDashes(externalUUIDWithoutDashes);

		return entityManager.createQuery("delete from " + getDomainClass().getName() + " obj where obj.externalUUID = :uuid").setParameter("uuid", uuid).executeUpdate();
	}

	@Override
	public ID getIdByExternalUUID(String externalUUIDWithoutDashes) {
		@SuppressWarnings("unchecked")
		ID id = (ID)entityManager.createQuery("select obj.id from " + getDomainClass().getName() + " obj where obj.externalUUID = :uuid")
				.setParameter("uuid", getUUIDfromStringWithoutDashes(externalUUIDWithoutDashes)).getSingleResult();
		return id;
	}

	private UUID getUUIDfromStringWithoutDashes(String externalUUIDWithoutDashes) {
		String externalUUIDWithDashes = externalUUIDWithoutDashes.replaceFirst("([0-9a-fA-F]{8})([0-9a-fA-F]{4})([0-9a-fA-F]{4})([0-9a-fA-F]{4})([0-9a-fA-F]+)", "$1-$2-$3-$4-$5");
		return UUID.fromString(externalUUIDWithDashes);
	}

}
