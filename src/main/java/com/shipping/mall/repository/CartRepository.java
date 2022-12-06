package com.shipping.mall.repository;

import com.shipping.mall.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {

    Cart findByMemberId(Long memberId);
}
