import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.Edu_Date;

/*
* Calendar 를 상속받아 완전히 구현한 클래스는 
 * GregorianCalendar
   buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
      태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar
     의 인스턴스를 반환한다
   GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 
   그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용
   그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
   이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      다른 종류의 역법의 사용하는 국가에서 실행하면 변경......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        다른 종류의 역법의 사용하는 국가에서 실행하면 변경......   }  }
  API : 생성자 Protected Calendar() 
 */
//Java API
//날짜 : Date (구) -> Calendar(신)

public class Ex08_Calendar {
	public static void main(String[] args) {
		// 구 버전
//		Date date = new Date();
//		System.out.println(date);
//
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar.toString());
//		System.out.printf("%d.%d.%d\n", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1,
//				calendar.get(Calendar.DATE));
//		System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
//		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//
//		System.out.printf("%d:%d:%d %s\n", calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE),
//				calendar.get(Calendar.SECOND), calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM");
		System.out.println(Edu_Date.DateString(calendar));
		System.out.println(Edu_Date.DateString(calendar, ","));
		System.out.println(Edu_Date.MonthFormat_DateString(calendar));
	}
}
