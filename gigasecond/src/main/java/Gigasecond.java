import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
	private LocalDateTime afterGigaSecond;
	private static final long GIGA_SECOND=100_000_000_0L;  
	
	Gigasecond(LocalDate moment) {
	    this(moment.atStartOfDay());
	   
	}
	
	Gigasecond(LocalDateTime moment){
		this.afterGigaSecond=moment.plusSeconds(GIGA_SECOND);
	}
	
	
	LocalDateTime getDateTime() {
	    return this.afterGigaSecond;
	}

}
