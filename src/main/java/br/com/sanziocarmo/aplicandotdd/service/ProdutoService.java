package br.com.sanziocarmo.aplicandotdd.service;

import br.com.sanziocarmo.aplicandotdd.model.ProdutoModel;
import br.com.sanziocarmo.aplicandotdd.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public int calculoDediasDesdeACompra(Long id) {
        Optional<ProdutoModel> produtoModelOptional = produtoRepository.findById(id);
        return Period.between(produtoModelOptional.get().getDataCompra(),
                produtoModelOptional.get().getDataAtual()).getDays();
    }
}
