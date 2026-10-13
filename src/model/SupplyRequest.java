package model;
public class SupplyRequest {
    private final int id,hospitalId,quantity; private final String medicine; private final boolean emergency;
    public SupplyRequest(int id,int hospitalId,String medicine,int quantity,boolean emergency){this.id=id;this.hospitalId=hospitalId;this.medicine=medicine;this.quantity=quantity;this.emergency=emergency;}
    public int getId(){return id;} public int getHospitalId(){return hospitalId;} public int getQuantity(){return quantity;} public String getMedicine(){return medicine;} public boolean isEmergency(){return emergency;}
}
