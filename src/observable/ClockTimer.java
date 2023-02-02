package observable;

import java.util.Observable;

public class ClockTimer extends Observable {
  private int hour, minute, second;
  boolean isTicking;
  
  public int getHour(){
    return hour;
  }
  
  public int getMinute(){
    return minute;
  }
  
  public int getSecond(){
    return second;
  }

  public void start() {
	  isTicking = true;
	  new Thread(new ClockThread(this)).start();
	}

  public void stop() {
    isTicking = false;
  }

  synchronized void tick() {
    // update time
    second++;
    if (second == 60) {
      second = 0;
      minute++;
    }
    if (minute == 60) {
      minute = 0;
      hour++;
    }
    if (hour == 24) {
      hour = 0;
    }

    setChanged();
    notifyObservers();
  }
}
