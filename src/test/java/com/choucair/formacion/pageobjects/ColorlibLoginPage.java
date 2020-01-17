package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject {
		// Campo usuario
		@FindBy(xpath="//*[@id='login']/form/input[1]")
		public WebElementFacade txtUsername;
		// Campo password
		@FindBy(xpath="//*[@id='login']/form/input[2]")
		public WebElementFacade txtPassword;
		//Boton
		@FindBy(xpath="//*[@id='login']/form/button")
		public WebElementFacade btnSignIn;
		//label del home a verificar
		@FindBy(xpath="//*[@id='bootstrap-admin-template']")
		public WebElementFacade lblHomePpal;
		
		public void IngresarDatos(String strUsuario, String strPass){
			txtUsername.sendKeys(strUsuario);
			txtPassword.sendKeys(strPass);
			btnSignIn.click();
						
		}
		
		public void VerificaHome(){
			String labelv = "Bootstrap-Admin-Template";
			String strMensaje = lblHomePpal.getText();
			assertThat(strMensaje, containsString(labelv));
			
		}
}
