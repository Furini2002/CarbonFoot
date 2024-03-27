package carbonfootprint.model;

import carbonfootprint.interfaces.ICarbonFootPrint;

public abstract class Car implements ICarbonFootPrint{
    
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
    

    @Override
    public double getCarbonFootPrint() {
        pegadas_carbono = (consumo_combustivel*fator_emissao) + emissao_carbono_fabricacao;
        
        return pegadas_carbono;
    }
    
}
