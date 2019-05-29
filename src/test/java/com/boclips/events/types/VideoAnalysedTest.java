package com.boclips.events.types;

import com.boclips.events.types.video.VideoAnalysed;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

class VideoAnalysedTest extends TestWithJsonFixture {
    @Test
    void objectMapperCanParseJsonIntoAnalysedVideo() throws IOException {
        String json = loadExample("analysed-video.json");

        VideoAnalysed videoAnalysed = new ObjectMapper().readValue(json, VideoAnalysed.class);

        assertThat(videoAnalysed.getLanguage()).isEqualTo(Locale.US);
        assertThat(videoAnalysed.getTopics().get(0).getName()).isEqualTo("child topic");
        assertThat(videoAnalysed.getTopics().get(0).getParent().getName()).isEqualTo("parent topic");
        assertThat(videoAnalysed.getCaptions().getAutoGenerated()).isTrue();
        assertThat(videoAnalysed.getCaptions().getLanguage()).isEqualTo(Locale.forLanguageTag("pl-PL"));
    }
}