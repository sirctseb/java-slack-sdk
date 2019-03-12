package com.github.seratch.jslack.api.model.block.composition;

import lombok.*;

/**
 * https://api.slack.com/reference/messaging/composition-objects#text
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class PlainTextObject extends TextObject {
    private final String type = "plain_text";
    private String text;

    /**
     * The documentation of the Slack API states that the verbatim field is optional.
     * The API examples always render the emoji field (as true, but that is its default value) -- so that is not helpful.
     * I picked the Boolean because basically you have 3 possible states:
     * - true
     * - false
     * - not present (and therefore not rendered in the resulting JSON sent to the Slack API)
     */
    private Boolean emoji;
}
