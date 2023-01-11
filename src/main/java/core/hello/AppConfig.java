package core.hello;

import core.hello.discount.RateDiscountPolicy;
import core.hello.member.MemberService;
import core.hello.member.MemberServiceImp;
import core.hello.member.MemoryMemberRepository;
import core.hello.order.OrderService;
import core.hello.order.OrderServiceImp;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImp(new MemoryMemberRepository(), memberRepository);
    }
    // test

    public OrderService orderService() {
        return new OrderServiceImp(new MemoryMemberRepository(), new RateDiscountPolicy());
    }
}
