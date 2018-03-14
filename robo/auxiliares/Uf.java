package robo.auxiliares;

import org.openqa.selenium.WebDriver;
import robo.Selenium;

public class Uf {
	
	public static void MenuCadastroUF(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.ChamaCaminho(umMetodo, driver, "ic_auxiliares", "ic_uf", "ic_uf_inclusao");
	}

	public static void MenuAlteraUF(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.ChamaCaminho(umMetodo, driver, "ic_auxiliares", "ic_uf", "ic_uf_alteracao");
	}

	public static void MenuExclusaoUF(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.ChamaCaminho(umMetodo, driver, "ic_auxiliares", "ic_uf", "ic_uf_exclusao");
	}
	
	public static void MenuConsultaUF(Selenium umMetodo, WebDriver driver) throws Exception	{
		umMetodo.ChamaCaminho(umMetodo, driver, "ic_auxiliares", "ic_uf", "ic_uf_consulta");
	}

	public static void FormularioCadastroUf(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.type(driver, "frm_codigo_ibge", "00");
		umMetodo.type(driver, "frm_uf_sigla", "SP");
		umMetodo.type(driver, "frm_uf_nome", "São Paulo");
		// umMetodo.confirma(driver);
	}
	
	public static void FormularioAlteraUF(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.type(driver, "sigla", "SP");
		umMetodo.type(driver, "nome", "São Paulo");
		umMetodo.clicaPopUp(driver, "link_6672ec62");
		umMetodo.click(driver, "//div[@id='caixa_externa']/div[2]");
		umMetodo.click(driver, "link_4784163b");
		umMetodo.type(driver, "frm_codigo_ibge", "99");
		umMetodo.type(driver, "frm_uf_sigla", "XX");
		umMetodo.type(driver, "frm_uf_nome", "TESTE");
		// umMetodo.confirma(driver);
	}
	
	public static void FormularioExclusaoUF(Selenium umMetodo, WebDriver driver) throws Exception {
		umMetodo.type(driver, "sigla", "MG");
		umMetodo.type(driver, "nome", "Minas Gerais");
		umMetodo.click(driver, "link_6672ec62");
		umMetodo.click(driver, "link_6865cebf");
		// umMetodo.confirma(driver);
	}
	
	public static void FormularioConsultaUF (Selenium umMetodo, WebDriver driver) throws Exception
	{
		umMetodo.type(driver, "sigla", "MG");
		umMetodo.type(driver, "nome", "Minas Gerais");
		umMetodo.click(driver, "link_6672ec62");
		umMetodo.click(driver, "link_7f16bd70");
		// umMetodo.confirma(driver);
	}

}