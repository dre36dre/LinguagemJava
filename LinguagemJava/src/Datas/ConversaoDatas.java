package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConversaoDatas {

	public static void main(String[] args)  throws ParseException{
		Calendar c= Calendar.getInstance();
		Date data=c.getTime();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: "+sdf.format(data));
		
		//Converte objetos
		System.out.println("Data convertida: " +sdf.parse("28/02/1979"));
	}

}
