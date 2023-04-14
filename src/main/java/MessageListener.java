import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.RestAction;

public class MessageListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
//        System.out.println(event.getChannel().getName());
//        if(notBot(event)) {
//            RestAction<Message> action = event.getChannel().sendMessage("penis");
//            action.queue();
//        }


//        if (event.getChannel().getName().equals("league-log"))
//        {
//            event.getChannel().sendMessage("penis");
//        }
//        else
//        {
//            System.out.printf("[%s][%s] %s: %s\n", event.getGuild().getName(),
//                    event.getChannel().getName(), event.getMember().getEffectiveName(),
//                    event.getMessage().getContentDisplay());
//        }
    }

    public boolean notBot(MessageReceivedEvent event) {
        return !event.getAuthor().getName().equals("Annoy-O-Tron");
    }
}
