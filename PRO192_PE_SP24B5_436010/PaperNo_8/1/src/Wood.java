
public class Wood {
    private String source;
    private int year;

    public Wood() {
    }

    public Wood(String source, int year) {
        this.source = source;
        this.year = year;
    }

    public String getSource() {
        return source.substring(0, source.length() - 1);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year - this.year;
    }
}
