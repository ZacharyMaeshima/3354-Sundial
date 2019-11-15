
public class Subtask 
{
	private String name;
	private boolean complete;
	
	public Subtask(String n)
	{
		name = n;
		complete = false;
	}
	
	public void setComplete(boolean c)
	{
		complete = c;
	}
	
	public boolean isComplete()
	{
		return complete;
	}
	
}
