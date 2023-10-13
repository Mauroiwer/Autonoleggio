public class Cliente {
    
    //attributi
    private String nome;
    private String cognome;
    private int eta;
    private char patente;



    
    //metodo costruttore
    public Cliente(String nome, String cognome,int eta,char patente){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.patente=patente;


        
    }
    
    public Cliente(){
        this.nome="";
        this.cognome="";
        this.eta=0;
        this.patente='';


    }
    
    public Cliente(Cliente that){
        this.nome=that.nome;
        this.cognome=that.cognome;
        this.eta=that.eta;
        this.patente=that.patente;


    }
    
    
    //metodi get  
    public String getnome(){
        return this.nome;
    }
    public String getcognome(){
        return this.cognome;
    }
    public int geteta(){
        return this.eta;
    }
    public char getpatente(){
        return this.patente;
    }


    
    //metodi set   
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public void setEta(int eta){
        this.eta=eta;
    }
    public void setpatente(char patente){
        this.patente=patente;
    }

    
    
        
        public String toString(){
        return "nome "+this.nome+" cognome "+this.cognome+" eta "+this.eta+" patente "+this.patente;
    }
    
    
    public boolean equals(Cliente that){
       boolean r=false;
       if(this.nome==that.nome && this.cognome==that.cognome && this.eta==that.eta && this.patente==that.patente){
           r=true;
       }
       return r;
    }

}