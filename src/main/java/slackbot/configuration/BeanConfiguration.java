package slackbot.configuration;

import com.slack.api.bolt.App;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public App initSlackApp() {
        App app = new App();
        app.command("/greetings", (req, ctx) -> ctx.ack("Hi there!"));
        return app;
    }
}


