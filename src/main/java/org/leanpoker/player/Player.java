package org.leanpoker.player;

import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        BetRequestDto betRequestDto = new BetRequestDto();


//        if (firstDraw(betRequestDto)) {
//            return handleFirstDraw();
//        }


        return 1000;
    }

    private static boolean firstDraw(BetRequestDto betRequestDto) {

        return betRequestDto.getRound() == 0;
    }

//    private static boolean handleFirstDraw() {
//        if (pairOnHand) {
//            return true;
//        }
//
//        if (bothCardsSum > 20)//10 10)
//            betMax1000 return false;
//    }

    public static void showdown(JsonElement game) {
    }
}
