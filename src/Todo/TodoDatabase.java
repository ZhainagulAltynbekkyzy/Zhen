package Todo;

public class TodoDatabase{
    private String name;
    private Date date;
    private boolean checkbox = false;

    public TodoDatabase(String name, Date date, boolean checkbox)
    {
        this.name = name;
        this.date = date;
        this.checkbox = checkbox;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDate(int year, int month, int day)
    {
        this.date = new Date(year, month, day);

    }

    public void clickCheckBox()
    {
        if(checkbox) checkbox = false;
        else checkbox = true;
    }

    public String getName()
    {
        return name;
    }

    public Date getDate()
    {
        return date;
    }

    public boolean getCheckbox()
    {
        return checkbox;
    }
}