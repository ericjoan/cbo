package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.PopupValidationSteps;
import com.choucair.formacion.steps.colorlibFormValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {
	
	@Steps
    PopupValidationSteps popupValidationSteps;
	@Steps
	colorlibFormValidationSteps colorlibFormValidationSteps;
	
	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String usuario, String clave) {
		popupValidationSteps.login_colorlib(usuario, clave);
	}

	@Given("^Ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation()  {
	    popupValidationSteps.ingresar_form_validation();
	}

	@When("^Diligencio Formulario Forms validation$")
	public void diligencio_Formulario_Form_validation(DataTable dtDatosForm)  {
		List<List<String>> data = dtDatosForm.raw();
		for(int i=1; i<data.size(); i++) {
			colorlibFormValidationSteps.diligenciar_popup_datos_tabla(data, i);
			try {
				Thread.sleep(5000);;
			}catch(InterruptedException e) {}
		}
		
	    for(int i=1; i<data.size(); i++) {
	    	colorlibFormValidationSteps.diligenciar_popup_datos_tabla(data, i);
	    }
	}

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() {
		colorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
	    
	}
	@Then("^Verificar que se presente Globo Informativo de validación$")
	public void verificar_que_se_presente_Globo_Informativo_de_validación() {
	   colorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();
	}



}
