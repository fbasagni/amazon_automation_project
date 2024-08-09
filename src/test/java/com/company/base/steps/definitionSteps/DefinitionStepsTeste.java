package com.company.base.steps.definitionSteps;

import com.company.base.datamodel.DataContato;
import com.company.base.steps.serenity.TesteSteps;
import cucumber.api.java.pt.*;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class DefinitionStepsTeste {

    @Steps
    TesteSteps testeSteps;

    @Dado("^que acesso o site$")
    public void queAcessoOSite() {
        testeSteps.queAcessoOSite();
    }

    @E("^clico em ofertas do dia$")
    public void clicoOfertasDia() {
        testeSteps.clicoOfertasDia();
    }


    @E("^clico em comprar agora$")
    public void clicoComprarAgora() {testeSteps.clicoComprarAgora();

    }

    @E("^fecho o pedido$")
    public void clicoFecharPedido() {testeSteps.clicoFecharPedido();

    }

    @E("^seleciono o produto$")
    public void selecionarProduto() {
        testeSteps.selecionarProduto();
    }


    @E("^seleciono o produto da categoria$")
    public void selecionarProdutoCategoria() {
        testeSteps.selecionarProdutoCategoria();
    }

    @Então("^adiciono ao carrinho$")
    public void adicionarCarrinho() {
        testeSteps.adicionarCarrinho();
    }

    @Então("^verifico dados da pagina$")
    public void verificoDadosPagina() {
        testeSteps.verificoDadosPagina();
    }

    @E("^clico em categorias$")
    public void clicoEmCategorias() {
        testeSteps.clicoEmCategorias();
    }


    @E("^preencho os dados$")
    public void preenchoDados(List<DataContato> dataContato) throws Exception {
        testeSteps.preenchoDados(dataContato);
    }

    @Entao("^o login ficara invalido$")
    public void loginInvalido() {
        testeSteps.loginInvalido();
    }

}
