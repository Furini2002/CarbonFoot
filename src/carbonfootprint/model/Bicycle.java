package carbonfootprint.model;

import carbonfootprint.interfaces.ICarbonFootPrint;

public abstract class Bicycle implements ICarbonFootPrint{
    
    // total da emissao de carbono emitido durante a fabricação da bicicleta
    private double emissao_carbono_fabricacao;
    // total da emissao de carbono emitido no transporte dos componentes da bicicleta
    private double emissao_carbono_transporte;
    //armazenar o resultado das pegadas de carbono do objeto
    private double pegadas_carbono;
    
    @Override
    public double getCarbonFootPrint() {
        pegadas_carbono = emissao_carbono_fabricacao + emissao_carbono_transporte;
        
        return pegadas_carbono;       
    }
    
    
}
