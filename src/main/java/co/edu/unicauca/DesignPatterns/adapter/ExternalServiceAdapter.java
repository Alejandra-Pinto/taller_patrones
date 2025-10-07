package co.edu.unicauca.DesignPatterns.adapter;
import org.json.JSONObject;

public class ExternalServiceAdapter implements CompanyDataProvider{
    //Referencia al servicio externo
    private ExternalService externalService;
    
    //Constructor parametrizado
    public ExternalServiceAdapter(ExternalService externalService){
        this.externalService = externalService;
    }
    
    
    @Override
    public Company getCompany() {
        //Llamamos al método del servicio externo, es decir, el que obtiene la información en formato JSON
        String jsonData = externalService.getCompanyData();
        
        //Convertimos el JSON en un objeto usable
        JSONObject jsonObject = new JSONObject(jsonData);
        String name = jsonObject.getString("Name");
        String description = jsonObject.getString("Description");
        
        //Creamos y retornamos un objeto Company que el sistema sí entiende
        return new Company (name, description);
    }
    
}
