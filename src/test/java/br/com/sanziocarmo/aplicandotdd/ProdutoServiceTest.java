package br.com.sanziocarmo.aplicandotdd;

import br.com.sanziocarmo.aplicandotdd.model.ProdutoModel;
import br.com.sanziocarmo.aplicandotdd.repository.ProdutoRepository;
import br.com.sanziocarmo.aplicandotdd.service.ProdutoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Optional;

@RunWith(SpringRunner.class)
public class ProdutoServiceTest {

    @TestConfiguration
    static class produtoServiceTestConfiguration {

        @Bean
        public ProdutoService produtoService() {
            return new ProdutoService();
        }

    }

    @Autowired
    ProdutoService produtoService;

    @MockBean
    ProdutoRepository produtoRepository;

    @Test
    public void produtoServiceTest_calculoDediasDesdeACompra() {
        Long id = 1L;

        int diasDesdeACompra = produtoService.calculoDediasDesdeACompra(id);

        Assertions.assertEquals(diasDesdeACompra, 10);
    }

    @Before
    public void Setup(){
        LocalDate dataCompra = LocalDate.parse("2022-02-15");
        LocalDate dataAtual = LocalDate.parse("2022-02-25");

        ProdutoModel produtoModel = new ProdutoModel(1L, "Tomate Andrea", "Tomate Italiano", dataCompra, dataAtual, 10);

        Mockito.when(produtoRepository.findById(produtoModel.getId())).thenReturn(Optional.of(produtoModel));
    }

}
