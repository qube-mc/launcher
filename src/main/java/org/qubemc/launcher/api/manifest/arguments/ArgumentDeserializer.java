package org.qubemc.launcher.api.manifest.arguments;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.qubemc.launcher.api.manifest.Rules;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArgumentDeserializer extends StdDeserializer<Argument> {

    public ArgumentDeserializer() {
        this(null);
    }

    public ArgumentDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Argument deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        List<String> baseArguments = new ArrayList<>();
        List<Rules> ruleArguments = new ArrayList<>();
        for (int i = 0; i < jsonNode.size(); i++) {
            JsonNode currentNode = jsonNode.get(i);
            if (currentNode.isTextual()) {
                baseArguments.add(currentNode.asText());
            } else if (currentNode.isObject()) {
                ruleArguments.add(jsonParser.getCodec().treeToValue(currentNode, Rules.class));
            }
        }
        return new Argument(baseArguments, ruleArguments);
    }
}
