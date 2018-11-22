
public class ConcreteHandlerTwo extends Handler
{
	public void handleRequest(Request request)
	{
		if(request.getValue() > 0)
		{
			System.out.println("Valore positivo in Handler Two");
			System.out.println("\t ConcreteHandler.HandlerRequest :" + request.getDescription() + request.getValue());
		}
		else
		{
			m_successor.handleRequest(request);
		}
	}

}
