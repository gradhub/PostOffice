package ru.myapp.PostOffice;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("ClassA");
        MailService[] in = new MailService[3];
        in[0]=new Spy(log);
        in[1]=new Thief(10);
        in[2]=new Inspector();
        UntrustworthyMailWorker tt = new UntrustworthyMailWorker(in);
        //tt.processMail(new MailMessage("Austin Powers","Mne","gdfgdg"));
        //tt.processMail(new MailPackage("Austin Powers","ne mne",new Package("jdgjd",100)));
        //AbstractSendable A = new MailMessage("","","");
        //MailService M = new Spy();
    }
}
