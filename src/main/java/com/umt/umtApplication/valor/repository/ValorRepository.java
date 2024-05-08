package com.umt.umtApplication.valor.repository;

import com.umt.umtApplication.valor.repository.entities.ValorEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValorRepository extends CrudRepository<ValorEntity, Integer>, JpaSpecificationExecutor<ValorRepository> {
}
