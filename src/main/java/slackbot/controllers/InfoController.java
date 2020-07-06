package slackbot.controllers;

import com.slack.api.methods.SlackApiException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slack.api.Slack;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;

import java.io.IOException;

@RestController
public class InfoController {
    @GetMapping("/info")
    public String getInfo() throws IOException, SlackApiException {


        String channelId = "C016PG0BQUC";
        String text = ":wave: Hi from a bot written in Java!";

        Slack slack = Slack.getInstance();
        String token = System.getenv("SLACK_TOKEN");

        ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req
                .channel(channelId)
                .text(text)
        );

        return "Sent";
    }
}
