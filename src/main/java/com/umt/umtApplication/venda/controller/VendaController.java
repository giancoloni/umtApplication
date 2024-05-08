package com.umt.umtApplication.venda.controller;

import com.umt.umtApplication.venda.repository.dto.VendaDTO;
import com.umt.umtApplication.venda.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/venda")
public class VendaController{

    @Autowired
    private VendaService vendaService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public String save(@RequestBody VendaDTO vendaDTO){
        return vendaService.save(vendaDTO);
    }


}
