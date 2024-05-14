package com.umt.umtApplication.moldura.repository;

import com.umt.umtApplication.moldura.repository.entities.MolduraEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MolduraRepository extends CrudRepository<MolduraEntity, Integer>, JpaSpecificationExecutor<MolduraEntity> {
}
