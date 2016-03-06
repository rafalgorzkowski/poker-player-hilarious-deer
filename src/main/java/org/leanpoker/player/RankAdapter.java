package org.leanpoker.player;


import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

class RankAdapter implements JsonDeserializer<Rank> {
    @Override
    public Rank deserialize(JsonElement json, java.lang.reflect.Type classOfT, JsonDeserializationContext context)
            throws JsonParseException {
        String asString = json.getAsString();
        return asString.matches("\\d+") ? Rank.valueOf("_" + asString) : Rank.valueOf(asString);
    }
}