public class App {
    public static void main (String[] args){
        Person person = new Person();
        iPhone ipon = new iPhone();
        person.setMobile(ipon);
        person.getMobile().setBrand("Iphone");
        person.getMobile().setMessage("seofmseofse");
        person.getMobile().specs();


        IphoneRobot iphoneRobot = new IphoneRobot();
        iphoneRobot.setIphone(ipon);
        iphoneRobot.getIphone().setBrand("ipon");
        iphoneRobot.getIphone().setColor("blue");
        iphoneRobot.getIphone().setName("iPhone 6");
        iphoneRobot.getIphone().specs();

    }
}
