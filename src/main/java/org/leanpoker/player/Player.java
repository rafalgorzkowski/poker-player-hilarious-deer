package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.util.List;

public class Player {

    static final String NAME = "Hilarious Deer";
    static final String VERSION = "1.1";
    private static BetRequestDto betRequestDto;

    public static int betRequest(JsonElement request) {
        try {
            System.out.println(request);
            Gson gson = new GsonBuilder().registerTypeAdapter(Rank.class, new RankAdapter()).create();
            betRequestDto = gson.fromJson(request, BetRequestDto.class);

            if (firstDraw()) {
                return handleFirstDraw();
            }

            return 0;

        }catch (Exception exc) {
            exc.printStackTrace();
        }
        return 1000;
    }

    private static boolean firstDraw() {
        return betRequestDto.getRound() == 0;
    }

    private static int handleFirstDraw() {
        if (pairOnHand()) {
            return allIn();
        }

        int bothCardsSum = cards().stream().mapToInt(cardDto -> cardDto.getRank().getValue()).sum();
        if (bothCardsSum > 20) {
            return allIn();
        }

        return 0;
    }

    private static int allIn() {
        return betRequestDto.getCurrentPlayer().getStack();
    }

    private static boolean pairOnHand() {
        List<CardDto> hole_cards = cards();
        Rank firstCardRank = hole_cards.get(0).getRank();
        return hole_cards.stream().filter(firstCardRank::equals).count() == 2;
    }

    private static List<CardDto> cards() {
        return betRequestDto.getCurrentPlayer().getHole_cards();
    }


    public static void showdown(JsonElement game) {
    }
}
