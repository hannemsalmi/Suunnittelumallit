package observable;

public class ClockThread implements Runnable {
	  private ClockTimer clocktimer;

	  public ClockThread(ClockTimer clockTimer) {
	    this.clocktimer = clockTimer;
	  }

	  @Override
	  public void run() {
	    while (clocktimer.isTicking) {
	      clocktimer.tick();
	      try {
	        Thread.sleep(1000);
	      } catch (InterruptedException e) {
	        System.out.println(e);
	      }
	    }
	  }
	}
