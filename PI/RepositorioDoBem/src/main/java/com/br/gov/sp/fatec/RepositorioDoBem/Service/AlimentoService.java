package com.br.gov.sp.fatec.RepositorioDoBem.Service;

import com.br.gov.sp.fatec.RepositorioDoBem.Domain.Alimento;
import com.br.gov.sp.fatec.RepositorioDoBem.Repository.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentoService {

    @Autowired
    private AlimentoRepository alimentoRepository;

    public Alimento saveAlimento(Alimento alimento) {
        return alimentoRepository.save(alimento);
    }

    public Alimento getAlimento(String alimentoId) {
        return alimentoRepository.findById(alimentoId)
                .orElseThrow(() -> new RuntimeException("Alimento não encontrado com id: " + alimentoId));
    }

    public Alimento updateAlimento(Alimento alimento, String alimentoId) {
        alimento.setAlimentoId(alimentoId);
        return alimentoRepository.save(alimento);
    }
    
    public void deleteAlimento(String alimentoId) {
        alimentoRepository.deleteById(alimentoId);
    }

    public List<Alimento> getAllAlimentos(){
        return alimentoRepository.findAll();
    }
}
