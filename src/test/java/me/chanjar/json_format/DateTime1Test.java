package me.chanjar.json_format;

import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { DateTime1Test.class, JacksonAutoConfiguration.class }, properties = {
    "spring.jackson.serialization.write_dates_as_timestamps=false",
//    "spring.jackson.deserialization.adjust_dates_to_context_time_zone=false"
})
public class DateTime1Test extends JsonFormatTestBase {

}
