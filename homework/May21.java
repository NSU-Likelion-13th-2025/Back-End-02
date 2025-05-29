package homework;

class Item {
    private String name;  // 필드 String name을 생성
    private int amount; // 필드 int amount를 생성
    private int price;  // 필드 int price를 생성

    // 생성자 1 : 기본 생성자
    public Item() {
        this.name = "이름없음";
        this.amount = 0;
        this.price = 0;
    }

    // 생성자 2 : 이름만 받는 생성자
    public Item(String name) {
        this.name = name;
        //this.amount = 0;
        //this.price = 0;
    }

    // 생성자 3 : 이름과 가격을 받는 생성자
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 생성자 4 : 이름, 개수, 가격을 받는 생성자
    public Item(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    // Getter
    public String getName() {
        return name;
    }
    public int getAmount() {
        return amount;
    }
    public int getPrice() {
        return price;
    }

    // Setter

    // introduceItem 메서드
    public void introduceItem(){
        System.out.println("이름 : "+getName()+" | 가격 : "+getPrice()+" | 개수 : "+getAmount());
    }
}

public class May21 {

    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item("사과");
        Item item3 = new Item("바나나", 1000);
        Item item4 = new Item("포도", 7, 2000);

        item1.introduceItem();
        item2.introduceItem();
        item3.introduceItem();
        item4.introduceItem();
    }
}