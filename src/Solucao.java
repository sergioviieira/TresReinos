import java.util.ArrayList;
public class Solucao {
	//metodo para  questao A
    public int getQtTotal(String recurso, ArrayList<Governante> governantes){
    	int resultado = 0;
    	
    	   	
    	//testar o tipo de recurço
    	switch(recurso) {
    	case "ouro":
    	for (int i = 0; i<governantes.size();i++ ){
    		    resultado = resultado + governantes.get(i).getOuro();
    	}
    		return resultado;
    		
    	case "madeira":
    		for (int i = 0; i<governantes.size();i++){
    			resultado = resultado + governantes.get(i).getMadeira();
    	}
    		return resultado;
    	case "agua":
    		for (int i = 0; i<governantes.size();i++){
    			resultado = resultado + governantes.get(i).getAgua();
    	}
    		return resultado;
    		
    		default:
    			return resultado;
    			
    	
    	}
    	}
    {
    }
    // questao B
      public String getQtFicarVivo(String nomeGovernante, ArrayList<Governante> governantes){
    	  String resultado="";
    	  for (int i =0; i <governantes.size(); i++)
    		  if(governantes.get(i).getNome().equals(nomeGovernante)){
    			  resultado = "Pedido do governante: " + nomeGovernante + "\n" + 
    		                "Ouro: " + governantes.get(i).getPedidoOuro() + "\n" +
    			            "Madeira: " + governantes.get(i).getPedidoMadeira()+ "\n" +
    			            "Agua: " + governantes.get(i).getPedidoAgua();
    		  }
      
    return resultado;
    }
}	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    

