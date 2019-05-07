package com.boclips.events.types;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

class AnalysedVideoTest extends TestWithJsonFixture {
    @Test
    void objectMapperCanParseJsonIntoAnalysedVideo() throws IOException {
        String json = loadExample("analysed-video.json");

        AnalysedVideo analysedVideo = new ObjectMapper().readValue(json, AnalysedVideo.class);

        assertThat(analysedVideo.getLanguage()).isEqualTo(Locale.US);
        assertThat(analysedVideo.getTopics().get(0).getName()).isEqualTo("child topic");
        assertThat(analysedVideo.getTopics().get(0).getParent().getName()).isEqualTo("parent topic");
        assertThat(analysedVideo.getCaptions().getAutoGenerated()).isTrue();
        assertThat(analysedVideo.getCaptions().getLanguage()).isEqualTo(Locale.forLanguageTag("pl-PL"));
    }
}