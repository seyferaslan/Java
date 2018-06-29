
package flighttrackapp;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Flight extends Thread{
   static final long serialVersionUID = 1L;
   private int depday;
   private int dephour;
   private int depmin;
   private int arrday;
   private int arrhour;
   private int arrmin;
   private String departurecity;
   private String arrivalcity;
   private String aircraftmodel;
   private int say;
   private int totaltime;
   FlightTrack f;
   private int permission;
  
    public Flight(int depday, int dephour, int depmin, int arrday, int arrhour, int arrmin, String departurecity, String arrivalcity,String aircraftmodel,int say,FlightTrack flightt,int permission) {
        this.depday = depday;
        this.dephour = dephour;
        this.depmin = depmin;
        this.arrday = arrday;
        this.arrhour = arrhour;
        this.arrmin = arrmin;
        this.departurecity = departurecity;
        this.arrivalcity = arrivalcity;
        this.aircraftmodel = aircraftmodel;
        this.say=say;
        f=flightt;
        int timing1 = (depday*24)*60+dephour*60+depmin;
        int timing2 = (arrday*24)*60+arrhour*60+arrmin;
        totaltime= timing2-timing1;
        this.permission=permission;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public int getTotaltime() {
        return totaltime;
    }
    


    public void setDepday(int depday) {
        this.depday = depday;
    }

    public void setDephour(int dephour) {
        this.dephour = dephour;
    }

    public void setDepmin(int depmin) {
        this.depmin = depmin;
    }

    public void setArrday(int arrday) {
        this.arrday = arrday;
    }

    public void setArrhour(int arrhour) {
        this.arrhour = arrhour;
    }

    public void setArrmin(int arrmin) {
        this.arrmin = arrmin;
    }

    public void setDeparturecity(String departurecity) {
        this.departurecity = departurecity;
    }

    public void setArrivalcity(String arrivalcity) {
        this.arrivalcity = arrivalcity;
    }

    public String getAircraftmodel() {
        return aircraftmodel;
    }

    public void setAircraftmodel(String aircraftmodel) {
        this.aircraftmodel = aircraftmodel;
    }

    public int getSay() {
        return say;
    }

    public int getDepday() {
        return depday;
    }

    public int getDephour() {
        return dephour;
    }

    public int getDepmin() {
        return depmin;
    }

    public int getArrday() {
        return arrday;
    }

    public int getArrhour() {
        return arrhour;
    }

    public int getArrmin() {
        return arrmin;
    }

    public String getDeparturecity() {
        return departurecity;
    }

    public String getArrivalcity() {
        return arrivalcity;
    }
    
   @Override
    public void run() {
        while(depday!=f.getTimeday() || dephour!= f.getTimehour() || depmin!= f.getTimemin()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while(arrday!=f.getTimeday() || arrhour!= f.getTimehour() || arrmin!= f.getTimemin()){
            say++;
            try {
                long sure=(long)Math.ceil(totaltime*10);
                Thread.sleep(sure);
            } catch (InterruptedException ex) {
                Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        say=100;
    }

    @Override
    public String toString() {
        return "Flight{" + "depday=" + depday + ", dephour=" + dephour + ", depmin=" + depmin + ", arrday=" + arrday + ", arrhour=" + arrhour + ", arrmin=" + arrmin + ", departurecity=" + departurecity + ", arrivalcity=" + arrivalcity + ", aircraftmodel=" + aircraftmodel + ", say="+say +'}';
    }

    
   

    
    
   
   
   
   
   
   
}
