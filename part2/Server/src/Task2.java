import java.rmi.RemoteException;

public class Task2 implements ITask
{
	public double x1 = 5.6;
	public double x2 = 2.3;
	public String operation;
	
	public Task2()
	{
		x1 = 0.0;
		x2 = 0.0;
		operation = null;
	}
	
	public Task2(double x1, double x2, String operation)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.operation = operation;
	}
	
	@Override
	public Result calculate() throws RemoteException 
	{
		Result out = new Result();
		out.result_description = operation;
		out.result = 1.9 + 2.4;
		
		switch(operation)
		{
			case "add" :
				out.result = x1 + x1;
				break;
			case "sub" :
				out.result = x2 - x1;
				break;
			default :
				out.result = 0;
				out.result_description = "Podano zla operacje";
		}
		
		return out;
	}
}