package core.hello.order;

import core.hello.member.*;

public class OrderApp {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImp();
        MemberService memberService = new MemberServiceImp();

        Long memberId = 1L;
        Member member = new Member(memberId, "lee", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order = " + order);
    }
}
