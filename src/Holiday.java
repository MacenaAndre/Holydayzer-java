public class Holiday extends Date {
    private String name;
    private String date;

    protected Holiday(String date, String name) {
        super.splitDate(date);
        this.name = name;
    }

    protected void setDate() {
        this.date = (super.getDay() + "/" + super.getMonth() + "/" + super.getYear());
    }

    protected String getName() {
        return name;
    }

    protected String getDate() {
        return date;
    }

}
