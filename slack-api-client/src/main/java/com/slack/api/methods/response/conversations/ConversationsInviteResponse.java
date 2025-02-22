package com.slack.api.methods.response.conversations;

import com.slack.api.methods.SlackApiTextResponse;
import com.slack.api.model.Conversation;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ConversationsInviteResponse implements SlackApiTextResponse {

    private boolean ok;
    private String warning;
    private String error;
    private List<Error> errors;
    private String needed;
    private String provided;
    private transient Map<String, List<String>> httpResponseHeaders;

    private Conversation channel;

    @Data
    public static class Error {
        private boolean ok;
        private String error;
    }
}
