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
	public String formatoLargo() {
	DateTimeFormatter dtf =
		    DateTimeFormatter
		      .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss");
	
		 return "Formato largo: " + fechaConHora.format(dtf);
	}
	
	//-------------------------------------------------------
	public String  formatoCorto() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy' a las' hh:mm:ss");
		
		return "Formato corto: " + fechaConHora.format(dtf);
		
	}
}
