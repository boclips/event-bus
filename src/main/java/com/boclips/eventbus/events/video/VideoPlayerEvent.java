package com.boclips.eventbus.events.video;

import com.boclips.eventbus.events.base.AbstractEvent;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VideoPlayerEvent extends AbstractEvent {

    @NonNull
    private String videoId;

    private String userId;

    private String externalUserId;

    private String deviceId;

    private String query;

}
