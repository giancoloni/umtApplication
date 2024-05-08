package com.umt.umtApplication.venda.service.impl;

import com.umt.umtApplication.venda.repository.VendaRepository;
import com.umt.umtApplication.venda.repository.dto.VendaDTO;
import com.umt.umtApplication.venda.repository.entities.VendaEntity;
import com.umt.umtApplication.venda.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaServiceImpl implements VendaService {

    private final VendaRepository vendaRepository;

    @Autowired
    public VendaServiceImpl(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    @Override
    public String save(VendaDTO vendaDTO){

        var venda = new VendaEntity(vendaDTO);

        try{
            vendaRepository.save(venda);
            return "Venda salva com sucesso!";

        }catch (Exception e){
            return "Erro ao salvar venda!";
        }

    }
}
