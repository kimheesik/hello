package core.hello.order;

import core.hello.discount.DiscountPolicy;
import core.hello.member.Member;
import core.hello.member.MemberRepository;

public class OrderServiceImp implements OrderService {
    private final MemberRepository memberRepository ;
    private final DiscountPolicy discountPolicy ;

    public OrderServiceImp(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order (memberId, itemName, itemPrice, discountPrice);
    }
}
