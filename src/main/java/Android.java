public class Android extends Mobile {
    private String message;
    private String name;
    private String color;
    private String brand;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void call() {
        System.out.println("<Android>"+ "Message :" + getMessage());
    }

    @Override
    public void specs() {
        System.out.println("name: " + getName() + " color: " + getColor() + " brand: "+getBrand());
    }
}
