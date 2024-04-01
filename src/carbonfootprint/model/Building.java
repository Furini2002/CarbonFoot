package carbonfootprint.model;

import carbonfootprint.interfaces.ICarbonFootPrint;

public class Building implements ICarbonFootPrint {
    
    //O quanto de carbono o predio emite para se manter 
    private double emissao_carbono_operacao;
    //O quanto de carbono foi emitido durante sua construção
    private double emissao_carbono_construcao;
    // armazenar o resultado das pegadas de carbono do objeto
    private double pegadas_carbono;
    //nome da instancia
    private String nome;
    
    public Building(String nome){        
        this.nome = nome;
        System.out.println("Analisando as pegadas de carbono do edifício " + nome);        
    }

    public String getNome() {
        return nome;
    }    

    @Override
    public double getCarbonFootPrint() {
        pegadas_carbono = emissao_carbono_construcao + emissao_carbono_operacao; 
        System.out.println("Total de pegadas de carbono do edificio " + nome + " = " + pegadas_carbono + " kg CO2eq");
        
        return pegadas_carbono;
    }

    public double getEmissao_carbono_operacao() {
        return emissao_carbono_operacao;
    }

    public void setEmissao_carbono_operacao(double emissao_carbono_operacao) {
        this.emissao_carbono_operacao = emissao_carbono_operacao;
    }

    public double getEmissao_carbono_construcao() {
        return emissao_carbono_construcao;
    }

    public void setEmissao_carbono_construcao(double emissao_carbono_construcao) {
        this.emissao_carbono_construcao = emissao_carbono_construcao;
    }

    public double getPegadas_carbono() {
        return pegadas_carbono;
    }

    public void setPegadas_carbono(double pegadas_carbono) {
        this.pegadas_carbono = pegadas_carbono;
    }
    
    
}
