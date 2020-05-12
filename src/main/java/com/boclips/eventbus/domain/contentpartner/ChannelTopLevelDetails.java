package com.boclips.eventbus.domain.contentpartner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Locale;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChannelTopLevelDetails {
    private List<String> contentType;

    private List<String> contentCategories;

    private Locale language;

    private String hubspotId;

    private String contractId;

    private String awards;

    private String notes;
}