package org.leanpoker.player;

import java.util.List;

public class PlayerDto {
    private String name;
    private Integer stack;
    private Integer bet;
    private List<CardDto> hole_cards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStack() {
        return stack;
    }

    public void setStack(Integer stack) {
        this.stack = stack;
    }

    public Integer getBet() {
        return bet;
    }

    public void setBet(Integer bet) {
        this.bet = bet;
    }

    public List<CardDto> getHole_cards() {
        return hole_cards;
    }

    public void setHole_cards(List<CardDto> hole_cards) {
        this.hole_cards = hole_cards;
    }
}
