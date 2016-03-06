package org.leanpoker.player;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class BetRequestParseTest {

    @Test
    public void readJson() throws FileNotFoundException {

        Gson gson = new GsonBuilder().registerTypeAdapter(Rank.class, new RankAdapter()).create();
        BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/BetRequest.json")));

        //convert the json string back to object
        BetRequestDto obj = gson.fromJson(br, BetRequestDto.class);

    }
}
