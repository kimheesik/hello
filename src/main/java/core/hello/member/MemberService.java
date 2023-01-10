package core.hello.member;

import core.hello.member.Member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
