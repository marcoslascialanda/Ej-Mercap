package factura;

import java.util.ArrayList;

public class FacturaMain {

	public static void main(String[] args) {
		
ArrayList<LlamadasLoc> llamadasLoc = new ArrayList();
		
		LlamadasLoc ll1 = new LlamadasLoc(true,22,60.0,"abril");
		llamadasLoc.add(ll1);
		LlamadasLoc ll2 = new LlamadasLoc(true,10,5.0,"abril");
		llamadasLoc.add(ll2);
		LlamadasLoc ll3 = new LlamadasLoc(false,5,30.0,"abril");
		llamadasLoc.add(ll3);
		LlamadasLoc ll4 = new LlamadasLoc(false,11,45.0,"abril");
		llamadasLoc.add(ll4);
		
		
		
		ArrayList<LlamadasInt> llamadasInt = new ArrayList();
		
		LlamadasInt li1 = new LlamadasInt("Italia",22.0,"abril");
		llamadasInt.add(li1);
		LlamadasInt li2 = new LlamadasInt("Peru",10.0,"abril");
		 llamadasInt.add(li2);
		LlamadasInt li3 = new LlamadasInt("Australia",5.0,"abril");
		 llamadasInt.add(li3);
		LlamadasInt li4 = new LlamadasInt("Chile",11.0,"abril");
		 llamadasInt.add(li4);
		
		
		ArrayList<LlamadasNac> llamadasNac = new ArrayList();
		LlamadasNac ln1 = new LlamadasNac("Miramar",13.0,"abril");
		llamadasNac.add(ln1);
		LlamadasNac ln2 = new LlamadasNac("Ibicuy",23.0,"abril");
		llamadasNac.add(ln2);
		LlamadasNac ln3 = new LlamadasNac("Bernal",34.0,"abril");
		llamadasNac.add(ln3);
		LlamadasNac ln4 = new LlamadasNac("Calamuchita",19.0,"abril");
		llamadasNac.add(ln4);
		
		
		String mesFactura = "abril";
		
		
		System.out.println("Facturacion " + mesFactura);
		
		
		float costoTotal = 16;   //Abono Mensual
		
		System.out.println("---------------------------------------------------------");
		 System.out.println("Llamadas Locales");
		 for (LlamadasLoc l : llamadasLoc) {
			 
			if(l.getMes()== mesFactura) {
				
				 Double costo = l.llamadas();
						 
			 System.out.println(" Duracion:" + l.getMinutos() + "   Hora:" + l.getHora() + "  Mes:" + l.getMes() + "  Costo: $ " + String.valueOf(costo));
			 
			 costoTotal += costo;
			}
		 }
		 
		 System.out.println("---------------------------------------------------------");
		 System.out.println("Llamadas Internacionales");
		 
		
		 for (LlamadasInt l : llamadasInt) {
			 if(l.getMes()== mesFactura) {
				 
				 Double costo = l.llamadas();
				 
				 
			 System.out.println(" Duracion:" + l.getMinutos()+ "   Pais:" + l.getPais() + "  Mes:" + l.getMes() + "  Costo: $ " + String.valueOf(costo));
		 
			 costoTotal += costo;
			 }
		 }
		 
		 System.out.println("---------------------------------------------------------");
		 System.out.println("Llamadas Nacionales");
		 
		 
		for(LlamadasNac l : llamadasNac) {
			if(l.getMes()== mesFactura) {
				
				Double costo = l.llamadas();
				
			System.out.println(" Duracion:"+ l.getMinutos()+ "   Localidad:" + l.getLocalidad()+ "  Mes:" + l.getMes() + "  Costo: $ " +String.valueOf(costo));
			
			 costoTotal += costo;
			}
		}
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("El costo total de su factura es : $ " + costoTotal);
		
	}


}
