package org.leanpoker.player;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void testBetRequest() throws Exception {

        JsonElement jsonElement = new JsonParser().parse("{\"key1\": \"value1\", \"key2\": \"value2\"}");

        assertEquals(0, Player.betRequest(jsonElement));

    }

    @Test
    public void getCurrentPlayer() {
        Gson gson = new GsonBuilder().registerTypeAdapter(Rank.class, new RankAdapter()).create();
        BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/BetRequestWithPlayerCards.json")));

        //convert the json string back to object
        BetRequestDto obj = gson.fromJson(br, BetRequestDto.class);

        PlayerDto currentPlayer = obj.getCurrentPlayer();
        System.out.println(currentPlayer);
    }
}
