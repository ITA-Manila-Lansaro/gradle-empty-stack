public class Android extends Mobile {

    @Override
    public void call() {
        if (getMessage().length() > 5){
            System.out.println("<Android"+"Message: Cannot be sent");
        }else {
        System.out.println("<Android>"+ "Message :" + getMessage());
        }
    }

}
