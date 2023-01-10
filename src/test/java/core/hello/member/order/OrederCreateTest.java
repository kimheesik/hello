package core.hello.member.order;

import core.hello.member.Grade;
import core.hello.member.Member;
import core.hello.member.MemberService;
import core.hello.member.MemberServiceImp;
import core.hello.order.Order;
import core.hello.order.OrderService;
import core.hello.order.OrderServiceImp;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrederCreateTest {
    @Test
    void orderCreate (){
        OrderService orderService = new OrderServiceImp();
        MemberService memberService = new MemberServiceImp();

        Long memberId = 1L;
        Member member = new Member(memberId, "kim", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemB", 30000);

        Assertions.assertThat(order.caculatePrice()).isEqualTo(29000);
    }
}
