package com.umt.umtApplication.empresa.service.impl;

import com.umt.umtApplication.empresa.repository.EmpresaRepository;
import com.umt.umtApplication.empresa.repository.dto.EmpresaDTO;
import com.umt.umtApplication.empresa.repository.entities.EmpresaEntity;
import com.umt.umtApplication.empresa.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    private final EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaServiceImpl(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @Override
    public String save(EmpresaDTO empresaDTO){

        var empresa = new EmpresaEntity(empresaDTO.getNome(), empresaDTO.getInstagram());

        try{
            empresaRepository.save(empresa);
            return "Empresa salva com sucesso!";

        }catch (Exception e){
            return "Erro ao salvar empresa!";
        }

    }

    @Override
    public String list(){
        return "Listando empresas...";
    }

}
