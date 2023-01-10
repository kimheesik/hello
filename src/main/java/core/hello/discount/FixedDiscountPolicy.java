package core.hello.discount;

import core.hello.member.Grade;
import core.hello.member.Member;

public class FixedDiscountPolicy implements DiscountPolicy {
    int discountPrice = 1000;

    @Override
    public int discount(Member member, int itemPrice) {
        if (member.getGrade() == Grade.VIP){
            return discountPrice;
        }
        else {
            return 0;
        }
    }
}
