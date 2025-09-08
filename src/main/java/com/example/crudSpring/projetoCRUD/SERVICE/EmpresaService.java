package com.example.crudSpring.projetoCRUD.SERVICE;
 
import org.springframework.stereotype.Service;
 
import com.example.crudSpring.projetoCRUD.REPOSITORY.EmpresaRepository;
 
@Service
public class EmpresaService {
 
 private final EmpresaRepository empresaRepository;

    // método construtor da classe EmpresaSeevice criando uma ligação com a classe Repository
    public EmpresaService(EmpresaRepository ligaçãoEmpresaRepository){
        empresaRepository = ligaçãoEmpresaRepository;
    }
 
    
}
 
