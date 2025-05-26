package May19;

class AA {
    void abc() {
        try {
            bcd();
        }
        catch (InterruptedException e) {
            System.out.println("예외 발생");
        }
    }

    void bcd() throws InterruptedException {
        Thread.sleep(1000);
    }
}
