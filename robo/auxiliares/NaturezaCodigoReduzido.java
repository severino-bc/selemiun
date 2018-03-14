package robo.auxiliares;


import org.openqa.selenium.WebDriver;

import robo.Selenium;

public class NaturezaCodigoReduzido {
	
	public static void MenuCadastroNaturezaCodigoReduzido(Selenium umMetodo, WebDriver driver){
		umMetodo.click(driver, "ic_auxiliares");
		umMetodo.click(driver, "mda_natureza_codigo_reduzido");
		umMetodo.click(driver, "mda_natureza_codigo_reduzido_inclusao");
	}
	public static void MenuAlteraNaturezaCodigoReduzido(Selenium umMetodo, WebDriver driver){
		umMetodo.click(driver, "ic_auxiliares");
		umMetodo.click(driver, "mda_natureza_codigo_reduzido");
		umMetodo.click(driver, "mda_natureza_codigo_reduzido_alteracao");
	}
	public static void MenuExlusaoNaturezaCodigoReduzido(Selenium umMetodo, WebDriver driver){
		umMetodo.click(driver, "ic_auxiliares");
		umMetodo.click(driver, "mda_natureza_codigo_reduzido");
		umMetodo.click(driver, "mda_natureza_codigo_reduzido_exclusao");
	}
	public static void MenuConsultaNaturezaCodigoReduzido(Selenium umMetodo, WebDriver driver){
		umMetodo.click(driver, "ic_auxiliares");
		umMetodo.click(driver, "mda_natureza_codigo_reduzido");
		umMetodo.click(driver, "mda_natureza_codigo_reduzido_consulta");
	}
	
	
	public static void formularioCadastroNaturezaCodigoReduzido(Selenium umMetodo, WebDriver driver) throws Exception{
		umMetodo.clicaPopUp(driver, "//div[@id='principal']/table/tbody/tr/td/form/table/tbody/tr[2]/td/span/img");
		umMetodo.type(driver, "frm_ocn_natureza_credito_codigo", "AE");
		umMetodo.type(driver, "frm_ocn_natureza_credito_nome", "SERVIÇOS DE SANEAMENTO");
		umMetodo.click(driver, "//div[@id='principal']/form/table[2]/tbody/tr/td/input");
		umMetodo.lupa(driver,  "AE");
		umMetodo.type(driver, "frm_codigo_reduzido", "11");
	}
	
	public static void FormularioAlteraNaturezaCodigoReduzido(Selenium umMetodo, WebDriver driver) throws Exception{
		umMetodo.clicaPopUp(driver, "//div[@id='principal']/table/tbody/tr/td/form/table/tbody/tr[2]/td/span/img");
		umMetodo.type(driver, "frm_ocn_natureza_credito_codigo", "AE");
		umMetodo.type(driver, "frm_ocn_natureza_credito_nome", "SERVIÇOS DE SANEAMENTO");
		umMetodo.clicaPopUp(driver, "//div[@id='principal']/form/table[2]/tbody/tr/td/input");
		umMetodo.lupa(driver, "AE");
		umMetodo.type(driver, "frm_codigo_reduzido", "11");
		umMetodo.click(driver, "//div[@id='principal']/table/tbody/tr/td/form/table/tbody/tr[5]/td/input");
		umMetodo.click(driver, "//div[@id='_ingrid_data_grid_natureza_codigo_reduzido_0']/div/table/tbody/tr/td/div/a/img");
		
		umMetodo.type(driver, "frm_codigo_reduzido", "12");
	
	}
	
	public static void FormularioExclusaoNaturezaCodigoReduzido(Selenium umMetodo, WebDriver driver) throws Exception{
		umMetodo.clicaPopUp(driver, "//div[@id='principal']/table/tbody/tr/td/form/table/tbody/tr[2]/td/span/img");
		umMetodo.type(driver, "frm_ocn_natureza_credito_codigo", "AE");
		umMetodo.type(driver, "frm_ocn_natureza_credito_nome", "SERVIÇOS DE SANEAMENTO");
		umMetodo.clicaPopUp(driver, "//div[@id='principal']/form/table[2]/tbody/tr/td/input");
		umMetodo.lupa(driver, "AE");
		umMetodo.type(driver, "frm_codigo_reduzido", "11");
		umMetodo.click(driver, "//div[@id='principal']/table/tbody/tr/td/form/table/tbody/tr[5]/td/input");
		umMetodo.click(driver, "//div[@id='_ingrid_data_grid_natureza_codigo_reduzido_0']/div/table/tbody/tr/td/div/a/img");
		umMetodo.comparaValue(driver, "frm_ocn_natureza_credito_nome", "SERVIÇOS DE SANEAMENTO");
		umMetodo.type(driver, "frm_codigo_reduzido", "12");
	
	
	}
}
