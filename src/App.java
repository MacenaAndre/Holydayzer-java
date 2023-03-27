public class App {
    public static void main(String[] args) throws Exception {
        FindHoliday holidayFinder = new FindHoliday();
        holidayFinder.findHolidayList();

        holidayFinder.findDateOrFail("12/10/2023");
        holidayFinder.findDateOrFail("02/11/2023");
        holidayFinder.findDateOrFail("23/10/2023");
    }
}
