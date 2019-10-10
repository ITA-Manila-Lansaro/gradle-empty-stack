public class iPhone extends Mobile {

    @Override
    public void call() {
        if (getMessage().length() > 5) {
            System.out.println("<Iphone>" + "Message : Message cannot be sent");
        } else {
            System.out.println("<Iphone>" + "Message :" + getMessage());
        }
    }
}
