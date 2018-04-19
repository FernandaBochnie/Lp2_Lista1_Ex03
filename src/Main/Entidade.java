

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Entidade {
    private int Ano;
    private int Idade;
    private String Votar;
    private String Dirigir;   

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public int getIdade() {
        Idade = 2018-Ano;
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getVotar() {
        if (Idade >= 16) {
            Votar="Sim";
        }
        else{
            Votar="Não";
        }
        return Votar;
    }

    public void setVotar(String Votar) {
        this.Votar = Votar;
    }

    public String getDirigir() {
        if (Idade >=18) {
            Votar="Sim";
        }
        else{
            Votar="Não";
        }
        return Votar;
    }

    public void setDirigir(String Dirigir) {
        this.Dirigir = Dirigir;
    }
    
}
