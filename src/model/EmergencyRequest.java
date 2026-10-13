package model;
public class EmergencyRequest {
    private final String hospital, text; private final boolean emergency;
    public EmergencyRequest(String hospital,String text,boolean emergency){this.hospital=hospital;this.text=text;this.emergency=emergency;}
    public String getHospital(){return hospital;} public String getText(){return text;} public boolean isEmergency(){return emergency;}
}
