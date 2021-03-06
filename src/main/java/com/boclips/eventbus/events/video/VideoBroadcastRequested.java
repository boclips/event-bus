package com.boclips.eventbus.events.video;

import com.boclips.eventbus.BoclipsEvent;
import com.boclips.eventbus.domain.video.Video;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@BoclipsEvent("video-broadcast-requested")
public class VideoBroadcastRequested {

    @NonNull
    private Video video;
}
