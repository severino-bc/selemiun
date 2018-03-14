package robo.auxiliares;

import org.openqa.selenium.WebDriver;

import robo.Selenium;

public class CrudNaTurezaCodigoReduzido {

	public static void ExecutaNaturezaCodigoReduzido(Selenium umMetodo, WebDriver driver) throws Exception{
		
		NaturezaCodigoReduzido.MenuCadastroNaturezaCodigoReduzido(umMetodo, driver);
		NaturezaCodigoReduzido.formularioCadastroNaturezaCodigoReduzido(umMetodo, driver);
		/*NaturezaCodigoReduzido.MenuAlteraNaturezaCodigoReduzido(umMetodo, driver);
		NaturezaCodigoReduzido.FormularioAlteraNaturezaCodigoReduzido(umMetodo, driver);
		NaturezaCodigoReduzido.MenuExlusaoNaturezaCodigoReduzido(umMetodo, driver);
		NaturezaCodigoReduzido.FormularioExclusaoNaturezaCodigoReduzido(umMetodo, driver);
		//NaturezaCodigoReduzido.MenuConsultaNaturezaCodigoReduzido(umMetodo, driver);
*/
	
		
		
		

	
}
}