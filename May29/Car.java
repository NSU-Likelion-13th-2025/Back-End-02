package May29;

class Car {
    //필드 선언
    String company = "현대자동차";
    String model = "그랜져";
    String color = "검정";
    int maxSpeed = 350;
    int speed;
}

class CarExample{
    public static void main(String[] args) {
        //Car 객체 생성
        Car mycar = new Car();

        //Car 객체의 필드값 읽기
        System.out.println("제작회사: " + mycar.company);
        System.out.println("모델명: " + mycar.model);
        System.out.println("색깔: " + mycar.color);
        System.out.println("최고속도: " + mycar.maxSpeed);
        System.out.println("현재속도: " + mycar.speed);

        //Car 객체의 필드값 변경
        mycar.speed = 60;
        System.out.println("수정된 속도: "+mycar.speed);
    }
}
