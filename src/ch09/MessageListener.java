package ch09;

public class MessageListener implements Button.OnclickListener{
    @Override
    public void onClick() {
        System.out.println("메시지를 보냅니다.");
    }
}
