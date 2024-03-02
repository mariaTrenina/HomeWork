public class Phone {
    //1
    private long phoneNumber;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(long phoneNumber, String model, double weight) {
        this(phoneNumber, model);
        this.weight = weight;
    }

    public Phone(long phoneNumber, String model) {
        this.phoneNumber = phoneNumber;
        this.model = model;
    }

    public long getNumber() {return phoneNumber;}
    public void receiveCall(String name) {
        System.out.println("Calling "+name);
    }
    public void receiveCall(String name, long phoneNumber) {
        System.out.println("Calling "+phoneNumber+" to "+name);
    }
    public void sendMessage(long ... numbers) {
        for (long a: numbers) {
            System.out.print(a+" ");
        }
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
