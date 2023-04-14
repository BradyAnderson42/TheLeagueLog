import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.channel.Channel;
import net.dv8tion.jda.internal.JDAImpl;

public class LeagueLog {
    JDA jda = JDABuilder.createDefault("Njc3NjcwMDc0NzE4NDg2NTMx.XkX40g.8UjlPEdZMukFgTeQMSc0H2IpFNg")
            .addEventListeners(new MessageListener())
            .build();
    jda.awaitReady();
    Channel leagueLog = jda.getPrivateChannelById("league-log");
}
