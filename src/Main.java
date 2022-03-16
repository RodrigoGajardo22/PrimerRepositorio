import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		 System.out.println("---- FORMA NO ANEMICA ---------");
		
		Tiempo t= new Tiempo();
		
		 System.out.println(t.formatoLargo());
		 System.out.println(t.formatoCorto());
		 
		//---------- Forma Anemica -------------------  
		 
		 
		 System.out.println("---- FORMA ANEMICA ---------");
		TiempoAnemico tA = new TiempoAnemico(); 
		
		DateTimeFormatter dtf =
			    DateTimeFormatter
			      .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss");
		
		System.out.println("Formato largo: " + tA.fecha().format(dtf));
		
		dtf = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy' a las' hh:mm:ss");
		
		System.out.println("Formato corto: " + tA.fecha().format(dtf));
		
	}

}
