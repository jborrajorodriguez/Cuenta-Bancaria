
package ejemplo.cuenta.bancaria;
//Autor:Juan Borrajo Rodriguez

import java.util.Scanner;


public class EjemploCuentaBancaria {

  /*
  Codifica un programa para gerstionar una cuenta bancaria.
  Para iso crea unha clase conta con tres atributos:nome,numero de conta e saldo.
  Constructores con parametros.
  Metodos de acceso para o numero de conta,metodo para recibir o nome da conta e para mudar o saldo.
  Metodo que reciba unha cantidad de cartos,e os ingrese na nosa conta e devolva o saldo final.
  Metodo que reciba unha cantidad de cartos e os retire da nosa conta devolvento o saldo real(ainda que non teña cartos na conta o banco mos dá e o saldo queda en negativo)
   
*/
    public static void main(String[] args) {
        //pedir el nome,numero de conta e saldo por teclado.
        Scanner teclado=new Scanner(System.in);
        Conta libreta1=new Conta();//instanciamos un objecto.
        //System.out.println(libreta1.toString());
        libreta1.setSaldo(10000000);
        libreta1.setnumero_de_conta("IBAM:4568421");
        //System.out.println(libreta1.toString());
        //creamos unha conta con el constructor con parametros.nome=ANA,numero de conta 22222,saldo 5000
        Conta libreta2=new Conta("Ana","22222",5000);//creamos otro objecto.
        //System.out.println(libreta2.toString());
        libreta2.setnumero_de_conta("1234");
        //System.out.println(libreta2.toString());
        System.out.println("Nome : ");
        String nome = teclado.nextLine();
        System.out.println("Numero de Cuenta : ");
        String numero_de_cuenta = teclado.next();
        System.out.println("Cantidad de Saldo");
        double saldo=teclado.nextDouble();
        Conta libreta3=new Conta(nome,numero_de_cuenta,saldo);
        System.out.println(libreta3.toString());
        //libreta3.ingreso(3000);
        //System.out.println(libreta3.toString());
        System.out.println("total = "+libreta3.ingreso(3000));
        libreta3.retirada(2222000);
        System.out.println(libreta3.toString());
        //System.out.println(libreta3.retirada(System.out.printn(""))+"Total = ";
        libreta3.anularConta();
        System.out.println(libreta3.toString());
     
    }
    
}
