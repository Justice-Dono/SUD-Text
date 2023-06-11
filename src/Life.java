public class Life {
    private String name = "None";
    private String type = "None";
    private Integer health = 0;
    private Integer def = 0;
    private Integer Str = 0;
    private String Token = "L";

    public Life(){
    }

    public String getName() {
        return name;
    }

    public Integer getHealth(){
        return health;
    }

    public Integer getDef(){
        return def;
    }
    public Integer getStr(){
        return Str;
    }

    public String getToken(){
        return Token;
    }
    
    public String getType(){
        return type;
    }

    public void addHealth(Integer Health){
        health = health + Health;
    }

    public void addType(String Type){
        type = Type;
    }

    public void addDef(Integer Def){
        def = def + Def;
    }
    
    public void addToken(String localToken){
        Token = localToken;
    }

    public void addStr(Integer localStr){
        Str = Str + localStr;
    }

    public void addName(String localName){
        name = localName;
    }
}
