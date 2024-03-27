package carbonfootprint.model;

import carbonfootprint.interfaces.ICarbonFootPrint;

public class Building implements ICarbonFootPrint {
    
    private double emissao_carbono_operacao;
    private double emissao_carbono_construcao;

    @Override
    public double getCarbonFootPrint() {
        double pegadas_carbono = emissao_carbono_construcao + emissao_carbono_operacao;        
        
        return pegadas_carbono;
    }
}
