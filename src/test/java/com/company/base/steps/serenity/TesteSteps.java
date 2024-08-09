package com.company.base.steps.serenity;

import com.company.base.datamodel.DataContato;
import com.company.base.pages.PageAmazon;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class TesteSteps {

    PageAmazon pageAmazon;

    @Step
    public void queAcessoOSite() {
        pageAmazon.queAcessoOSite();
    }

    @Step
    public void clicoOfertasDia() {
        pageAmazon.clicoOfertasDia();
    }

    @Step
    public void clicoComprarAgora() {
        pageAmazon.clicoComprarAgora();
    }


    @Step
    public void clicoFecharPedido() {
        pageAmazon.clicoFecharPedido();
    }


    @Step
    public void selecionarProduto() {
        pageAmazon.selecionarProduto();
    }

    @Step
    public void selecionarProdutoCategoria() {
        pageAmazon.selecionarProdutoCategoria();
    }


    @Step
    public void adicionarCarrinho() {
        pageAmazon.adicionarCarrinho();
    }

    @Step
    public void verificoDadosPagina() {
        pageAmazon.verificoDadosPagina();
    }


    @Step
    public void clicoEmCategorias() {
        pageAmazon.clicoEmCategorias();
    }

    @Step
    public void preenchoDados(List<DataContato> dataContato) {
        pageAmazon.preenchoDados(dataContato);
    }


    @Step
    public void loginInvalido() {
        pageAmazon.loginInvalido();
    }
}
