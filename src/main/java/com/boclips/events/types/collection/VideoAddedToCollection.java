package com.boclips.events.types.collection;

import com.boclips.events.types.base.CollectionEvent;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VideoAddedToCollection extends CollectionEvent {

    @NonNull
    private String videoId;
}