package entity;

import enums.MusicPlayer;
import enums.Phone;
import enums.WebBrowser;

public class iPhone implements MusicPlayer, Phone, WebBrowser {

    @Override
    public void playMusic() {
        System.out.println("Reproduzindo música no iPhone...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando música no iPhone...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando música no iPhone...");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Fazendo chamada para " + number + " no iPhone...");
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Recebendo chamada de " + number + " no iPhone...");
    }

    @Override
    public void endCall() {
        System.out.println("Encerrando chamada no iPhone...");
    }

    @Override
    public void openPage(String url) {
        System.out.println("Abrindo página: " + url + " no iPhone...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando página no iPhone...");
    }

    @Override
    public void bookmarkPage(String url) {
        System.out.println("Adicionando página aos favoritos: " + url + " no iPhone...");
    }


    public void useFaceID() {
        System.out.println("Usando Face ID no iPhone...");
    }

    public void takePicture() {
        System.out.println("Tirando uma foto com o iPhone...");
    }
}

