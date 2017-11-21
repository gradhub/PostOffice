package ru.myapp.PostOffice;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    Logger log;
    public Spy(Logger log){
        this.log=log;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailMessage) {
            if(((MailMessage) mail).from == "Austin Powers" || ((MailMessage) mail).to == "Austin Powers"){
                log.log(Level.WARNING,"Detected target mail correspondence: from {0} to {1} \"{2}\"",new Object[]{((MailMessage) mail).from,((MailMessage) mail).to,((MailMessage) mail).getMessage()});
            }
            else{
                log.log(Level.INFO,"Usual correspondence: from {0} to {1}",new Object[]{((MailMessage) mail).from, ((MailMessage) mail).to});
            }
        }
        return mail;
    }
}
