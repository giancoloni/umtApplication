package com.umt.umtApplication.impressao.repository;

import com.umt.umtApplication.impressao.repository.entities.ImpressaoEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpressaoRepository extends CrudRepository<ImpressaoEntity, Integer>, JpaSpecificationExecutor<ImpressaoEntity> {
}
