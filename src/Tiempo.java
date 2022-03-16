import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Tiempo {
	
	private LocalDateTime fechaConHora;
	
	// constructor
	
	public Tiempo(){
		fechaConHora = LocalDateTime.now();
		}
	
	//-------------------------------------------
	public void formatoLargo() {
	DateTimeFormatter dtf =
		    DateTimeFormatter
		      .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss");
	
		System.out.println("Formato largo: " + fechaConHora.format(dtf));
	}
	
	//-------------------------------------------------------
	public void formatoCorto() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy' a las' hh:mm:ss");
		
		System.out.println("Formato corto: " + fechaConHora.format(dtf));
		
	}
}
