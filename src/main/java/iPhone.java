public class iPhone extends Mobile{
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void call() {
        System.out.println("<Iphone>"+ "Message :" + message);
    }
}
