package googlePackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TesteGoogle {
	
	private Reuniao reu1;
	private Reuniao reu2;
	private Reuniao reu3;
	private Reuniao reu4;
	private Reuniao reu5;
	private GoogleAgenda google;
	private List <String> names;

	
	@Before
	public void setUp() {
		names = new ArrayList<String>();
		google = new GoogleAgenda();
		names.add("Peter");
		names.add("Jhon");
		names.add("Matthew");
		reu1 = new Reuniao (new Data ((short) 5, (short) 7, (short) 2020, (short) 8, (short) 15), names);
		reu2 = new Reuniao (new Data ((short) 23, (short) 1, (short) 2020, (short) 12, (short) 17), names);
		reu3 = new Reuniao (new Data ((short) 13, (short) 1, (short) 2020, (short) 16, (short) 18), names);
		reu4 = new Reuniao (new Data ((short) 12, (short) 8, (short) 2020, (short) 19, (short) 21), names);
		reu5 = new Reuniao (new Data ((short) 15, (short) 11, (short) 2020, (short) 9, (short) 11), names);

	}

	@Test
	public void testToStringReuniao() {

		String output = "Dia: 5/7/2020\n";
		output += "Horário: 8 até 15\n";
		output += "Participantes: \nPeter\nJhon\nMatthew\n";
		assertEquals(reu1.toString(), output);
		
	}

	
	@Test
	public void testAdicionaReuniao() {
		google.adicionarReuniao(reu1);
		google.adicionarReuniao(reu2);
		assertEquals(2, google.getQuantidadeReunioes());
	}


	@Test
	public void testDuplica(){
		google.adicionarReuniao(reu1);
		google.adicionarReuniao(reu2);
		google.adicionarReuniao(reu3);
		google.adicionarReuniao(reu4);
		google.adicionarReuniao(reu5);
		google.adicionarReuniao(reu1);
		google.adicionarReuniao(reu2);
		google.adicionarReuniao(reu3);
		google.adicionarReuniao(reu4);
		google.adicionarReuniao(reu5);
		assertEquals(10, google.getMeetingSize());
		google.adicionarReuniao(reu2);
		google.adicionarReuniao(reu3);
		google.adicionarReuniao(reu4);
		google.adicionarReuniao(reu5);
		google.adicionarReuniao(reu1);
		assertEquals(20, google.getMeetingSize());
	}
	
	@Test
	public void testGetReunioesDia() {

		google.adicionarReuniao(reu1);
		google.adicionarReuniao(reu2);
		google.adicionarReuniao(reu3);
		google.adicionarReuniao(reu4);
		google.adicionarReuniao(reu5);
		google.adicionarReuniao(reu1);
		google.adicionarReuniao(reu2);
		google.adicionarReuniao(reu3);
		google.adicionarReuniao(reu4);
		google.adicionarReuniao(reu5);
		
		for(Reuniao r: google.getReunioesDia(new Data ((short) 23, (short) 1, (short) 2020, (short) 12, (short) 17))) {
			assertEquals(23, r.getData().getDia());
			};
	
	}
	
	
	@Test
	public void testGetReuniaoMaisLonga() {

		google.adicionarReuniao(reu1);
		google.adicionarReuniao(reu2);
		google.adicionarReuniao(reu3);
		google.adicionarReuniao(reu4);
		google.adicionarReuniao(reu5);
		google.adicionarReuniao(reu1);
		google.adicionarReuniao(reu2);
		google.adicionarReuniao(reu3);
		google.adicionarReuniao(reu4);
		google.adicionarReuniao(reu5);
		assertEquals(reu1, google.getReuniaoMaisLonga());

	}
	
	@Test
	public void TesteRemoverParticipante() {

		google.adicionarReuniao(reu1);
		google.adicionarReuniao(reu2);
		google.adicionarReuniao(reu3);
		google.adicionarReuniao(reu4);
		google.adicionarReuniao(reu5);
		google.adicionarReuniao(reu1);
		google.adicionarReuniao(reu2);
		google.adicionarReuniao(reu3);
		google.adicionarReuniao(reu4);
		google.adicionarReuniao(reu5);
		google.removerParticipante("Peter");
		assertEquals(2,reu1.getParticipantes().size());
	}
}
