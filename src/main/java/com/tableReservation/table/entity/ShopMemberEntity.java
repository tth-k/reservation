package com.tableReservation.table.entity;

import com.tableReservation.table.dto.ShopMemberDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "shop_member_table")
public class ShopMemberEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long shopMemberId;

    @Column
    private String shopMemberPassword;

    @Column
    private String shopName;

    @Column
    private String shopLocation;

    @Column
    private String shopOperationDate;

    @Column
    private String shopOpenTime;

    @Column
    private String shopCloseTime;

    @Column
    private String ownerName;

    public static ShopMemberEntity toShopMemberEntity(ShopMemberDTO shopMemberDTO){
        ShopMemberEntity shopMemberEntity = new ShopMemberEntity();

        shopMemberEntity.setShopMemberPassword(shopMemberDTO.getShopMemberPassword());
        shopMemberEntity.setShopName(shopMemberEntity.getShopName());
        shopMemberEntity.setShopLocation(shopMemberEntity.getShopLocation());
        shopMemberEntity.setShopOperationDate(shopMemberEntity.getShopOperationDate());
        shopMemberEntity.setShopOpenTime(shopMemberEntity.getShopOpenTime());
        shopMemberEntity.setShopCloseTime(shopMemberEntity.getShopCloseTime());
        shopMemberEntity.setOwnerName(shopMemberEntity.getOwnerName());

        return shopMemberEntity;
    }
}
