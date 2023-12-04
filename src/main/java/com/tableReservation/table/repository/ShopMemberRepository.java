package com.tableReservation.table.repository;

import com.tableReservation.table.entity.ShopMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopMemberRepository extends JpaRepository<ShopMemberEntity, Long> {
}
