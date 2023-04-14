package leaguelog.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.channel.Channel;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.internal.JDAImpl;

import java.util.Optional;

public class LeagueLog {
    private static final String TOKEN = "";

    JDA jda;
    TextChannel leagueLog;

    public LeagueLog() {
        jda = JDABuilder.createDefault(TOKEN)
                .addEventListeners(new leaguelog.bot.MessageListener())
                .build();
        try {
            jda.awaitReady();
        } catch (Exception e) {

        }
        Optional<TextChannel> leagueLogOptional = jda.getGuildsByName("Dylan", false).get(0).getTextChannels().stream().filter(textChannel -> textChannel.getName().equals("league-log")).findFirst();
        if (leagueLogOptional.isPresent()) {
            leagueLog = leagueLogOptional.get();
        } else {
            System.exit(-1);
        }
        leagueLog.sendMessage("Hello World!").queue();
    }

}
