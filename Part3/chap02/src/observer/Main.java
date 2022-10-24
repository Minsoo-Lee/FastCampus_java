package observer;

public class Main {

    public static void main(String[] args) {

        Button button = new Button("button");

        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });


        button.click("send message : click1");
        button.click("send message : click2");
        button.click("send message : click3");
        button.click("send message : click4");
        button.click("send message : click5");
    }
}
