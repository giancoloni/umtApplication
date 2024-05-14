package com.umt.umtApplication.endereco.repository;

import com.umt.umtApplication.endereco.repository.entities.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncerecoRepository extends CrudRepository<EnderecoEntity, Integer>, JpaSpecificationExecutor<EnderecoEntity> {
}
