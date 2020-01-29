package com.slack.api.methods.response.conversations;

import com.slack.api.methods.SlackApiResponse;
import lombok.Data;

@Data
public class ConversationsLeaveResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private boolean notInChannel;
}