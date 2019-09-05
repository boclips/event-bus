package com.boclips.eventbus.events.video;

import com.boclips.eventbus.events.base.AbstractUserEvent;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VideoPlayerEvent extends AbstractUserEvent {

    @NonNull
    private String playerId;

    @NonNull
    private String videoId;

    private String playbackDevice;

}
