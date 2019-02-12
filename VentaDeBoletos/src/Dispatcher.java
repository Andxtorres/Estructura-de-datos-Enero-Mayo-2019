
public class Dispatcher implements Runnable{
	private Ventana ventana;
	private Thread t;
	public Stack<Boleto> stack;
	
	public Dispatcher(Ventana ventana) {
		stack=new Stack<>();
		this.ventana=ventana;
		
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(10000);
				ventana.soldLabel.setText(""+stack.pop().toString());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void start() {
      if (t == null) {
         t = new Thread (this, "hiloDispatcher");
         t.start ();
      }   
	}

}
