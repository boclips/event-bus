package com.boclips.eventbus.events.order;

import com.boclips.eventbus.BoclipsEvent;
import com.boclips.eventbus.events.base.AbstractEvent;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@BoclipsEvent("order-created")
public class OrderCreated extends AbstractEvent {

    @NonNull
    private Order order;
}
