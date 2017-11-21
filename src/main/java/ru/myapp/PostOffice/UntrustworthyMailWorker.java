package ru.myapp.PostOffice;
public class UntrustworthyMailWorker implements MailService {
    private RealMailService variable = new RealMailService();
    MailService[] input;
    public UntrustworthyMailWorker(MailService[] input) {
        this.input = new MailService[input.length];
        for(int i=0;i<input.length;i++) {
            this.input[i]=input[i];
        }
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for(int i=0;i<input.length;i++){
            mail = input[i].processMail(mail);
        }
        mail = new RealMailService().processMail(mail);
        return variable.processMail(mail);
    }

    public RealMailService getRealMailService(){
        return variable;
    }
}
