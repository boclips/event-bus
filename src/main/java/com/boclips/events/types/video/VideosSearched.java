package com.boclips.events.types.video;

import com.boclips.events.types.base.UserEvent;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VideosSearched extends UserEvent {

    @NonNull
    private String query;

    @NonNull
    private Integer pageIndex;

    @NonNull
    private Integer pageSize;

    @NonNull
    private Long totalResults;
}