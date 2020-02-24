package com.slack.api.app_backend.events.handler;

import com.slack.api.app_backend.events.EventHandler;
import com.slack.api.app_backend.events.payload.UserResourceGrantedPayload;
import com.slack.api.model.event.UserResourceGrantedEvent;

public abstract class UserResourceGrantedHandler extends EventHandler<UserResourceGrantedPayload> {

    @Override
    public String getEventType() {
        return UserResourceGrantedEvent.TYPE_NAME;
    }
}
