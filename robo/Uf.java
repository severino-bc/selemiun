package robo;

import org.openqa.selenium.WebDriver;

public class Uf {

    public static void MenuCadastroUF(Selenium umMetodo, WebDriver driver) throws Exception
    {
           	umMetodo.click(driver, "ic_auxiliares");
            umMetodo.click(driver, "ic_uf");
            umMetodo.click(driver, "ic_uf_inclusao");
    }

    public static void FormularioCadastroUf(Selenium umMetodo, WebDriver driver) throws Exception
    {
            umMetodo.type(driver, "frm_codigo_ibge", "00");
            umMetodo.type(driver, "//input[@id='frm_uf_sigla']", "SP");
            umMetodo.type(driver, "frm_uf_nome", "São Paulo");
           // umMetodo.confirma(driver);
    }

}