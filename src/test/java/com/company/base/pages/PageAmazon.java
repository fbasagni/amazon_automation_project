package com.company.base.pages;

import com.company.base.datamodel.DataContato;
import com.company.base.util.DataHelper;
import com.company.base.util.DateHelper;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import java.util.List;
import static junit.framework.TestCase.assertEquals;

public class PageAmazon extends BasePage {

    @FindBy(xpath = "(//a[contains(@data-csa-c-type,'link')])[3]")
    private WebElementFacade btnOfertasDia;

    @FindBy(xpath = "//*[@id=\"buy-now-button\"]")
    private WebElementFacade btnComprarAgora;

    @FindBy(xpath = "//input[@value='Proceed to checkout']")
    private WebElementFacade btnFecharPedido;

    @FindBy(xpath = "//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div/div/div/div[1]")
    private WebElementFacade btnProdutoOferta;

    @FindBy(xpath = "//*[@id=\"anonCarousel1\"]/ol/li[1]/div/div[2]")
    private WebElementFacade btnProdutoCategoria;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElementFacade btnAddCarrinho;

    @FindBy(xpath = "//input[@aria-labelledby='attachSiNoCoverage-announce']")
    private WebElementFacade btnCarrinhoSemSeguro;

    @FindBy(xpath = "//i[contains(@class,'hm-icon nav-sprite')]")
    private WebElementFacade btnMenuCategorias;

    @FindBy(xpath = "(//a[contains(@class,'hmenu-item')])[2]")
    private WebElementFacade btnMenuSubCategorias;

    @FindBy(xpath = "//a[@href='/gp/browse.html?node=17877530011&ref_=nav_em__karlall_0_2_5_2'][contains(.,'Baixe o aplicativo Kindle')]")
    private WebElementFacade btnRedirectProduto;

    @FindBy(xpath = "//input[@placeholder='Digite seu nome']")
    private WebElementFacade txtNome;

    @FindBy(xpath = "//input[@type='email']")
    private WebElementFacade txtEmail;

    @FindBy(xpath = "//input[contains(@id,'continue')]")
    private WebElementFacade btnContinuar;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElementFacade btnLogin;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElementFacade txtSenha;


    public void queAcessoOSite() {
        getDriver().get("https://www.amazon.com.br/");
        DateHelper.waitThread(5000);
    }

    public void clicoOfertasDia() {
        btnOfertasDia.click();
        DateHelper.waitThread(5000);
    }

    public void clicoComprarAgora() {
        btnComprarAgora.click();
        DateHelper.waitThread(5000);
    }


    public void clicoFecharPedido() {
        btnFecharPedido.click();
        DateHelper.waitThread(5000);
    }


    public void selecionarProduto() {
        btnProdutoOferta.click();
        DateHelper.waitThread(5000);
    }

    public void selecionarProdutoCategoria() {
        btnProdutoCategoria.click();
        DateHelper.waitThread(5000);
    }


    public void adicionarCarrinho() {
        btnAddCarrinho.click();
        DateHelper.waitThread(2000);
        btnCarrinhoSemSeguro.click();
        DateHelper.waitThread(1000);
    }

    public void verificoDadosPagina() {
        String Adicionadoaocarrinho = getDriver().findElement(By.xpath("//h1[contains(@class,'a-size-medium-plus a-color-base sw-atc-text a-text-bold')]")).getText();
        DateHelper.waitThread(1000);
        assertEquals("Adicionado ao carrinho", Adicionadoaocarrinho);
        DateHelper.waitThread(1000);
    }

    public void clicoEmCategorias() {
        DateHelper.waitThread(500);
        btnMenuCategorias.click();
        DateHelper.waitThread(500);
        btnMenuSubCategorias.click();
        DateHelper.waitThread(500);
    }

    public void preenchoDados(List<DataContato> dataContato) {
        DateHelper.waitThread(500);
        txtEmail.click();
        txtEmail.sendKeys(DataHelper.getData(dataContato).getEmail());
        DateHelper.waitThread(200);
        btnContinuar.click();
        DateHelper.waitThread(200);

        DateHelper.waitThread(500);
        txtSenha.click();
        txtSenha.sendKeys(DataHelper.getData(dataContato).getSenha());
        DateHelper.waitThread(200);
        btnLogin.click();
        DateHelper.waitThread(200);
    }

    public void loginInvalido() {
        String MensagemEnviada = getDriver().findElement(By.xpath("//span[@class='a-list-item'][contains(.,'Sua senha está incorreta')]")).getText();
        assertEquals("Sua senha está incorreta", MensagemEnviada);
        DateHelper.waitThread(200);

    }


}
