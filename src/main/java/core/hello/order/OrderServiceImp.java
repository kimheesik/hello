package core.hello.order;

import core.hello.discount.DiscountPolicy;
import core.hello.discount.FixedDiscountPolicy;
import core.hello.member.Member;
import core.hello.member.MemberRepository;
import core.hello.member.MemberServiceImp;
import core.hello.member.MemoryMemberRepository;

public class OrderServiceImp implements OrderService {
    MemberRepository memberRepository = new MemoryMemberRepository();
    DiscountPolicy discountPolicy = new FixedDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order (memberId, itemName, itemPrice, discountPrice);
    }
}
