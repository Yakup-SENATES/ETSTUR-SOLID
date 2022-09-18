package com.ets.solid.DependencyInversion.negative;

public class Notification {


    private Email email = new Email();
    private Sms sms = new Sms();

    public void sender() {
        email.sendEmail("Hello");
        sms.sendSms("Hello");
    }

    /*
    Notification sınıfımız yüksek seviye bir sınıf olmasına rağmen
    daha düşük seviyeli olan Email ve SMS sınıflarına bağımlı halde.
    Sms ve Email sınıflarında yada metodlarındaki değişimler direkt olarak
    notification sınıfını da etkileyecektir. Yeni bir module eklendiğinde de
    notification sınıfımızda değişiklik yapmak zorunda kalacağız.
    Bu durumda Dependency Inversion prensibine aykırı hareket etmiş olduk.
    */
}
