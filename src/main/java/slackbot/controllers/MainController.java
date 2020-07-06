package slackbot.controllers;

import com.slack.api.bolt.App;
import com.slack.api.bolt.servlet.SlackAppServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/slack/events")
public class MainController  extends SlackAppServlet {

    public MainController(App app) {
        super(app);
    }
}
