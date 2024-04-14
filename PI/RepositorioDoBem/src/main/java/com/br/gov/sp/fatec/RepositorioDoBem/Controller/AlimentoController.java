package com.br.gov.sp.fatec.RepositorioDoBem.Controller;

import com.br.gov.sp.fatec.RepositorioDoBem.Domain.Alimento;
import com.br.gov.sp.fatec.RepositorioDoBem.Service.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlimentoController {

    @Autowired
    private AlimentoService alimentoService;

    @PostMapping("/saveAlimento")
    public Alimento saveAlimento(@RequestBody Alimento alimento) {
        return alimentoService.saveAlimento(alimento);
    }

    @GetMapping("/getAlimento/{alimentoId}")
    public Alimento getAlimento(@PathVariable String alimentoId) {
            return alimentoService.getAlimento(alimentoId);
    }

    @PutMapping("/updateAlimento/{alimentoId}")
    public Alimento updateAlimento(@RequestBody Alimento alimento, @PathVariable String alimentoId) {
        return alimentoService.updateAlimento(alimento, alimentoId);
    }

    @DeleteMapping("/deleteAlimento/{alimentoId}")
    public String deleteAlimento(@PathVariable String alimentoId){
        alimentoService.deleteAlimento(alimentoId);
        return "Alimento Deletado com sucesso";
    }

    @GetMapping("/getAllAlimentos")
    public List<Alimento> getAllAlimentos(){
        return alimentoService.getAllAlimentos();
    }



}