package br.com.sanziocarmo.aplicandotdd.repository;

import br.com.sanziocarmo.aplicandotdd.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long>{

    @Override
    Optional<ProdutoModel> findById(Long aLong);
}
