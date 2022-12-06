package com.shipping.mall.repository;

import com.shipping.mall.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

    Member findByEmail(String email);
}
