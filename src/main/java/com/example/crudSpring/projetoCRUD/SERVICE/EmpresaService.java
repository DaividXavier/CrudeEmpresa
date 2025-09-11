package com.example.crudSpring.projetoCRUD.SERVICE;
import java.util.List;
import org.springframework.data.relational.core.conversion.SaveBatchingAggregateChange;
import org.springframework.stereotype.Service;
import com.example.crudSpring.projetoCRUD.ENTITY.Empresa;
import com.example.crudSpring.projetoCRUD.REPOSITORY.EmpresaRepository;
@Service
public class EmpresaService {
 
 private final EmpresaRepository empresaRepository;
    //4 operações
    //Selects, Inserts, Alter Table ou Delete

    //retorna todos os dados da empresa
    //(*) = Tudo da tabela
    //SELECT * FROM EMPRESA  (Select realiza listagem de dados)
    //Select (Quais dados deseja listar) ([From]onde executar a tabela) 

    // método construtor da classe EmpresaSeevice criando uma ligação com a classe Repository
    public EmpresaService(EmpresaRepository ligaçãoEmpresaRepository){
        empresaRepository = ligaçãoEmpresaRepository;
    }

       public List<Empresa> findAll(){
        return empresaRepository.findAll();
       }

       public Empresa cadastrarEmpresa(Empresa dadosEmpresa){
        return empresaRepository.save(dadosEmpresa); 
       }

       public void deletarEmpresa(Empresa dadosEmpresa){
        empresaRepository.delete(dadosEmpresa);
       }

}