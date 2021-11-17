package org.generation.italy.array;

		public class CibiPreferiti {
			public static void main(String[] args) {
				
				String[] cibiPreferiti = {"Pizza", "Brasato e polenta", "Crispy McBacon", "Tagliata di tonno", "Pasta al Ragù", "Lasagne", "Carpaccio", "Ciambelle", "Biscotti", "Gelato"};
				int lunghezzaArray = cibiPreferiti.length;
				
				System.out.println(lunghezzaArray);
				System.out.println("Il mio cibo top è: " + cibiPreferiti[0]);
				System.out.println("Il mio cibo preferito ma non troppo è: " + cibiPreferiti[(cibiPreferiti.length-1)]);
				
				System.out.println("Il cibo di mezza classifica è: " + cibiPreferiti[(cibiPreferiti.length-1) / 2]);
			}

		}


	


