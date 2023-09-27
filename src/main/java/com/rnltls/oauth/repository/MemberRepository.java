package com.rnltls.oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rnltls.oauth.domain.Member;
import com.rnltls.oauth.domain.Member;

import java.util.Optional;
public interface MemberRepository extends JpaRepository<Member, Long>{
    Optional<Member> findByEmailAndProvider(String email, String provider);
}
