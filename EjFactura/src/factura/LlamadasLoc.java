package factura;

public class LlamadasLoc extends Llamadas {

	
	private int hora;
	private boolean diaHabil;
	
	
	
	
	@Override
	public Double llamadas() {
		
		Double consumo;
		
		if(diaHabil) {
			
			if(hora >=8 && hora<=20) {
				consumo = 0.20 * minutos;
			}else {
				consumo = 0.10 * minutos;
			}
			
		}else {
			
			consumo = 0.10 * minutos;
			
		}
		return consumo;
		
	}
	
	
	public LlamadasLoc(boolean diaHabil, int hora, Double minutos,String mes) {
		
		this.diaHabil = diaHabil;
		this.hora = hora;
		this.minutos = minutos;
		this.mes = mes;
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public boolean isDiaHabil() {
		return diaHabil;
	}


	public void setDiaHabil(boolean diaHabil) {
		this.diaHabil = diaHabil;
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
	
	
	
	
}
