package com.umt.umtApplication.empresa.service;

import com.umt.umtApplication.empresa.repository.dto.EmpresaDTO;
import com.umt.umtApplication.empresa.repository.entities.EmpresaEntity;

public interface EmpresaService {
    String save(EmpresaDTO empresaDTO);
    String list();
}
