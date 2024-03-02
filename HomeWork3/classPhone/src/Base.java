public class Base {
    public static void main(String[] args) {
        //2
        Phone mum = new Phone();
        mum.setPhoneNumber(123456789);
        mum.setModel("iPhone 15 Pro");
        mum.setWeight(171.50);
        Phone dad = new Phone();
        dad.setPhoneNumber(450921774);
        dad.setModel("Samsung Galaxy S24 Ultra");
        dad.setWeight(233.20);
        Phone friend = new Phone();
        friend.setPhoneNumber(313908023);
        friend.setModel("Xiaomi 14 Pro");
        friend.setWeight(188.13);

        //3
        System.out.println(mum.getPhoneNumber() + " " + mum.getModel() + " " + mum.getWeight());
        System.out.println(dad.getPhoneNumber() + " " + dad.getModel() + " " + dad.getWeight());
        System.out.println(friend.getPhoneNumber() + " " + friend.getModel() + " " + friend.getWeight());

        System.out.println();
        //4
        System.out.println(mum.getNumber());
        mum.receiveCall("Mum");
        System.out.println(dad.getNumber());
        mum.receiveCall("Dad");
        System.out.println(friend.getNumber());
        mum.receiveCall("Amy");

        //9
        mum.receiveCall("Samantha", 111222333);
        dad.receiveCall("Justin",771990564);
        friend.receiveCall("Seline",132390130);
        //10
        mum.sendMessage(102,123456789);
    }
}
