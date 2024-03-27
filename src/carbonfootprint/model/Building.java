package carbonfootprint.model;

import carbonfootprint.interfaces.ICarbonFootPrint;

public abstract class Building implements ICarbonFootPrint {
    
    //O quanto de carbono o predio emite para se manter 
    private double emissao_carbono_operacao;
    //O quanto de carbono foi emitido durante sua construção
    private double emissao_carbono_construcao;
    // armazenar o resultado das pegadas de carbono do objeto
    private double pegadas_carbono;

    @Override
    public double getCarbonFootPrint() {
        pegadas_carbono = emissao_carbono_construcao + emissao_carbono_operacao;        
        
        return pegadas_carbono;
    }
}
