
public class Dispatcher implements Runnable{
	private Ventana ventana;
	private Thread t;
	public Queue<Integer> queue;
	
	public Dispatcher(Ventana ventana) {
		queue=new Queue<>();
		this.ventana=ventana;
		
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(2000);
				ventana.soldLabel.setText(""+queue.dequeue());
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
