package edu.udima.es.integrasaas.servicios.soap;

/**
 * Servicio que calcula el precio con IVA de una cantidad pasada
 * como parametro
 * @author Sofia Sabariego
 */
public interface ImpuestosServicio {
	
	
	/**
	 * @param cantidad decimal que representa el precio sin IVA
	 * @return devuelve el precio con IVA
	 */
	public Float calcularIVA(Float cantidad);

}
