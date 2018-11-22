
public class ConcreteHandlerThree extends Handler
{
	public void handleRequest(Request request)
	{
		if(request.getValue() == 0)
		{
			System.out.println("Valore pari a zero in Handler Three");
			System.out.println("\t ConcreteHandler.HandlerRequest :" + request.getDescription() + request.getValue());
		}
		else
		{
			m_successor.handleRequest(request);
		}
	}

}
