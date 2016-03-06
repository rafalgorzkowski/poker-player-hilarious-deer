package org.leanpoker.player;/*
 * This document set is the property of GTECH Corporation, West Greenwich,
 * Rhode Island, and contains confidential and trade secret information.
 * It cannot be transferred from the custody or control of GTECH except as
 * authorized in writing by an officer of GTECH. Neither this item nor
 * the information it contains can be used, transferred, reproduced, published,
 * or disclosed, in whole or in part, directly or indirectly, except as
 * expressly authorized by an officer of GTECH, pursuant to written agreement.
 *
 * Copyright 2016 GTECH Corporation. All Rights Reserved.
 */

public enum Rank {
    J(11),
    Q(12),
    K(13),
    A(14),
    _2(2),
    _3(3),
    _4(4),
    _5(5),
    _6(6),
    _7(7),
    _8(8),
    _9(9),
    _10(10);


    private final int value;

    Rank(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
