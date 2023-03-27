public class Holiday extends Date {
    private String name;

    protected Holiday(String date, String name) {
        super.splitDate(date);
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

    protected String getDate() {
        return(super.getDay() + "/" + super.getMonth() + "/" + super.getYear());
    }
}
