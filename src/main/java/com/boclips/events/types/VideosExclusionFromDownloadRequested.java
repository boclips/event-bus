package com.boclips.events.types;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VideosExclusionFromDownloadRequested {

    @NonNull
    private List<String> videoIds;
}
