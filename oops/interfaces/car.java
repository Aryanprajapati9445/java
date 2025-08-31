package interfaces;

public class car {
    private engine new_engine;
    private media player= new CDplayer();
public car(){
 System.out.println("specify a engine type");   
}
public car(engine e){
    this.new_engine = e;
}
public void start(){
    this.new_engine.start();
}
public void stop(){
    this.new_engine.stop();
}
public void startmusic(){
    this.player.start();
}
public void stopmusic(){
    this.player.stop();
}
}



   


