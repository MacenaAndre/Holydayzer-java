import java.util.ArrayList;
import java.util.List;

public class FindHoliday implements HolidaysInterface {

    List<Holiday> holidayList = new ArrayList<>();

    protected FindHoliday() {
        String[] dates = HolidaysInterface.dates;
        String[] names = HolidaysInterface.names;

        for(int i=0; i<dates.length; i++) {
            Holiday holiday = new Holiday(dates[i], names[i]);
            this.holidayList.add(holiday);
        }  
    }

    protected void findHolidayList() {
        System.out.println("Lista de feriados:");

        for(int i=0; i<holidayList.size(); i++) {
            Holiday holiday = this.holidayList.get(i);
            String date = holiday.getDate();
            String name = holiday.getName();

            System.out.println(date + " => " + name);
        }
    } 

    protected void findDateOrFail(String dateSearched) {

        for(int i=0; i<holidayList.size(); i++) {      
            Holiday holiday = this.holidayList.get(i);
            String date = holiday.getDate();
            String name = holiday.getName();


            if(dateSearched.equals(date)) {
            
                System.out.println(date + " => " + name);
            
                return;
            }    
        }

        System.out.println("Não há feriado na data: " + dateSearched);
    }
}
