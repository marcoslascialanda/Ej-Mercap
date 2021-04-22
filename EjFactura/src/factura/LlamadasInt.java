package factura;

import java.util.HashMap;

public class LlamadasInt extends Llamadas {

	
	private Double consumoDefault = 2.0;   //valor default por si no encuentra en el HashMap
	private String pais;
	
	
	
	
	
	@Override
	public Double llamadas() {
		
		HashMap <String , Double>  map = new HashMap <String , Double> ();
		map.put("Peru",1.0);
		map.put("Italia",2.5);
		map.put("Chile",1.5);
		map.put("Australia",4.0);
		
	    Double consumoInt = map.get(pais);
	    
	    if(consumoInt != null) {
	    
	    	return consumoInt * minutos;
	    }else {
	    	 return consumoDefault * minutos ;
	    }
	   
	}





	public LlamadasInt(String pais,Double minutos,String mes) {
		
		this.pais = pais;
		this.minutos = minutos;
		this.mes = mes;
		
	}





	public String getPais() {
		return pais;
	}





	public void setPais(String pais) {
		this.pais = pais;
	}

	
	public Double getMinutos() {
		return minutos;
	}


	public void setMinutos(Double minutos) {
		this.minutos = minutos;
	}
	
	
	
	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}
	
}
