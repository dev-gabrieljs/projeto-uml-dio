import entity.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();


        meuIphone.playMusic();
        meuIphone.pauseMusic();
        meuIphone.stopMusic();


        meuIphone.makeCall("123456789");
        meuIphone.receiveCall("987654321");
        meuIphone.endCall();


        meuIphone.openPage("https://www.google.com");
        meuIphone.refreshPage();
        meuIphone.bookmarkPage("https://www.google.com");


        meuIphone.useFaceID();
        meuIphone.takePicture();
    }
}
