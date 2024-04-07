package org.qubemc.launcher.api.manifest;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RulesDeserializer extends StdDeserializer<List<String>> {

    public RulesDeserializer() {
        this(null);
    }

    public RulesDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public List<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        List<String> values = new ArrayList<>();
        for (int i = 0; i < jsonNode.size(); i++) {
            JsonNode currentNode = jsonNode.get(i);
            if (currentNode.isTextual()) {
                values.add(currentNode.asText());
            }
        }
        return values;
    }

}
