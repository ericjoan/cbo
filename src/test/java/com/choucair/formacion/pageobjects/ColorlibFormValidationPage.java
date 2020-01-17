package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormValidationPage extends PageObject {
	
		//Campo Required
		@FindBy(xpath="//*[@id='req']")
		public WebElementFacade txtRequired;
		//Campo Seleccion de deporte 1
		@FindBy(xpath="//*[@id='sport']")
		public WebElementFacade cmbSport1;
		//Campo Seleccion multiple de deporte 2
		@FindBy(xpath="//SELECT[@id='sport2']")
		public WebElementFacade cmbMultiple;
		//Campo Url
		@FindBy(xpath="//INPUT[@id='url1']")
		public WebElementFacade txtUrl;
		//Campo Email
		@FindBy(xpath="//INPUT[@id='email1']")
		public WebElementFacade txtEmail1;
		//Campo Password1
		@FindBy(xpath="//INPUT[@id='pass1']")
		public WebElementFacade txtPass1;
		//Campo Password2
		@FindBy(xpath="//INPUT[@id='pass2']")
		public WebElementFacade txtPass2;
		//Campo Minsize
		@FindBy(xpath="//INPUT[@id='minsize1']")
		public WebElementFacade txtMinsize1;
		//Campo Maxsize
		@FindBy(xpath="//INPUT[@id='maxsize1']")
		public WebElementFacade txtMaxsize;
		//Campo Number
		@FindBy(xpath="//INPUT[@id='number2']")
		public WebElementFacade txtNumber;
		//Campo IP
		@FindBy(xpath="//INPUT[@id='ip']")
		public WebElementFacade txtIp;
		//Campo Date
		@FindBy(xpath="//INPUT[@id='date3']")
		public WebElementFacade txtDate;
		//Campo Date Earlier
		@FindBy(xpath="//INPUT[@id='past']")
		public WebElementFacade txtDateEarlier;
		//Campo validation
		@FindBy(xpath="(//INPUT[@type='submit'])[1]")
		public WebElementFacade btnValidate;	
		//Globo Informativo
		@FindBy(xpath="(//DIV[@class='formErrorContent'])[1]")
		public WebElementFacade globoInformativo;	
		
		
		public void Required(String datoPrueba) {
			txtRequired.click();
			txtRequired.clear();
			txtRequired.sendKeys(datoPrueba);
		}
		public void Select_Sport(String datoPrueba){
			cmbSport1.click();
			cmbSport1.selectByVisibleText(datoPrueba);			
		}
		public void Multiple_Select(String datoprueba) {
			cmbMultiple.click();
			cmbMultiple.selectByVisibleText(datoprueba);
						
		}
		public void url(String datoPrueba) {
			txtUrl.click();
			txtUrl.clear();
			txtUrl.sendKeys(datoPrueba);
		}
		public void email(String datoPrueba) {
			txtEmail1.click();
			txtEmail1.clear();
			txtEmail1.sendKeys(datoPrueba);
		}
		public void password(String datoPrueba) {
			txtPass1.click();
			txtPass1.clear();
			txtPass1.sendKeys(datoPrueba);
		}
		public void confirm_password(String datoPrueba) {
			txtPass2.click();
			txtPass2.clear();
			txtPass2.sendKeys(datoPrueba);
		}
		public void minimun_field_size(String datoPrueba) {
			txtMinsize1.click();
			txtMinsize1.clear();
			txtMinsize1.sendKeys(datoPrueba);
		}
		public void maximun_field_size(String datoPrueba) {
			txtMaxsize.click();
			txtMaxsize.clear();
			txtMaxsize.sendKeys(datoPrueba);
		}
		public void number(String datoPrueba) {
			txtNumber.click();
			txtNumber.clear();
			txtNumber.sendKeys(datoPrueba);
		}
		public void ip(String datoPrueba) {
			txtIp.click();
			txtIp.clear();
			txtIp.sendKeys(datoPrueba);
		}
		public void date(String datoPrueba) {
			txtDate.click();
			txtDate.clear();
			txtDate.sendKeys(datoPrueba);
		}
		public void date_earlier(String datoPrueba) {
			txtDateEarlier.click();
			txtDateEarlier.clear();
			txtDateEarlier.sendKeys(datoPrueba);
		}
		public void validate() {
			btnValidate.click();
		}
		public void form_con_errores() {
			assertThat(globoInformativo.isCurrentlyVisible(), is(true));
		}
		public void form_sin_errores() {
			assertThat(globoInformativo.isCurrentlyVisible(), is(false));
		}
	
		
}
