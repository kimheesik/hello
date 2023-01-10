package core.hello.member;

import core.hello.member.Member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
