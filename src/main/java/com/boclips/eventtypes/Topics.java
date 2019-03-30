package com.boclips.eventtypes;

public abstract class Topics {
    private final static String TOPIC_SUFFIX = "-topic";
    private final static String SUBSCRIPTION_SUFFIX = "-subscription";

    private static final String VIDEOS_TO_ANALYSE = "videos-to-analyse";
    public static String VIDEOS_TO_ANALYSE_TOPIC = Topics.VIDEOS_TO_ANALYSE + TOPIC_SUFFIX;
    public static String VIDEOS_TO_ANALYSE_SUBSCRIPTION = Topics.VIDEOS_TO_ANALYSE + SUBSCRIPTION_SUFFIX;

    private static final String ANALYSED_VIDEO_IDS = "analysed-video-ids";
    public static String ANALYSED_VIDEO_IDS_TOPIC = Topics.ANALYSED_VIDEO_IDS + TOPIC_SUFFIX;
    public static String ANALYSED_VIDEO_IDS_SUBSCRIPTION = Topics.ANALYSED_VIDEO_IDS + SUBSCRIPTION_SUFFIX;

    private static final String ANALYSED_VIDEOS = "analysed-videos";
    public static String ANALYSED_VIDEOS_TOPIC = Topics.ANALYSED_VIDEOS + TOPIC_SUFFIX;
    public static String ANALYSED_VIDEOS_SUBSCRIPTION = Topics.ANALYSED_VIDEOS + SUBSCRIPTION_SUFFIX;
}
