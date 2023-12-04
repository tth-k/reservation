package com.tableReservation.table.service;

import com.tableReservation.table.dto.ShopMemberDTO;
import com.tableReservation.table.entity.ShopMemberEntity;
import com.tableReservation.table.repository.ShopMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ShopMemberRepository shopMemberRepository;
    public void save(ShopMemberDTO shopMemberDTO) {
        ShopMemberEntity shopMemberEntity = ShopMemberEntity.toShopMemberEntity(shopMemberDTO);
        shopMemberRepository.save(shopMemberEntity);
    }
}
