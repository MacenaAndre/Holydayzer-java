public class Date {
    private String day;
    private String month;
    private String year;
  
    void splitDate(String date) {
        String[] parts = date.split("/");
        
        this.day = parts[0];
        this.month = parts[1];
        this.year = parts[2];
             
    }
  
    String getDay() {
        return this.day;
    }
  
    String getMonth() {
        return this.month;
    }
  
    String getYear() {
        return this.year;
    }
  }