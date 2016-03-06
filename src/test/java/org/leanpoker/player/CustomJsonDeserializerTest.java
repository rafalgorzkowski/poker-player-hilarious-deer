/*
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

package org.leanpoker.player;

import java.lang.annotation.ElementType;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * //TODO javadocs
 */
public class CustomJsonDeserializerTest {

    @Test
    public void deserialize() {
        //given
        Gson gson = new GsonBuilder().registerTypeAdapter(Rank.class, new RankAdapter()).create();

        //when
        RankTest result = gson.fromJson("{ rank : '2'}", RankTest.class);

        //then
        assertThat(result.rank, is(equalTo(Rank._2)));
    }

    protected static class RankAdapter implements JsonDeserializer<Rank> {
        @Override
        public Rank deserialize(JsonElement json, java.lang.reflect.Type classOfT, JsonDeserializationContext context)
                throws JsonParseException {
            String asString = json.getAsString();
            return asString.matches("\\d+") ? Rank.valueOf("_" + asString) : Rank.valueOf(asString);
        }
    }

    private static class RankTest {
        Rank rank;

        public Rank getRank() {
            return rank;
        }

        public void setRank(Rank rank) {
            this.rank = rank;
        }
    }
}
