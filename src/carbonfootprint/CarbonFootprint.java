package carbonfootprint;

import carbonfootprint.interfaces.ICarbonFootPrint;
import carbonfootprint.model.Bicycle;
import carbonfootprint.model.Building;
import carbonfootprint.model.Car;

public class CarbonFootprint {
    public static void main(String[] args) {
       
        Bicycle caloi = new Bicycle("Caloi");
        caloi.setEmissao_carbono_fabricacao(20.0);
        caloi.setEmissao_carbono_transporte(87.2);
        
        Car corolla = new Car("Corolla");
        corolla.setConsumo_combustivel(63.3);
        corolla.setEmissao_carbono_fabricacao(20.3);
        corolla.setFator_emissao(32.0);
        corolla.setTipo_combustivel("gasolina");
        
        Building avenidabrasil =  new Building("Avenida Brasil");
        avenidabrasil.setEmissao_carbono_construcao(63.2);
        avenidabrasil.setEmissao_carbono_operacao(96.0);
        
        ICarbonFootPrint all[] = new ICarbonFootPrint[3];
        all[0] = caloi;
        all[1] = corolla;
        all[2] = avenidabrasil;
        
        for (int i = 0; i < 3; i++) {
            all[i].getCarbonFootPrint();            
        }
        
        
        
        
        
        
    }
}
