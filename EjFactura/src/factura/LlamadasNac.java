package factura;

import java.util.HashMap;

public class LlamadasNac extends Llamadas {

	private String localidad;
	
	private Double consumoDefault = 2.0;
	
	
	
	
	@Override
	public Double llamadas() {
		
		
		HashMap<String , Double>  map = new HashMap <String , Double> ();
		map.put("Bernal",0.4);
		map.put("Ibicuy",0.9);
		map.put("Miramar",0.6);
		map.put("Calamuchita",0.8);
		
		
	     Double consumoNac = map.get(localidad);
	        
	     if (consumoNac != null) {
	  	    
		    	return consumoNac * minutos;
		    }else {
		    	 return consumoDefault * minutos ;
		    }   	
	}


	


	public LlamadasNac(String localidad,Double minutos,String mes) {
		this.minutos = minutos;
		this.mes = mes;
		this.localidad = localidad;
	}

	public String getMes() {
		return mes;
	}




	public void setMes(String mes) {
		this.mes = mes;
	}
	
	
	public Double getMinutos() {
		return minutos;
	}




	public void setMinutos(Double minutos) {
		this.minutos = minutos;
	}





	public String getLocalidad() {
		return localidad;
	}





	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}





	
	
	
	
	
}
