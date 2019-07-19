package com.boclips.events.types.video;

import com.boclips.events.types.TimeSegment;
import lombok.*;

import java.util.List;
import java.util.Locale;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class VideoAnalysedKeyword {
    @NonNull
    Double confidence;
    @NonNull
    List<TimeSegment> segments;
    @NonNull
    private String name;
    @NonNull
    private Locale language;
}
