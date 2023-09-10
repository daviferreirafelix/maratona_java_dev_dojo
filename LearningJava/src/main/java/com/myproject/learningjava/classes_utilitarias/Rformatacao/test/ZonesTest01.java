package com.myproject.learningjava.classes_utilitarias.Rformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Set;

public class ZonesTest01 {
	public static void main(String[] args) {
		/*
		 * Existe um conjunto de classes para manipulação e obtenção de zonas, datas e
		 * horas ao mesmo tempo, são as ZoneId para zonas, ZonedDateTime, que se refere
		 * a uma LocalDateTime "zoneada", ou seja, especifica de uma zona, ZoneOffSet,
		 * que trabalha com as zonas mas baseadas em seus horarios e não nos ID além de
		 * algumas classes para trabalhar com calendários específicos no pacote
		 * java.time, como o japaneseDate para japones
		 */

		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(availableZoneIds);
		System.out.println(ZoneId.systemDefault());
		ZoneId portugal = ZoneId.of("Portugal");
		LocalDateTime now = LocalDateTime.now();
		ZonedDateTime zonedDateTime = now.atZone(portugal);
		System.out.println(zonedDateTime);
		JapaneseDate now1 = JapaneseDate.from(LocalDate.now());
		System.out.println(now1);
	}
}
