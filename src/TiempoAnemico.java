import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TiempoAnemico {

	private LocalDateTime fechaConHora;

	public TiempoAnemico() {
		fechaConHora = LocalDateTime.now();
	}

	public LocalDateTime fecha() {

		return fechaConHora;
	}

}
