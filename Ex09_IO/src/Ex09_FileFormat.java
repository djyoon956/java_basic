import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_FileFormat {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.0");
		System.out.println(df.format(1234567.89));
		System.out.println(df.format(1000000000));

		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sf.format(new Date()));

		String phone = "^01[0-1]?[6-9]-/d{4}-/d{4}$";
	}
}
