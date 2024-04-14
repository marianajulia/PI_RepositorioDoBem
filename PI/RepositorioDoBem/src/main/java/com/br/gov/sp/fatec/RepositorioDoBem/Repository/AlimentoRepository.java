package com.br.gov.sp.fatec.RepositorioDoBem.Repository;

import com.br.gov.sp.fatec.RepositorioDoBem.Domain.Alimento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlimentoRepository extends MongoRepository<Alimento, String> {
}
