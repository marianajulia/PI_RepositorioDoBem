package com.br.gov.sp.fatec.RepositorioDoBem.Repository;

import com.br.gov.sp.fatec.RepositorioDoBem.Domain.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
