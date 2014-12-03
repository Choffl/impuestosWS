package edu.udima.es.integrasaas.servicios.soap.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import edu.udima.es.integrasaas.servicios.soap.ImpuestosServicio;

@WebService(name="ImpuestosServicio",
			targetNamespace="http://edu.udima.es/servicios",
			serviceName="Impuestos")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public class ImpuestosServiciosSOAP implements ImpuestosServicio{
	
	private static Float IVA = 21F;

	@Override
	@WebMethod(operationName="aplicarIVA")
	public Float calcularIVA(@WebParam(name="precioSinIVA")Float cantidad) {
		cantidad += (cantidad*IVA.floatValue())/100;
		return cantidad;
	}

}
