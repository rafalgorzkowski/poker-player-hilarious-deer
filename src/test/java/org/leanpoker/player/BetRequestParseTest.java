package org.leanpoker.player;


import com.google.gson.Gson;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class BetRequestParseTest {

    @Test
    public void readJson() throws FileNotFoundException {

        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/BetRequest.json")));

        //convert the json string back to object
        BetRequestDto obj = gson.fromJson(br, BetRequestDto.class);

    }
}
