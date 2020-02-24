package com.slack.api.app_backend.events.handler;

import com.slack.api.app_backend.events.EventHandler;
import com.slack.api.app_backend.events.payload.DndUpdatedUserPayload;
import com.slack.api.model.event.DndUpdatedUserEvent;

public abstract class DndUpdatedUserHandler extends EventHandler<DndUpdatedUserPayload> {

    @Override
    public String getEventType() {
        return DndUpdatedUserEvent.TYPE_NAME;
    }
}
