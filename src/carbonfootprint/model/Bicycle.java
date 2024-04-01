package carbonfootprint.model;

import carbonfootprint.interfaces.ICarbonFootPrint;

public class Bicycle implements ICarbonFootPrint{
    
    // total da emissao de carbono emitido durante a fabricação da bicicleta
    private double emissao_carbono_fabricacao;
    // total da emissao de carbono emitido no transporte dos componentes da bicicleta
    private double emissao_carbono_transporte;
    //armazenar o resultado das pegadas de carbono do objeto
    private double pegadas_carbono;
    //nome da instancia
    private String nome;
    
    public Bicycle(String nome){        
        this.nome = nome;
        System.out.println("Analisando as pegadas de carbono da bicicleta " + nome);        
    }

    public String getNome() {
        return nome;
    }    
    
    @Override
    public double getCarbonFootPrint() {
        pegadas_carbono = emissao_carbono_fabricacao + emissao_carbono_transporte;
        System.out.println("Total de pegadas de carbono da bicicleta " + nome + " = " + pegadas_carbono + " kg CO2eq");
                
        return pegadas_carbono;       
    }

    public double getEmissao_carbono_fabricacao() {
        return emissao_carbono_fabricacao;
    }

    public void setEmissao_carbono_fabricacao(double emissao_carbono_fabricacao) {
        this.emissao_carbono_fabricacao = emissao_carbono_fabricacao;
    }

    public double getEmissao_carbono_transporte() {
        return emissao_carbono_transporte;
    }

    public void setEmissao_carbono_transporte(double emissao_carbono_transporte) {
        this.emissao_carbono_transporte = emissao_carbono_transporte;
    }

    public double getPegadas_carbono() {
        return pegadas_carbono;
    }

    public void setPegadas_carbono(double pegadas_carbono) {
        this.pegadas_carbono = pegadas_carbono;
    }
    
    
    
    
}
