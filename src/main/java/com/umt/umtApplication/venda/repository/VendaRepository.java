package com.umt.umtApplication.venda.repository;

import com.umt.umtApplication.venda.repository.entities.VendaEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends CrudRepository<VendaEntity, Integer>, JpaSpecificationExecutor<VendaEntity>{

}
