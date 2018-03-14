package robo.auxiliares;

import org.openqa.selenium.WebDriver;

import robo.Selenium;

public class Bairro {

	public static void MenuCadastroBairro(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.click(driver, "ic_auxiliares");
		umMetodo.click(driver, "ic_bairro");
		umMetodo.click(driver, "ic_bairro_inclusao");

	}

	public static void FormularioCadastroBairro(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.type(driver, "frm_nome_bairro", "MARIA");
		umMetodo.clicaPopUp(driver, "link_eea4c06b");
		umMetodo.type(driver, "frm_ocn_municipio_nome", "São Paulo");
		umMetodo.click(driver, "//div[@id='principal']/form/table[2]/tbody/tr/td/input");
		umMetodo.lupa(driver, "São Paulo");
		// umMetodo.confirma(driver);
	}
}
