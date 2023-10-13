public class Macchina {
    
    //attributi
    private String marca;
    private String modello;
    private int codice;
    private String targa;
    private int numeroposti;


    
    //metodo costruttore
    public Macchina(String marca, String modello,int codice,String targa,int numeroposti){
        this.marca=marca;
        this.modello=modello;
        this.codice=codice;
        this.targa=targa;
        this.numeroposti=numeroposti;

        
    }
    
    public Macchina(){
        this.marca="";
        this.modello="";
        this.codice=0;
        this.targa="";
        this.numeroposti=0;

    }
    
    public Macchina(Macchina that){
        this.marca=that.marca;
        this.modello=that.modello;
        this.codice=that.codice;
        this.targa=that.targa;
        this.numeroposti=that.numeroposti;

    }
    
    
    //metodi get  
    public String getMarca(){
        return this.marca;
    }
    public String getModello(){
        return this.modello;
    }
    public int getCodice(){
        return this.codice;
    }
    public String getTarga(){
        return this.targa;
    }
    public int getNumeroposti(){
        return this.numeroposti;
    }


    
    //metodi set   
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModello(String modello){
        this.modello=modello;
    }
    public void setCodice(int codice){
        this.codice=codice;
    }
    public void setTarga(String targa){
        this.targa=targa;
    }
    public void setNumeroposti(int numeroposti){
        this.numeroposti=numeroposti;
    }
    
    
        
        public String toString(){
        return "Marca "+this.marca+" Modello "+this.modello+" codice "+this.codice+" targa "+this.targa+" numeroposti "+this.numeroposti;
    }
    
    
    public boolean equals(Macchina that){
       boolean r=false;
       if(this.marca==that.marca && this.modello==that.modello && this.codice==that.codice && this.targa==that.targa && this.numeroposti==that.numeroposti){
           r=true;
       }
       return r;
    }

}