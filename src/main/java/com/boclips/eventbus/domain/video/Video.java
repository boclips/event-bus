package com.boclips.eventbus.domain.video;

import com.boclips.eventbus.domain.AgeRange;
import com.boclips.eventbus.domain.Subject;
import com.boclips.eventbus.domain.contentpartner.ContentPartnerId;
import lombok.*;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    @NonNull
    private VideoId id;

    @NonNull
    private String title;

    @NonNull
    @Deprecated
    private ContentPartner contentPartner;

    private ContentPartnerId channelId;

    @NonNull
    private List<Subject> subjects;

    @NonNull
    private AgeRange ageRange;

    @NonNull
    private PlaybackProviderType playbackProviderType;

    @NonNull
    private Integer durationSeconds;

    @NonNull
    private VideoType type;

    private LocalDate releasedOn;

    @NonNull
    private ZonedDateTime ingestedAt;

    private Dimensions originalDimensions;

    private List<VideoAsset> assets;
}
