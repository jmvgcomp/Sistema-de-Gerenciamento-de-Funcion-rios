package dev.jmvg.dao;

import dev.jmvg.model.Funcionario;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {
    @Override
    public List<Funcionario> findByNome(String nome) {
        /*TypedQuery<Funcionario> query = getEntityManager()
                .createQuery("select f from Funcionario f where f.nome like :nome", Funcionario.class);
        query.setParameter("nome", nome);
        return query.getResultList();
         */
        return createQuery("select f from Funcionario f where f.nome like concat('%',?1,'%') ", nome);
    }

    @Override
    public List<Funcionario> findByCargoId(Long id) {
        return createQuery("select f from Funcionario f where f.cargo.id = ?1", id);
    }
}
