package core.hello.member;

import core.hello.member.Member;
import core.hello.member.MemberRepository;
import core.hello.member.MemberService;
import core.hello.member.MemoryMemberRepository;

public class MemberServiceImp implements MemberService {
    MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
