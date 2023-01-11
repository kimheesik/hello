package core.hello.member;

import core.hello.AppConfig;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "kim", Grade.BASIC);
        memberService.join(member);

        Member member1 = memberService.findMember(1L);
        System.out.println("member1.id = " + member1.getId());
        System.out.println("member1.name = " + member1.getName());
        System.out.println("member1.grade = " + member1.getGrade());

        Member member2 = new Member(2L, "lee", Grade.VIP);
        memberService.join(member2);

        Member member3 = memberService.findMember(2L);
        System.out.println("member2.id = " + member3.getId());
        System.out.println("member2.name = " + member3.getName());
        System.out.println("member2.grade = " + member3.getGrade());
    }
}
