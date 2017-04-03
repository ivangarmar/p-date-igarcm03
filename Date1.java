public class Date {

	private int dia;
	private int mes;
	private int año;
	
	public Date  (int dia, int mes, int año){
		
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	
	}
	
	public int getDia(int dia) {
		
		return dia;
	}

	public void setDia(int dia) {
		
		this.dia = dia;
	}

	public int getMes(int mes) {
		
		return mes;
	}

	public void setMes(int mes) {
		
		this.mes = mes;
	}

	public int getAño(int año) {
		
		return año;
	}

	public void setAño(int año) {
		
		this.año = año;
	}

	boolean isSameDay (int dia){
		
		if (this.dia == dia){
			
			return true;
		}else{
			return false;
		}
	}
	
	boolean isSameMonth (int mes){
		
		if(this.mes == mes){
			
			return true;
		}else{
			return false;
		}
	}
	
	boolean isSameYear (int año){
		
		if (this.año == año){
			return true;
		}else{
			return false;
		}
	}
	
		
	boolean isSameDay1 (int dia){
		return (this.dia == dia);;
	}
	
	boolean isSameMonth1 (int mes){
		return (this.mes == mes);;
	}
	
	boolean isSameYear1 (int año) {
		return (this.año == año);;
	}
	
	public String ElegirMes (int mes){
		
		String mes = "";
		
		switch(mes){
		
		case 1: mes = "Enero";
		
			break;
		
		case 2: mes = "Febrero";
			break;
		
		case 3: mes = "Marzo";
		
			break;
		
		case 4: mes = "Abril";
			
			break;
		
		case 5: mes = "Mayo";
		
			break;
		
		case 6: mes = "Junio";
			
			break;
		
		case 7: mes = "Julio";
		
			break;
		
		case 8: mes = "Agosto";
			
			break;
 		
 		case 9: mes = "Septiembre";
		
			break;
		
		case 10: mes = "Octubre";
		
			break;
		
		case 11: mes = "Noviembre";
		
			break;
		
		case 12: mes = "Diciembre";
		
			break;
		}
		
		return mes;
	}
	
	

	
	public String Estaciones(){
		
		String Valido = "";
		
		switch(this.mes){
		
		case 1: Valido = "Invierno";
			
			break;
		
		case 2: Valido = "Invierno";
			
			break;
		
		case 3: if(this.dia<21){
					
					Valido = "Invierno";
				}
				
				else {
					Valido = "Primavera";
				}
			break;
		
		case 4: Valido = "Primavera";
			
			break;
		
		case 5: Valido = "Primavera";
			
			break;
		
		case 6: if(this.dia<21){
					
					Valido ="Primavera";
				}
				
				else {
					Valido = "Verano";
				}
			break;
		
		case 7: Valido = "Verano";
			
			break;
		
		case 8: Valido = "Verano";
			
			break;
		
		case 9: if(this.dia<23){
					
					Valido = "Verano";
				}
				
				else {
					Valido = "Otoño";
				}
			break;
		
		case 10: Valido = "Otoño";
			
			break;
		
		case 11: Valido = "Otoño";
			
			break;
		
		case 12: if(this.dia<21){
					
					Valido = "Otoño";
				}
				
				else {
					Valido = "Invierno";
				}
			break;
			
		}
		
		return Valido;
	}
	
	
	public int Meses() {
		
		int mes1;
		int i;
		mes1 = 0;
		
		for (i = mes1 ; i < 12; i++){
			 mes = mes +1;
		}
		
		return mes;
	}
	

	public int DiasMes (int mes){
		
		int numerodias;
		numerodias = 0;
		
		switch(mes){
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numerodias = 31;
			
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			
			numerodias = 30;
			
			break;
		
		case 2:
			numerodias = 28;
			
		}
		
		return numerodias;
	}
	
	public String toString (){
		
		String dia = Integer.toString(this.dia);
		String mes = Integer.toString(this.mes);
		String año = Integer.toString(this.año);
		
		String printFecha = dia+" "+mes+" "+año;
		
		return printFecha;
	}

//Fallo Date num	
         /* public String DiasFaltan(){
		
		int dia;
		dia = 0;
		
		int dia1;
		dia1 = DiasFaltan (mes);
		
		int i;
		
		for(i = day; i <= dia ; i++){
			
			Date num = new Date (dia , mes, año);
		
		}	
		
		return num;
		
	} */
	public String DiasMes1(){
		
		String fecha = "";
		
		int i;
		
		for(i=this.dia;i<=DiasMes(this.mes);i++){
			
			fecha = fecha + toString();
			this.dia++;
		}
		
		return fecha;
	}
	public int DiasAño(){
		
		int mes;
		mes = 13 - DiasMes1(this.mes);
		int dias;
		dias = 0;
		
		int i;
		
		for(i=1;i<=numeromeses;i++){
			if(i==numeromeses){
				dias = dias +this.dia;
			}
			
			else {
			
			dias += DiasMes(i);
			}
			
		}
		return dias;
	}
	
	
	boolean DiaValido (int dia, int mes){
		
		int domingo;
		
		domingio = getDias (mes);
		
		if(dia > 1 && dia < domingo ){
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public String MesValido(){
		
		String Valido = "Válido";
		
		int dias = MesValido(this.mes);
		
		switch(dias){
		
		case 28: if (this.dia>dias){Valido = "NO Valido";}
		
		case 30: if(this.dia>dias){Valido = "NO Valido";}
		
		case 31: if(this.dia>dias){Valido = "NO Valido";}
		
		}
		
		return Valido;
	}
	
}
