package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class Player {

    static final String NAME = "Hilarious Deer";
    static final String VERSION = "Default Java folding player";
    private static BetRequestDto betRequestDto;

    public static int betRequest(JsonElement request) {
        try {
            System.out.println(request);
            Gson gson = new GsonBuilder().registerTypeAdapter(Rank.class, new RankAdapter()).create();
            betRequestDto = gson.fromJson(request, BetRequestDto.class);

//            if (firstDraw()) {
//                return handleFirstDraw();
//            }

            return 1000;

        }catch (Exception exc) {
            exc.printStackTrace();
        }
        return 1000;
    }

    private static boolean firstDraw(BetRequestDto betRequestDto) {

        return betRequestDto.getRound() == 0;
    }

//    private static boolean handleFirstDraw() {
//        if (pairOnHand()) {
//            return allIn();
//        }
//
//        if (bothCardsSum > 20)//10 10)
//            betMax1000 return false;
//
//
//        return 1000;
//    }

    private static boolean pairOnHand() {
//        return getCurrentPlayer().
        return false;
    }


    public static void showdown(JsonElement game) {
    }
}
