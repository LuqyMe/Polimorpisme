public class Fans {
    private String name;
    
    public Fans(){
        
    }
    
    public Fans (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void showName(){
        System.out.print(name);
    }
    
    public void watchingPerformances(){
        showName();
        System.out.print(": Melihat idolanya dari youtube\n");
    }
    
    public void watchingPerformances(Musician musician){
        System.out.print(""+name+": Melihat idolanya ");
        musician.perform();
    }    
}
