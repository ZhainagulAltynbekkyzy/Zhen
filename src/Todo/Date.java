package Todo;

public class Date{
    private int year, month, day;
    public Date() {}
    public Date(int year, int month, int day)
    {
        if(year < 2000 || year > 2100) throw new OutOfBoudaryException();
        else if(month < 1 || month > 12) throw new OutOfBoudaryException();
        else if(day < 1 || day > 31) throw new OutOfBoudaryException();
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setYear(int year)
    {
        if(year < 2000 || year > 2100) throw new OutOfBoudaryException();
        this.year = year;
    }
    public void setMonth(int month)
    {
        if(month < 1 || month > 12) throw new OutOfBoudaryException();
        this.month = month;
    }
    public void setDay(int day)
    {
        if(day < 1 || day > 31) throw new OutOfBoudaryException();
        this.day = day;
    }
    public int getYear()
    {
        return year;
    }
    public int getMOnth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }
}