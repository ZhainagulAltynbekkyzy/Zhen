package Todo;
import java.lang.Error;
public class myError {
    public myError(){ super(); }
}

class OutOfBoudaryException extends Error{
    public OutOfBoudaryException()
    {
        super();
    }

    public OutOfBoudaryException(String message)
    {
        super(message);
    }
}