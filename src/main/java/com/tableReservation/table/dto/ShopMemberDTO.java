package com.tableReservation.table.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShopMemberDTO {
    private Long shopMemberId;
    private String shopMemberPassword;
    private String shopName;
    private String shopLocation;
    private String shopOperationDate;
    private String shopOpenTime;
    private String shopCloseTime;
    private String ownerName;
}
