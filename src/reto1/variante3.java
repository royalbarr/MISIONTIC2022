public class Autobus{
    //Inserte acá los atributos
    
    private String nombreConductor;
    private int nPasajeros;
    private double cantidadDinero;
    private int nMaximoPasajeros;
    private double localizacionX;
    private double localizacionY;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado;
    private boolean motorEncendido;
    private boolean wifiEncendido;
    private boolean enMarcha;
    
    //Inserte acá el método constructor
    public Autobus(String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta){
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;
        
        this.aireAcondicionadoActivado = false;
        this.motorEncendido = false;
        this.wifiEncendido = false;
        this.enMarcha = false;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void recogerPasajero (int estrato){
        if(this.enMarcha == false && this.puertaAbierta == true && this.nPasajeros < this.nMaximoPasajeros){
            if(estrato >=0 && estrato <=2) {
                this.cantidadDinero += 1500;
            }else if(estrato >=3 && estrato <=4) {
                this.cantidadDinero += 2600;
            }else if(estrato >=5 && estrato <=6) {
                this.cantidadDinero += 3000;
            }
            this.nPasajeros ++;
            
            }
                
    }
        
    public void dejarPasajero (){
        if(this.enMarcha == false && this.puertaAbierta == true && this.nPasajeros >0) {
            this.nPasajeros --;
        }
    }
    
    public double calcularDistanciaAcopio (){
        return Math.sqrt(Math.pow(this.localizacionX,2)+ Math.pow(localizacionY,2));
    }
    
    public void gestionarPuerta () {
        if(! this.enMarcha) {
            this.puertaAbierta = !this.puertaAbierta;
        }
    }
    
    public void gestionarAireAcondicionado () {
       
        }
    }
    
    public void gestionarMotor () {
       
        }
    }
    
     public void gestionarWifi (){
        
     }
    
    public void gestionarMarcha (){
        if(this.motorEncendido && !this.puertaAbierta){
            this.enMarcha =! this.enMarcha;
        }
    }
    
    public void moverDerecha (double d) {
        if(this.motorEncendido && this.enMarcha){
            this.localizacionX += d;
        }
    }
    
    public void moverIzquierda (double d){
        if(this.motorEncendido && this.enMarcha){
            this.localizacionX -= d;
        }
    }
    
    public void moverArriba (double d){
        if(this.motorEncendido && this.enMarcha){
            this.localizacionY += d;
        }
    }
    
    public void moverAbajo (double d){
        if(this.motorEncendido && this.enMarcha){
            this.localizacionY -= d;
        }
    }
    
    //Inserte acá los SETTERS Y GETTERS
    
    public String getNombreConductor(){
        return nombreConductor;
    }
    
    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }
    
    public int getnPasajeros(){
        return nPasajeros;
    }
        
    public void setnPasajeros(int nPasajeros){
        this.nPasajeros = nPasajeros;
    }
    
    public double getCantidadDinero() {
        return cantidadDinero;
    }
    
    public void setCantidadDinero(double cantidadDinero){
        this.cantidadDinero = cantidadDinero;
    }
    
    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }
    
    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
    
    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }
    
    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
    
    
    
 }
