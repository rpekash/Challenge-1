public class Item {
    private final double price;
    private final String category;
    private final String name;
    private final String studentFirstName;
    private final String studentLastName;
    private final String studentEmail;

    public Item(String name, String category, double price, String studentFirstName, String studentLastName, String studentEmail) {
        this.price = price;
        this.category = category;
        this.name = name;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentEmail = studentEmail;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Category: " + category + ", Price: $" + price;
    }

    public String detailedString() {
        return "Name: " + name + "\nCategory: " + category + "\nSeller: " + studentFirstName + " " + studentLastName + "\nEmail: " + studentEmail + "\nPrice: $" + price;
    }
}