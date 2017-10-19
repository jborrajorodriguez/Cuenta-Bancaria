
package ejemplo.cuenta.bancaria;

public class Conta {
    private String nome,numero_de_conta;
    private double saldo;
    //constructor
    public Conta(){
        
    }
    public Conta(String nom,String num,double saldo){
        nome=nom;
        numero_de_conta=num;
        this.saldo=saldo;
    }
    //Metodos de acceso
    public void setnumero_de_conta(String num){
        numero_de_conta=num;
    }
    public String getnumero_de_conta(){
        return numero_de_conta;
    }
    public String getnome(){
        return nome;
    }
    //modifica el valor puesto en el constructor.
    public void setSaldo(double mudarSaldo){
        saldo=mudarSaldo;
    }
    //metodo para añadir cartos e que devolva o saldo da conta
    public double ingreso(double ingreso){
        //saldo=(saldo+ingreso);
        saldo+=ingreso;
        return saldo;
    }
    //metodo para retirar dinero e que devolva o saldo da conta
    public double retirada(double retirada){
        //saldo =(saldo-retirada);
        saldo-=retirada;
        return saldo;
    }
    
}
