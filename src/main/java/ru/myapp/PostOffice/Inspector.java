package ru.myapp.PostOffice;
public class Inspector implements MailService{
    public Inspector(){

    }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage){
            if(((MailPackage) mail).getContent().getContent()=="weapons" || ((MailPackage) mail).getContent().getContent()=="banned substance"){
                throw new IllegalPackageException("Terrorist");
            }
            if(((MailPackage) mail).getContent().getContent().contains("stones")){
                throw  new StolenPackageException();
            }
        }
        return mail;
    }
}
