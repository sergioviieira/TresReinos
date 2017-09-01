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
    			            "Madeira: " + governantes.get(i).getPedidoAgua()+ "\n" +
    			            "Agua: " + governantes.get(i).getPedidoMadeira();
    		  }
      
    return resultado;
    }
	



   //questao C
   public int CalcularQntViagem(String nomeGovernante, ArrayList<Governante> governantes){
	   
	   int resultado = 0;
	   for (int i=0; i <governantes.size(); i++) {
		   if (governantes.get(i).getNome().equals(nomeGovernante)) {
			resultado = (governantes.get(i).getPedidoOuro() / 50) +
					(governantes.get(i).getPedidoAgua() / 100) +
					(governantes.get(i).getPedidoMadeira() / 1000) ;
		}
	   }
	   return resultado;
   }
}	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    

