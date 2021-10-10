package com.bot.slack.slackevents.controller;

import com.bot.slack.slackevents.Constants.SlackConstants;
import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController()
public class SlackController {


    public SlackController()   {
    }

    // slack initialization
    Slack slack = Slack.getInstance();
    String token = SlackConstants.SLACK_TOKEN;

    @GetMapping("/")
    public String init() throws IOException, SlackApiException{

        // Initialize an API Methods client with the given token
        MethodsClient methods = slack.methods(token);
        // Build a request object
        ChatPostMessageRequest request = ChatPostMessageRequest.builder()
                .channel("#serviceurl-bot")
                .text(":wave: Hi from a bot written in Java!")
                .build();
        ChatPostMessageResponse response = methods.chatPostMessage(request);
        System.out.println(response.toString());
        return "Hello , wanna book a movie ticket:...";
    }

}
