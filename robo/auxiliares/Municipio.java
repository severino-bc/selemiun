package robo.auxiliares;

import org.openqa.selenium.WebDriver;

import robo.Selenium;

public class Municipio {

	public static void MenuCadastroMunicipio(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.ChamaCaminho(umMetodo, driver, "ic_auxiliares", "ic_municipio", "ic_municipio_inclusao");
	}
	
	public static void MenuAlteraMunicipio(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.ChamaCaminho(umMetodo, driver, "ic_auxiliares", "ic_municipio", "ic_municipio_alteracao");
	}
	
	public static void MenuExclusaoMunicipio(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.ChamaCaminho(umMetodo, driver, "ic_auxiliares", "ic_municipio", "ic_municipio_exclusao");
	}
	
	public static void MenuConsultaMunicipio(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.ChamaCaminho(umMetodo, driver, "ic_auxiliares", "ic_municipio", "ic_municipio_consulta");
	}

	public static void FormularioCadastroMunicipio(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.type(driver, "frm_cod_municipio", "11");
		umMetodo.type(driver, "frm_cod_prodesp", "0011");
		umMetodo.type(driver, "frm_codigo_sinpas", "11");
		umMetodo.type(driver, "frm_nome_municipio", "teste");
		umMetodo.clicaPopUp(driver, "link_b745ff72");

		umMetodo.type(driver, "frm_ocn_uf_sigla", "SP");
		umMetodo.type(driver, "frm_ocn_uf_nome", "São Paulo");
		umMetodo.click(driver, "//div[@id='principal']/form/table[2]/tbody/tr/td/input");
		umMetodo.lupa(driver, "SP");
		// umMetodo.confirma(driver);
	}
	
	public static void FormularioAlteraMunicipio(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.type(driver, "nome_municipio", "Abaiara");
		umMetodo.type(driver, "codigo_municipio", "2300101");
		umMetodo.click(driver, "link_d7d7347e");
		umMetodo.type(driver, "frm_cod_municipio", "");
		umMetodo.type(driver,"frm_cod_prodesp","");
		umMetodo.type(driver,"frm_codigo_sinpas","");
		umMetodo.type(driver,"frm_nome_municipio","");
		umMetodo.click(driver, "link_b745ff72");
		
		//umMetodo.confirma(driver);
	}
	
	

}
