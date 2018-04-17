import java.rmi.RemoteException;

/**
 * @author jacek blady 228140
 *
 * Task class
 * implements ITask
 * Specifies tasks for workers
 */
public class Task2 extends Task
{
	public Task2()
	{
		super();
	}
	
	public Task2(Input input)
	{
		super(input);
	}
	
	/**
	 * Implementation of calculate method from ITask interface.
	 * returns Result type result
	 * throws RemoteException
	 */
	@Override
	public Result calculate() throws RemoteException 
	{
		Result out = new Result();
		int fact = 1;
		for(int i = 1; i <= list.get(0); i++)
		{    
		      fact = fact*i;
		}  
		out.result_description = operation + this.getClass().getName();
		out.result.add(fact);
			
		return out;
	}
}
