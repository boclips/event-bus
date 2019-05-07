package com.boclips.events.config;

import org.junit.jupiter.api.Test;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.config.BindingProperties;
import org.springframework.cloud.stream.config.BindingServiceProperties;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoclipsMessagingConfigurationTest {

    @Test
    void configuresTopicChannels() {
        BindingServiceProperties properties = new BoclipsMessagingConfiguration("some-service").forContext(MessagingContext.class);

        BindingProperties topicProperties = properties.getBindings().get("analysed-videos-topic");

        assertThat(topicProperties.getDestination()).isEqualTo("analysed-videos");
        assertThat(topicProperties.getGroup()).isNull();
    }

    @Test
    void configuresSubscriptionChannels() {
        BindingServiceProperties properties = new BoclipsMessagingConfiguration("some-service").forContext(MessagingContext.class);

        BindingProperties topicProperties = properties.getBindings().get("videos-to-analyse-subscription");

        assertThat(topicProperties.getDestination()).isEqualTo("videos-to-analyse");
        assertThat(topicProperties.getGroup()).isEqualTo("some-service");
    }

    @Test
    void throwsIfContextClassNotAnnotatedWithEnableBinding() {
        assertThrows(Exception.class, () -> new BoclipsMessagingConfiguration("some-service").forContext(InvalidContext.class));
    }

    @Test
    void throwsIfGroupIsEmpty() {
        assertThrows(Exception.class, () -> new BoclipsMessagingConfiguration("").forContext(MessagingContext.class));
    }

    static class InvalidContext {
    }

    @EnableBinding({Topics.class, Subscriptions.class})
    public static class MessagingContext {

    }

    interface Topics {
        @Output("analysed-videos-topic")
        MessageChannel analysedVideos();
    }

    interface Subscriptions {
        @Input("videos-to-analyse-subscription")
        SubscribableChannel videosToAnalyse();
    }
}