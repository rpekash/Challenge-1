public class Item {
    private int price;
    private String name;
    private String category;
    private String studentName;
    private String studentEmail;

public Item(int price, String name, String category,String studentName, String studentEmail){
    this.price = price;
    this.name = name;
    this.category = category;
    this.studentName = studentName;
    this.studentEmail = studentEmail;
}
public Item(int price2, String name2, String category2){

}
public String getName(){
    return name;
}
public int getPrice(){
    return price;
}
public String getCategory(){
    return category;
}
public String toString(){
    return "Item Name: " + this.name + "\n Category: " + this.category + "\n Student who is selling it: " + studentName + "\n student email: " + studentEmail + "\n price: " + price;
}
}