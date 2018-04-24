package customexceptions;

public class EmptyCharSequenceException extends Exception{
	public EmptyCharSequenceException()
	{
		
	}
	
	public EmptyCharSequenceException(String message)
    {
       super(message);
    }
}
