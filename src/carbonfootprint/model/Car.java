package carbonfootprint.model;

import carbonfootprint.interfaces.ICarbonFootPrint;

public class Car implements ICarbonFootPrint{
    
    // necessario pois depende do tipo o fator de emiissão se altera
    private String tipo_combustivel;
    // quanto o veículo consome de combustivel em uma distancia
    private double consumo_combustivel;
    // quanto de carbono emitido na sua fabricação
    private double emissao_carbono_fabricacao;
    // fator que converte o consumo de combustível em emissões de carbono
    private double fator_emissao;
    // armazenar o resultado das pegadas de carbono do objeto
    private double pegadas_carbono;
    //nome da instancia
    private String nome;
    
    public Car(String nome){        
        this.nome = nome;
        System.out.println("Analisando as pegadas de carbono do carro " + nome);        
    }

    public String getNome() {
        return nome;
    }    
    

    @Override
    public double getCarbonFootPrint() {
        pegadas_carbono = (consumo_combustivel*fator_emissao) + emissao_carbono_fabricacao;
        System.out.println("Total de pegadas de carbono do carro " + nome + " = " + pegadas_carbono + " kg CO2eq");
        
        return pegadas_carbono;
    }

    public String getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(String tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }

    public double getConsumo_combustivel() {
        return consumo_combustivel;
    }

    public void setConsumo_combustivel(double consumo_combustivel) {
        this.consumo_combustivel = consumo_combustivel;
    }

    public double getEmissao_carbono_fabricacao() {
        return emissao_carbono_fabricacao;
    }

    public void setEmissao_carbono_fabricacao(double emissao_carbono_fabricacao) {
        this.emissao_carbono_fabricacao = emissao_carbono_fabricacao;
    }

    public double getFator_emissao() {
        return fator_emissao;
    }

    public void setFator_emissao(double fator_emissao) {
        this.fator_emissao = fator_emissao;
    }

    public double getPegadas_carbono() {
        return pegadas_carbono;
    }

    public void setPegadas_carbono(double pegadas_carbono) {
        this.pegadas_carbono = pegadas_carbono;
    }
    
    
    
}
