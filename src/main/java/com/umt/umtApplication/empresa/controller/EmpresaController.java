//package com.umt.umtApplication.empresa.controller;
//
//import com.umt.umtApplication.empresa.repository.dto.EmpresaDTO;
//import com.umt.umtApplication.empresa.repository.entities.EmpresaEntity;
//import com.umt.umtApplication.empresa.service.EmpresaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/empresa")
//public class EmpresaController {
//
//    @Autowired
//    private EmpresaService empresaService;
//
//    @PostMapping("/save")
//    @ResponseStatus(HttpStatus.OK)
//    public String save(@RequestBody EmpresaDTO empresaDTO){
//        return empresaService.save(empresaDTO);
//    }
//
//    @GetMapping("/list")
//    public String list(){
//        //return empresaService.list();
//        return "Listando empresas...";
//    }
//
//
//}
