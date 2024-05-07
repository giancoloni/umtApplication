package com.umt.umtApplication.empresa.repository;

import com.umt.umtApplication.empresa.repository.entities.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends CrudRepository<EmpresaEntity, Integer>, JpaSpecificationExecutor<EmpresaEntity> {

    //EmpresaEntity findById_empresa(Integer id_empresa);


}
