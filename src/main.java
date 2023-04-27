package src;
using namespace std;

class characterr{
    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;
    // membuat constructor
    characteer(string nama, int heal, string weapon, int attackp, int mana){ 
        nama = nama;
        heal = heal; 
        weapon = weapon;
        attackP = attackp;
        mana = mana;
        print(nama);
    }
    void attack(){
        this.mana -=5a; 
        system.out.println(this.nama+" menyerang si sotong");
        // system.out.println("sotong terkena demage sebanyak "+this.attackP );

    }
    void demage(int attackP){
        system.out.println("ucup terkena demage sebanyak" + attackP);
        this.heal -= attackP;
    }
    void print(){
        system.out.println("nama: "+nama);  
        system.out.println("heal: "+ heal);
        system.out.println("weapon: "+weapon);
        system.out.println("attack power: " +attackkP);
        system.out.println("mana : " +mana);
    }
}
public class Main{
    public static void main(String[] args) {
        characterr character1 = new character("ucup",100,"pedang excalibur",5,100);
        character1.attack();
        character1.demage(10);
        character1.print();
    }
}
