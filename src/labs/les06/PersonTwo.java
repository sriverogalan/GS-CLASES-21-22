package labs.les06;

public class PersonTwo {
    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();

    public void displayPersonInfo(){
        name.append("Sergi");
        name.append(" ");
        name.append("Rivero");
        System.out.println("Name : " + name);
        System.out.println("Name object capacity : " + name.capacity());

        phoneNumber.append(1234567891);
        phoneNumber.insert(3, "-");
        phoneNumber.insert(7, "-");
        System.out.println("Phone Number : " + phoneNumber );

        System.out.println("First name : " + name.substring(0,5));
    }
}
