/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;
// Lab 1: Time2.java
// Time2 class definition with methods tick, 
// incrementMinute and incrementHour.

public final class Time2 {

    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    boolean checkh = true;
    boolean checkm = true;
    boolean checks = true;
    boolean validity = false;

    // Time2 no-argument constructor: initializes each instance variable 
    // to zero; ensures that Time2 objects start in a consistent state
    private void setTime(int h, int m, int s) {
        if (h <= 23 && h >= 0) {
            hour = h;
        } else {
            hour = 0;
            checkh = false;
        }
        if (m <= 59 && m >= 0) {
            minute = m;
        } else {
            minute = 0;
            checkm = false;
        }
        if (s <= 59 && s >= 0) {
            second = s;
        } else {
            second = 0;
            checks = false;
        }
        if (checkh == checkm && checkh == checks) {
            validity = true;
        } else {
            validity = false;

        }

    }

    private boolean setHour(int h) {
        if (h <= 23 && h >= 0) {
            hour = h;
        } else {
            checkh = false;
            hour = 0;
        }
        return checkh;
    }

    private boolean setMinute(int m) {
        if (m <= 59 && m >= 0) {
            minute = m;
        } else {
            checkm = false;
            minute = 0;
        }
        return checkm;

    }

    private boolean setSecond(int s) {
        if (s <= 59 && s >= 0) {
            second = s;
        } else {
            checks = false;
            second = 0;
        }
        return checks;
    }

    public Time2() {
        this(0, 0, 0); // invoke Time2 constructor with three arguments
    } // end Time2 no-argument constructor

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2(int h) {
        this(h, 0, 0); // invoke Time2 constructor with three arguments
    } // end Time2 one-argument constructor

    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int h, int m) {
        this(h, m, 0); // invoke Time2 constructor with three arguments
    } // end Time2 two-argument constructor 

    // Time2 constructor: hour, minute and second supplied
    public Time2(int h, int m, int s) {
        setTime(h, m, s); // invoke setTime to validate time
    } // end Time2 three-argument constructor 

    // Time2 constructor: another Time2 object supplied
    public Time2(Time2 time) {
        // invoke Time2 constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    } // end Time2 constructor with Time2 argument

    // Get Methods
    // get hour value
    private int getHour() {
        return hour;
    } // end method getHour

    // get minute value
    private int getMinute() {
        return minute;
    } // end method getMinute

    // get second value
    public int getSecond() {
        return second;
    } // end method getSecond

    // Tick the time by one second
    /* Problem 2: Write the header for the tick method. */
    public void incrementSecond(int s) {
        if (s < 59) {
            setSecond(s + 1);
        } else {
            setSecond(s + 1);
            if (getMinute() == 59) {
                setMinute(getMinute() + 1);
                setHour(getHour() + 1);
            } else {
                setMinute(getMinute() + 1);
            }
        }
    }

    public void incrementMinute(int m) {
        if (m < 59) {
            setMinute(m + 1);
        }
        else {
            setMinute(m + 1);
            if (getHour() == 23){
                setHour(getHour() + 1);
                setSecond(0);
            }
            else{ 
                setHour(getHour()+1);
                
            }
            
        }
        // convert to String in universal-time format (HH:MM:SS)

    }
    public void incrementHour(int h) {
        
            setHour(h + 1);
        // convert to String in universal-time format (HH:MM:SS)

    }
   public String toUniversalString()
   {
      return String.format( 
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
   } // end method toUniversalString

   // convert to String in standard-time format (H:MM:SS AM or PM)
  
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
         ( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   } // end method toStandardString
} // end class Time2


  
