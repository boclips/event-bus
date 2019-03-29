import com.boclips.eventtypes.AnalysedVideo;
import com.boclips.eventtypes.VideoToAnalyse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class AnalysedVideoTest {

    @Test
    public void objectMapperCanParseJsonIntoAnalysedVideo() throws IOException {

        String json = loadExample();

        AnalysedVideo analysedVideo = new ObjectMapper().readValue(json, AnalysedVideo.class);

        assertThat(analysedVideo.getTopics().get(0).getValue().getName()).isEqualTo("child topic");
        assertThat(analysedVideo.getTopics().get(0).getValue().getParent().getName()).isEqualTo("parent topic");
    }

    private String loadExample() throws IOException {
        try(InputStream stream = getClass().getClassLoader().getResourceAsStream("analysed-video.json")) {
            try(InputStreamReader reader = new InputStreamReader(stream)) {
                try(BufferedReader bufferedReader = new BufferedReader(reader)) {
                    return bufferedReader.lines().collect(Collectors.joining());
                }
            }
        }
    }
}