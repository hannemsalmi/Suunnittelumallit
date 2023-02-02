package observable;

public class Main {
	  public static void main(String[] args) {
	    ClockTimer clocktimer = new ClockTimer();
	    DigitalClock digitalclock = new DigitalClock(clocktimer);
	    clocktimer.start();

	    try {
	      Thread.sleep(10000);
	    } catch (InterruptedException e) {
	      System.out.println(e);
	    }

	    clocktimer.stop();
	  }
	}
