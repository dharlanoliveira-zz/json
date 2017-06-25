import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

import java.util.List;

public class Transformar {

    public static void main(String[] args) {
        List<Object> specs = JsonUtils.classpathToList("/spec.json");
        Chainr chainr = Chainr.fromSpec(specs);

        Object inputJSON = JsonUtils.classpathToObject("/rascunho.json");
        Object transformedOutput = chainr.transform(inputJSON);
        System.out.println(JsonUtils.toPrettyJsonString(transformedOutput));
    }


}
