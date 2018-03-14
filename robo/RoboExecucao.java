package robo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import robo.auxiliares.CrudNaTurezaCodigoReduzido;
import robo.auxiliares.Municipio;
import robo.auxiliares.NaturezaCodigoReduzido;
import robo.auxiliares.Uf;

public class RoboExecucao {
	static WebDriver driver;
	static Selenium umMetodo;

	@Test
	public static void main(String[] args) throws Throwable {
		umMetodo = new Selenium();
		driver = new FirefoxDriver();
		// driver = new ChromeDriver();
		String endereco = "http://branch.moises.conam.com.br";
		String modulo = "MDA - Módulo de Dívida Ativa";
		String usuario = "conam";
		String senha = "123";

		umMetodo.setUp(endereco, driver);
		umMetodo.maximiza(driver);
		umMetodo.login(driver, usuario, senha, modulo);
		CrudNaTurezaCodigoReduzido.ExecutaNaturezaCodigoReduzido(umMetodo, driver);
		ZeraBanco.execute();
	}
}
