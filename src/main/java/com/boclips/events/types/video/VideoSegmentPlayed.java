package com.boclips.events.types.video;

import com.boclips.events.types.base.VideoPlayerEvent;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VideoSegmentPlayed extends VideoPlayerEvent {

    private Integer videoIndex;

    @NonNull
    private Long segmentStartSeconds;

    @NonNull
    private Long segmentEndSeconds;

}
