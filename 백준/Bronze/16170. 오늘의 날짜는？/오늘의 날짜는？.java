import java.time.ZoneId;
import java.time.ZonedDateTime;

//Java 8에서 도입된 새로운 날짜 및 시간 API인 java.time 패키지의 ZonedDateTime과 ZoneId를 사용

public class Main {
	public static void main (String[] args) {
    	ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(zonedDateTime.getYear());
        System.out.println(zonedDateTime.getMonthValue());
        System.out.println(zonedDateTime.getDayOfMonth());
    }
}