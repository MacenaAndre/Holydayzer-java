public class Date {
    private String day;
    private String month;
    private String year;
  
    protected void splitDate(String date) {
        String[] parts = date.split("/");
        
        this.day = parts[0];
        this.month = parts[1];
        this.year = parts[2];
             
    }
  
    protected String getDay() {
        return this.day;
    }
  
    protected String getMonth() {
        return this.month;
    }
  
    protected String getYear() {
        return this.year;
    }
  }