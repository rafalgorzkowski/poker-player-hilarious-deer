package org.leanpoker.player;

public class BetRequestDto {

    private String tournament_id;
    private String game_id;
    private Integer round;
    private Integer bet_index;
    private Integer small_blind;
    private Integer orbits;
    private Integer dealer;
    private Integer current_buy_in;
    private Integer pot;

    public String getTournament_id() {
        return tournament_id;
    }

    public void setTournament_id(String tournament_id) {
        this.tournament_id = tournament_id;
    }

    public String getGame_id() {
        return game_id;
    }

    public void setGame_id(String game_id) {
        this.game_id = game_id;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getBet_index() {
        return bet_index;
    }

    public void setBet_index(Integer bet_index) {
        this.bet_index = bet_index;
    }

    public Integer getSmall_blind() {
        return small_blind;
    }

    public void setSmall_blind(Integer small_blind) {
        this.small_blind = small_blind;
    }

    public Integer getOrbits() {
        return orbits;
    }

    public void setOrbits(Integer orbits) {
        this.orbits = orbits;
    }

    public Integer getDealer() {
        return dealer;
    }

    public void setDealer(Integer dealer) {
        this.dealer = dealer;
    }

    public Integer getCurrent_buy_in() {
        return current_buy_in;
    }

    public void setCurrent_buy_in(Integer current_buy_in) {
        this.current_buy_in = current_buy_in;
    }

    public Integer getPot() {
        return pot;
    }

    public void setPot(Integer pot) {
        this.pot = pot;
    }
}
