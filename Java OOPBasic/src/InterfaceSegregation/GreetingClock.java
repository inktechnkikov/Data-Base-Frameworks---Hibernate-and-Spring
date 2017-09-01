package InterfaceSegregation;

public class GreetingClock {
   private TimeProvider provider;
   private Writer writer;

    public GreetingClock(TimeProvider provider,Writer writer){
        this.provider = provider;
        this.writer = writer;
    }

    public TimeProvider getProvider() {
        return this.provider;
    }

    public void setProvider(TimeProvider provider) {
        this.provider = provider;
    }

    public Writer getWriter() {
        return this.writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
    public void greeting(){
        if(this.provider.getHour() < 12){
            writer.printMsg("Good morning");
        }else if(this.provider.getHour() > 18){
            writer.printMsg("Good afternoon");
        }else{
            writer.printMsg("Good evening");
        }
    }
}
