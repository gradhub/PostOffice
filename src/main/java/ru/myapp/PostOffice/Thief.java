package ru.myapp.PostOffice;
public class Thief implements MailService {
    private int cen,sum=0;
    public Thief(int input){
        cen = input;
    }
    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage){
            if(((MailPackage) mail).getContent().getPrice()>=cen){
                sum+=((MailPackage) mail).getContent().getPrice();
                mail = new MailPackage(mail.getFrom(),mail.getTo(),new Package("stones instead of" + ((MailPackage) mail).getContent().getContent(),0));
            }
        }
        return mail;
    }

    public int getStolenValue(){
        return sum;
    }
}
