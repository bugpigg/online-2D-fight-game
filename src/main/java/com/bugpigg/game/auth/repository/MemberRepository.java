package com.bugpigg.game.auth.repository;

import com.bugpigg.game.auth.domain.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    boolean existsByUserName(String userName);

    Optional<Member> findByUserName(String userName);
}
