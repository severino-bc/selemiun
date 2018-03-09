package robo;

import org.openqa.selenium.WebDriver;

public class Municipio {

        public static void MenuCadastroMunicipio(Selenium umMetodo, WebDriver driver) throws Exception
        {
                umMetodo.click(driver, "ic_auxiliares");
                umMetodo.click(driver, "ic_municipio");
                umMetodo.click(driver, "ic_municipio_inclusao");
        }
        
        public static void FormularioCadastroMunicipio(Selenium umMetodo, WebDriver driver) throws Exception 
        {
                umMetodo.type(driver, "frm_cod_municipio", "11");
                umMetodo.type(driver, "frm_cod_prodesp", "0011");
                umMetodo.type(driver, "frm_codigo_sinpas", "11");
                umMetodo.type(driver, "frm_nome_municipio", "teste");
                umMetodo.clicaPopUp(driver, "link_b745ff72", "bpu_busca_uf");
                umMetodo.type(driver, "frm_ocn_uf_sigla","SP");
                umMetodo.type(driver, "frm_ocn_uf_nome", "São Paulo");
                umMetodo.click(driver, "//div[@id='principal']/form/table[2]/tbody/tr/td/input");
     
                umMetodo.lupa(driver, "São Paulo");
                //umMetodo.confirma(driver);
        }
        
}
